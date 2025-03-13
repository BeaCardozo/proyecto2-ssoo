package com.mycompany.proyecto2;

/**
 *
 * @author beacardozo
 */
public class Directory {
    private String name;
    private File[] files; 
    private int fileCount;

    public Directory(String name) {
        this.name = name;
        this.files = new File[10]; 
        this.fileCount = 0;
    }

    public void addFile(File file) {
        if (fileCount < files.length) {
            files[fileCount++] = file; 
        } else {
            System.out.println("No se pueden agregar más archivos a este directorio.");
        }
    }

    public String getName() {
        return name;
    }

    public File[] getFiles() {
        return files;
    }

    // Otros métodos según sea necesario
}

package com.mycompany.proyecto2;

/**
 *
 * @author beacardozo
 */

public class FileSystem {
    private Directory[] directories;
    private File[] files;
    private StorageDisk storageDisk;
    private int fileCount;
    private int dirCount;

    public FileSystem(int totalBlocks, int maxFiles, int maxDirectories) {
        this.directories = new Directory[maxDirectories];
        this.files = new File[maxFiles];
        this.storageDisk = new StorageDisk(totalBlocks);
        this.fileCount = 0;
        this.dirCount = 0;
    }

    public void createFile(String name, int size) {
        if (fileCount < files.length && storageDisk.allocateBlocks(size)) {
            File newFile = new File(name, size, storageDisk.getFirstBlock());
            files[fileCount++] = newFile; // Agregar archivo y aumentar el conteo
        } else {
            System.out.println("Espacio insuficiente o límite de archivos alcanzado.");
        }
    }

    public void deleteFile(String name) {
        for (int i = 0; i < fileCount; i++) {
            if (files[i] != null && files[i].getName().equals(name)) {
                storageDisk.freeBlocks(files[i].getFirstBlock(), files[i].getSize());
                files[i] = null; // Marcar como eliminado
                System.arraycopy(files, i + 1, files, i, fileCount - i - 1); // Shift left
                files[--fileCount] = null; // Disminuir el contador de archivos
                return;
            }
        }
        System.out.println("Archivo no encontrado");
    }

    public void createDirectory(String name) {
        if (dirCount < directories.length) {
            directories[dirCount++] = new Directory(name);
        } else {
            System.out.println("No se puede crear el directorio. Límite alcanzado.");
        }
    }
}


package com.mycompany.proyecto2;

/**
 *
 * @author beacardozo
 */
public class File {
    private String name;
    private int size; 
    private int firstBlock; 

    public File(String name, int size, int firstBlock) {
        this.name = name;
        this.size = size;
        this.firstBlock = firstBlock;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getFirstBlock() {
        return firstBlock;
    }
}

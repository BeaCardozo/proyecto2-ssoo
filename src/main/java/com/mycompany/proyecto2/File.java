package com.mycompany.proyecto2;

import java.awt.Color;

/**
 *
 * @author beacardozo
 */
public class File {
    private String name;
    private int size;
    private int firstBlock; 
    private Color fileColor;

    public File(String name, int size, int firstBlock) {
        this.name = name;
        this.size = size;
        this.firstBlock = firstBlock;
        this.fileColor = new Color((int)(Math.random() * 0x1000000));
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

    public void setName(String name) {
        this.name = name; 
    }

    public void setSize(int size) {
        this.size = size; 
    }

    public void setFirstBlock(int firstBlock) {
        this.firstBlock = firstBlock;
    }
    
    public Color getFileColor() {
        return fileColor;
    }
    
    @Override
    public String toString() {
        return name; 
    }
}

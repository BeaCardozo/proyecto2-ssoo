package com.mycompany.proyecto2;

/**
 *
 * @author beacardozo
 */

public class StorageDisk {
    private int totalBlocks;       
    private boolean[] blocks;     

    public StorageDisk(int totalBlocks) {
        this.totalBlocks = 64; 
        this.blocks = new boolean[totalBlocks]; 
    }

    // Método para obtener el primer bloque libre
    public int getFirstBlock() {
        for (int i = 0; i < totalBlocks; i++) {
            if (!blocks[i]) {
                return i; 
            }
        }
        return -1; 
    }

    // Método para asignar bloques
    public boolean allocateBlocks(int size) {
        int startBlock = getFirstBlock(); 
        
        // Verificar si hay suficiente espacio
        if (startBlock == -1 || startBlock + size > totalBlocks) {
            return false; 
        }
        
        // Asignar bloques
        for (int i = 0; i < size; i++) {
            blocks[startBlock + i] = true; 
        }
        return true;
    }

    // Método para liberar bloques
    public void freeBlocks(int startBlock, int size) {
        for (int i = startBlock; i < startBlock + size; i++) {
            if (i < totalBlocks) {
                blocks[i] = false; 
            }
        }
    }

    // Método para obtener el número de bloques disponibles
    public int getAvailableBlocks() {
        int availableCount = 0;
        for (boolean block : blocks) {
            if (!block) availableCount++; 
        }
        return availableCount;
    }
}

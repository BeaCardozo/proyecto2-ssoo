package com.mycompany.proyecto2;

/**
 *
 * @author beacardozo
 */
public class StorageDisk {
    private int totalBlocks; 
    private boolean[] blocks; 

    public StorageDisk(int totalBlocks) {
        this.totalBlocks = totalBlocks;
        this.blocks = new boolean[totalBlocks]; // Inicializa los bloques como libres
    }

    public boolean allocateBlocks(int size) {
        for (int i = 0; i <= totalBlocks - size; i++) {
            boolean canAllocate = true;
            for (int j = 0; j < size; j++) {
                if (blocks[i + j]) {
                    canAllocate = false;
                    break;
                }
            }
            if (canAllocate) {
                for (int j = 0; j < size; j++) {
                    blocks[i + j] = true; // Marcar bloques como ocupados
                }
                return true;
            }
        }
        return false; // No hay suficiente espacio
    }

    public void freeBlocks(int startBlock, int size) {
        for (int i = startBlock; i < startBlock + size; i++) {
            blocks[i] = false; // Marcar bloques como libres
        }
    }

    public int getFirstBlock() {
        for (int i = 0; i < totalBlocks; i++) {
            if (!blocks[i]) {
                return i; // Encuentra el primer bloque libre
            }
        }
        return -1; // No hay bloques libres
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;
import java.awt.Color;
/**
 *
 * @author Rodrigo
 */
public class Block {
    private int id;          // Identificador único del bloque
    private Block next;      // Referencia al siguiente bloque en la lista enlazada
    private boolean isFree;  // Indica si el bloque está libre o ocupado
    private Color color;     // Color del bloque (para archivos)

    public Block(int id) {
        this.id = id;
        this.isFree = true; // Por defecto, el bloque está libre
        this.color = Color.GREEN; // Por defecto, el color es verde (libre)
        this.next = null;   // No hay siguiente bloque inicialmente
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public Block getNext() {
        return next;
    }

    public void setNext(Block next) {
        this.next = next;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg12.pkg10.pkg23.sistema;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Producto {
    private String codigo;
    private String descrip;
    private Color color;
    private long precio;
    private Date fecha;

    

    public Producto(String codigo, String descrip, Color color, long precio, Date fecha) {
        this.codigo = codigo;
        this.descrip = descrip;
        this.color = color;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo= codigo;
        
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Producto:" + "codigo=" + codigo + ", descrip=" + descrip + ", color=" + color + ", precio=" + precio + ", fecha=" + fecha;
    }
    
    
    
}

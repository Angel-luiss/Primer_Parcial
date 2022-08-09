/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Vehiculo {
   
    private String color, año, marca, combustible;

    public Vehiculo(String color, String año, String marca, String combustible) {
        this.color = color;
        this.año = año;
        this.marca = marca;
        this.combustible = combustible;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    protected void agregar(){}
    protected void modificar(){}
    protected void eliminar(){}
   
}

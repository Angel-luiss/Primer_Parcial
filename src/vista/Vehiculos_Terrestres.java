/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Vehiculos_Terrestres extends Vehiculo {
    private String llantas,capon,fabricante,ventanas;

    public Vehiculos_Terrestres(String llantas, String capon, String fabricante, String ventanas, String color, String año, String marca, String combustible) {
        super(color, año, marca, combustible);
        this.llantas = llantas;
        this.capon = capon;
        this.fabricante = fabricante;
        this.ventanas = ventanas;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getCapon() {
        return capon;
    }

    public void setCapon(String capon) {
        this.capon = capon;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }
    
    @Override
    protected void agregar(){
    System.out.println("Llantas" + this.getLlantas());
    System.out.println("Capon" + this.getCapon());
    System.out.println("Fabricante" + this.getFabricante());
    System.out.println("Ventanas" + this.getVentanas());
    System.out.println("Color" + this.getColor());
    System.out.println("Año" + this.getAño());
    System.out.println("Marca" + this.getMarca());
    System.out.println("Combustible" + this.getCombustible());
    }
    
    
}

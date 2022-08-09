/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Vehiculos_aereos extends Vehiculo {
    private String alas,motores,butaca,helices;

    public Vehiculos_aereos(String alas, String motores, String butaca, String helices, String color, String año, String marca, String combustible) {
        super(color, año, marca, combustible);
        this.alas = alas;
        this.motores = motores;
        this.butaca = butaca;
        this.helices = helices;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getMotores() {
        return motores;
    }

    public void setMotores(String motores) {
        this.motores = motores;
    }

    public String getButaca() {
        return butaca;
    }

    public void setButaca(String butaca) {
        this.butaca = butaca;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }
    
     @Override
    protected void agregar(){
    System.out.println("Alas" + this.getAlas());
    System.out.println("Motores" + this.getMotores());
    System.out.println("Butaca" + this.getButaca());
    System.out.println("Helices" + this.getHelices());
    System.out.println("Color" + this.getColor());
    System.out.println("Año" + this.getAño());
    System.out.println("Marca" + this.getMarca());
    System.out.println("Combustible" + this.getCombustible());
    }
    
    
}

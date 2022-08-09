/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Automovil extends Vehiculos_Terrestres {
    private String retrovisores, parabrisas, el_motor, frenos_de_mano, faja;

    public Automovil(String retrovisores, String parabrisas, String el_motor, String frenos_de_mano, String faja, String llantas, String capon, String fabricante, String ventanas, String color, String año, String marca, String combustible) {
        super(llantas, capon, fabricante, ventanas, color, año, marca, combustible);
        this.retrovisores = retrovisores;
        this.parabrisas = parabrisas;
        this.el_motor = el_motor;
        this.frenos_de_mano = frenos_de_mano;
        this.faja = faja;
    }

    public String getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(String retrovisores) {
        this.retrovisores = retrovisores;
    }

    public String getParabrisas() {
        return parabrisas;
    }

    public void setParabrisas(String parabrisas) {
        this.parabrisas = parabrisas;
    }

    public String getEl_motor() {
        return el_motor;
    }

    public void setEl_motor(String el_motor) {
        this.el_motor = el_motor;
    }

    public String getFrenos_de_mano() {
        return frenos_de_mano;
    }

    public void setFrenos_de_mano(String frenos_de_mano) {
        this.frenos_de_mano = frenos_de_mano;
    }

    public String getFaja() {
        return faja;
    }

    public void setFaja(String faja) {
        this.faja = faja;
    }
    
    @Override
    //Retrovisores, Parabrisas, El_motor, Frenos_de_mano, Faja;
    protected void agregar(){
    System.out.println("Retrovisores" + this.getRetrovisores());
    System.out.println("Parabrisas" + this.getParabrisas());
    System.out.println("El_motor" + this.getEl_motor());
    System.out.println("Frenos_de_mano" + this.getFrenos_de_mano());
    System.out.println("Faja" + this.getFaja());
    System.out.println("Color" + this.getColor());
    System.out.println("Año" + this.getAño());
    System.out.println("Marca" + this.getMarca());
    System.out.println("Combustible" + this.getCombustible());
    }

    
}

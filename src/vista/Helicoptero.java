/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Helicoptero extends Vehiculos_aereos {
    private String compartimiento_de_pasajeros,cabina_piloto,transmission,helice,pylon;

    public Helicoptero(String compartimiento_de_pasajeros, String cabina_piloto, String transmission, String helice, String pylon, String alas, String motores, String butaca, String helices, String color, String año, String marca, String combustible) {
        super(alas, motores, butaca, helices, color, año, marca, combustible);
        this.compartimiento_de_pasajeros = compartimiento_de_pasajeros;
        this.cabina_piloto = cabina_piloto;
        this.transmission = transmission;
        this.helice = helice;
        this.pylon = pylon;
    }

    public String getCompartimiento_de_pasajeros() {
        return compartimiento_de_pasajeros;
    }

    public void setCompartimiento_de_pasajeros(String compartimiento_de_pasajeros) {
        this.compartimiento_de_pasajeros = compartimiento_de_pasajeros;
    }

    public String getCabina_piloto() {
        return cabina_piloto;
    }

    public void setCabina_piloto(String cabina_piloto) {
        this.cabina_piloto = cabina_piloto;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }

    public String getPylon() {
        return pylon;
    }

    public void setPylon(String pylon) {
        this.pylon = pylon;
    }
    
     @Override
    protected void agregar(){
    System.out.println("Compartimiento_de_pasajeros" + this.getCompartimiento_de_pasajeros());
    System.out.println("Cabina_piloto" + this.getCabina_piloto());
    System.out.println("Transmission" + this.getAlas());
    System.out.println("Helice" + this.getAlas());
    System.out.println("Pylon" + this.getPylon());
    System.out.println("Alas" + this.getAlas());
    System.out.println("Motores" + this.getMotores());
    System.out.println("Butaca" + this.getButaca());
    System.out.println("Helices" + this.getHelices());
    }
}

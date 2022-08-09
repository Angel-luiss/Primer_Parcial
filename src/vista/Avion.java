/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Avion extends Vehiculos_aereos {
    private String sistema_universal,tren_aterrizaje,alerones,cabina;

    public Avion(String sistema_universal, String tren_aterrizaje, String alerones, String cabina, String alas, String motores, String butaca, String helices, String color, String año, String marca, String combustible) {
        super(alas, motores, butaca, helices, color, año, marca, combustible);
        this.sistema_universal = sistema_universal;
        this.tren_aterrizaje = tren_aterrizaje;
        this.alerones = alerones;
        this.cabina = cabina;
    }

    public String getSistema_universal() {
        return sistema_universal;
    }

    public void setSistema_universal(String sistema_universal) {
        this.sistema_universal = sistema_universal;
    }

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getAlerones() {
        return alerones;
    }

    public void setAlerones(String alerones) {
        this.alerones = alerones;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }
    
      @Override
      //Sistema_universal,Tren_aterrizaje,Alerones,Cabina;
    protected void agregar(){
    System.out.println("Sistema_universal" + this.getSistema_universal());
    System.out.println("Tren_aterrizaje" + this.getTren_aterrizaje());
    System.out.println("Alerones" + this.getAlerones());
    System.out.println("Cabina" + this.getCabina());
    System.out.println("Alas" + this.getAlas());
    System.out.println("Motores" + this.getMotores());
    System.out.println("Butaca" + this.getButaca());
    System.out.println("Helices" + this.getHelices());
    }

    
}

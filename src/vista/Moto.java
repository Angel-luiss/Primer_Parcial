/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author angeltucubal
 */
public class Moto extends Vehiculos_Terrestres {
    private String timon, chasis, neumatico, frenos, cadenas;

    public Moto(String timon, String chasis, String neumatico, String frenos, String cadenas, String llantas, String capon, String fabricante, String ventanas, String color, String año, String marca, String combustible) {
        super(llantas, capon, fabricante, ventanas, color, año, marca, combustible);
        this.timon = timon;
        this.chasis = chasis;
        this.neumatico = neumatico;
        this.frenos = frenos;
        this.cadenas = cadenas;
    }

    public String getTimon() {
        return timon;
    }

    public void setTimon(String timon) {
        this.timon = timon;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(String neumatico) {
        this.neumatico = neumatico;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getCadenas() {
        return cadenas;
    }

    public void setCadenas(String cadenas) {
        this.cadenas = cadenas;
    }
    
    @Override
    protected void agregar(){
    System.out.println("Timon" + this.getTimon());
    System.out.println("Chasis" + this.getChasis());
    System.out.println("Neumatico" + this.getNeumatico());
    System.out.println("Frenos" + this.getFrenos());
    System.out.println("Cadenas" + this.getCadenas());
    System.out.println("Color" + this.getColor());
    System.out.println("Año" + this.getAño());
    System.out.println("Marca" + this.getMarca());
    System.out.println("Combustible" + this.getCombustible());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author SergioQuijada
 */
public class Vivienda {

    /**
    * @param precio. Valor real que determina el precio de la vivienda
    * @param numHabitaciones. Valor entero que determina el numero de habitaciones
    * @param superficie. Valor real que determina la superficie de la vivienda
    * @param parking. Valor de tipo booleano que indica si dispone de parking o no
    * @param estado. String que determina en que estado se encuentra la vivienda
    * @param propietario. String que determina el propietario de la vivienda
    */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
    /**
     * @return Nos devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio. Valor real que determina el precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Nos devuelve el numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones. Valor entero que determina el numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return Nos devuelve la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie. Valor real que determina la superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return Nos devuelve si tiene parking o no
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking. Valor de tipo booleano que indica si dispone de parking o no
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return Nos devuelve el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado. String que determina en que estado se encuentra la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return Nos devuelve el propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario. String que determina el propietario de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
    public Vivienda (double precio)
    {
        /*Construsctor indicando precio*/
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        /*Metodo que nos devuelve el precio con el descuento.*/
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}

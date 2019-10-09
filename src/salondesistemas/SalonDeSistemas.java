 package SalonDeSistemas;

import java.util.Date;

public class SalonDeSistemas {

    private Date fechaDeCompra;    
    private int numeroDeSillas;
    private int numeroDePuertas;
    private String modelo;
    private boolean tieneAire;

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public int getNumeroDeSillas() {
        return numeroDeSillas;
    }

    public void setNumeroDeSillas(int numeroDeSillas) {
        this.numeroDeSillas = numeroDeSillas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }

    
    public void comprarPuertas() {
        this.numeroDePuertas += 1;

    }

    public void comprarPuertas(int nuevonumeroDePuertas) {
        if (nuevonumeroDePuertas <= this.numeroDePuertas) {
            System.out.println("El Salon no tiene puertas");
        } else {
            this.numeroDePuertas = nuevonumeroDePuertas;
            System.out.println("Nuevas puertas: "
                    + String.valueOf(nuevonumeroDePuertas) + " madera");
        }
        
      }
}
package salondesistemas;

import java.util.Date;

public class Cafeteria extends SalonDeSistemas {
     private Date fechaDeInauguracion;
     private int cantidadDeHamburguesas;
     private boolean tieneChoclitos;

    public Cafeteria(Date fechaDeInauguracion, int cantidadDeHamburguesas, boolean tieneChoclitos) {
        this.fechaDeInauguracion = fechaDeInauguracion;
        this.cantidadDeHamburguesas = cantidadDeHamburguesas;
        this.tieneChoclitos = tieneChoclitos;
    }
     
     
     public void comprarChoclitos(){
        this.tieneChoclitos = true;
       
    }
    
    public void comprarChoclitos(int consumo){
        this.tieneChoclitos = true;
        this.cantidadDeHamburguesas += consumo;
    }
    public int getCantidadDeHamburguesas(){
         
         return cantidadDeHamburguesas;
     }
     
     public void setCantidadDeHamburguesas(int cantidadDeHamburguesas){
         this.cantidadDeHamburguesas = cantidadDeHamburguesas;
         
     }

    public Date getFechaDeInauguracion() {
        return fechaDeInauguracion;
    }

    public void setFechaDeInauguracion(Date fechaDeInauguracion) {
        this.fechaDeInauguracion = fechaDeInauguracion;
    }

    public boolean isTieneChoclitos() {
        return tieneChoclitos;
    }

    public void setTieneChoclitos(boolean tieneChoclitos) {
        this.tieneChoclitos = tieneChoclitos;
    }
     
}

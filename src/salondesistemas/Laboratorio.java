
package salondesistemas;


public class Laboratorio {
    private String nombreDeCientificos;
    private boolean tinePipetas;
    private int cantidadDeTubosDeEnsayo;

    public Laboratorio(String nombreDeCientificos, boolean tinePipetas, int cantidadDeTubosDeEnsayo) {
        this.nombreDeCientificos = nombreDeCientificos;
        this.tinePipetas = tinePipetas;
        this.cantidadDeTubosDeEnsayo = cantidadDeTubosDeEnsayo;
    }
    
    
    public void renombrarnombreDeCientificos(String nuevoNombre){
        this.nombreDeCientificos = nuevoNombre;
       
    }
    
    public void renombrarnombreDeCientificos(String nuevoNombre, String especialidad){
        this.nombreDeCientificos = nuevoNombre + " de " + especialidad;
    }
    
      public int getCantidadDeTubosDeEnsayo(){
         
         return cantidadDeTubosDeEnsayo;
     }
     
     public void setCantidadDeTubosDeEnsayo(int cantidadDeTubosDeEnsayo){
         this.cantidadDeTubosDeEnsayo = cantidadDeTubosDeEnsayo;
     }
     
    public String getNombreDeCientificos() {
        return nombreDeCientificos;
    }

    public void setNombreDeCientificos(String nombreDeCientificos) {
        this.nombreDeCientificos = nombreDeCientificos;
    }

    public boolean isTinePipetas() {
        return tinePipetas;
    }

    public void setTinePipetas(boolean tinePipetas) {
        this.tinePipetas = tinePipetas;
    
    }
}

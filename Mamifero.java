
package leccion.Herencia;




public class Mamifero extends Animal {
   private double tiempogestacion;
   private double sangrecaleinte;

    public Mamifero(double tamaño, String tipo, Double peso, String habitad, String especie, String nombre) {
        super(tamaño, tipo, peso, habitad, especie, nombre);
    }

   

    public double getTiempogestacion() {
        return tiempogestacion;
    }

    public void setTiempogestacion(double tiempogestacion) {
        this.tiempogestacion = tiempogestacion;
    }

    public double getSangrecaleinte() {
        return sangrecaleinte;
    }

    public void setSangrecaleinte(double sangrecaleinte) {
        this.sangrecaleinte = sangrecaleinte;
    }

    public Mamifero(double tiempogestacion, double sangrecaleinte, double tamaño, String tipo, Double peso, String habitad, String especie, String nombre) {
        super(tamaño, tipo, peso, habitad, especie, nombre);
        this.tiempogestacion = tiempogestacion;
        this.sangrecaleinte = sangrecaleinte;
    }
    
}
    
   


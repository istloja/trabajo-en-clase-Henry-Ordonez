
package leccion.Herencia;

import java.util.Scanner;


public class Animal {
    private double tamaño;
    private String tipo ;
    private Double peso;
    private String habitad;
    private String especie;
    private String nombre;
    private String sangrecaliente;
    boolean informacionanimal;
    public double getTamaño() {
        return tamaño;
    }

    public Animal(double tamaño, String tipo, Double peso, String habitad, String especie, String nombre) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.peso = peso;
        this.habitad = habitad;
        this.especie = especie;
        this.nombre = nombre;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void alimentarse(){
        System.out.println("soy"+nombre+"me aliemento");
    }
    
    public String informacionanimal(){
        Scanner dato= new Scanner(System.in);
        String cadena= "soy un"+nombre+"mi peso es";
        return cadena;  
    }
}

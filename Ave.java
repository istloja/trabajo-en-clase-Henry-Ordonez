
package leccion.Herencia;


public class Ave {
private int numerodehuevos ;
private boolean vuela;

    public Ave(int numerodehuevos, boolean vuela) {
        this.numerodehuevos = numerodehuevos;
        this.vuela = vuela;
    }



    public int getNumerodehuevos() {
        return numerodehuevos;
    }

    public void setNumerodehuevos(int numerodehuevos) {
        this.numerodehuevos = numerodehuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public Ave(int numerodehuevos) {
        this.numerodehuevos = numerodehuevos;
    }

    void alimentarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

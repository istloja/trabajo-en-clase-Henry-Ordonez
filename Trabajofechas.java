
package leccion.Herencia;

import java.util.Date;



public class Trabajofechas {
    public static void main (String [] args ){
        Date fecha= new Date(101,6,18);
        Date fechaActual= new Date ();
        System.out.println(fecha.after(fechaActual));
        System.out.println(fecha.before(fechaActual));
       
        
        
        
        
        
        
        
        
        
        /*System.out.println("year : "+ (fecha.getYear()+1900));
        System.out.println("month:"+(fecha.getMonth()));
        System.out.println("day :"+(fecha.getDay()));*/
        
        
        
    }
}


package leccion.Herencia;


public class ejecutar {

        public static void main(String[]args){
            double tamaño = 0;
            Animal objetoanimal  = new Animal(tamaño, null, tamaño, null, null, null);
            Ave objetoanimal2 = new Ave(2,true);
            double sangrecaleinte;
            Mamifero objetoanimal3 = new Mamifero(tamaño, null, tamaño, null, null, null);
            objetoanimal.alimentarse();
            objetoanimal2.alimentarse();
            objetoanimal3.alimentarse();
            System.out.println(objetoanimal.informacionanimal);
        }
    }


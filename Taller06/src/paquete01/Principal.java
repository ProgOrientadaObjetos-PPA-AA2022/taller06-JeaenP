
package paquete01;

import paquete02.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Ciudad c = new Ciudad("Zaruma", "El Oro");
        int n , m;
        System.out.println("Ingrese cuantos doctores tiene el hospital"); 
        Doctor[] d = new Doctor[4];
        Enfermero[] e = new Enfermero[4];
        Hospital h = new Hospital("HOSPITAL ZARUMA", c, 7, d, e, "Barrio Central");
        
        for (int i = 0; i < d.length; i++) {
            System.out.printf("Ingrese el nombre del doctor %d", i + 1);
            
        }
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Ingrese el nombre del enfermero %d", i + 1);
        }
    }
    
}

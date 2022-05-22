
package paquete02;


public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermero(String n, String e, double s) {
        nombre = n;
        tipo = e;
        sueldo = s;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerTipo(String x) {
        tipo = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}

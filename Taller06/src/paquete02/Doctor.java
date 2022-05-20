
package paquete02;


public class Doctor {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Doctor(String n, String e, double s) {
        nombre = n;
        especialidad = e;
        sueldo = s;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerEspecialidad(String x) {
        especialidad = x;
    }
    
    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}

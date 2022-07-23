/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sueldotrabajadores;

/**
 *
 * @author spart
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String c, String n, String cO, double s, String mS) {
        cedula = c;
        nombres = n;
        correo = cO;
        sueldo = s;
        mesSueldo = mS;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerNombre(String n){
        nombres = n;
    }
    
    public void establecerCorreo(String c){
        correo = c;
    }
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public void establecerMesSueldo(String m){
        mesSueldo = m;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombre(){
        return nombres;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public String obtenerMesSueldo(){
        return mesSueldo;
    }
    
    @Override
    public String toString(){
        return String.format("Cédula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes de sueldo: %s\n",
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());
    }
}

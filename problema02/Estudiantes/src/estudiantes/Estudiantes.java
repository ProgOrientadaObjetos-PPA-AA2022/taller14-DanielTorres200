/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

/**
 *
 * @author spart
 */
public class Estudiantes {

    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiantes(String n, String a, double calf1, double calf2,
            double calf3) {
        nombre = n;
        apellido = a;
        calificacion1 = calf1;
        calificacion2 = calf2;
        calificacion3 = calf3;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCalificacion1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacion2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacion3(double c) {
        calificacion3 = c;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "%s %s\n"
                + "Calificaciones: \n"
                + "%.1f\n"
                + "%.1f\n"
                + "%.1f\n"
                + "promedio\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
}

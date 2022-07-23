/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiantes;

/**
 *
 * @author spart
 */
public class Ejecutor {

    public static void main(String[] args) {
        Enlace c = new Enlace();
        double suma;
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            suma = 0;
            suma = c.obtenerDataEstudiante().get(i).obtenerCalificacion1()+c.obtenerDataEstudiante().get(i).obtenerCalificacion2()+ c.obtenerDataEstudiante().get(i).obtenerCalificacion3();
            suma = suma / 3;
            System.out.printf("%s", c.obtenerDataEstudiante().get(i));
            System.out.printf("%.2f\n", suma);
        }
    }
}

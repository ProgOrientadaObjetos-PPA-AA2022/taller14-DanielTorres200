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
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataEstudiante().get(i));
        }
    }
}

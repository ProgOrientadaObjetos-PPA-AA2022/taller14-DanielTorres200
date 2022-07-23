/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldotrabajadores;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author spart
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean bandera = true;
        int opc;
        while (bandera) {
            System.out.print("Menu de Opciones\n"
                    + "1.-Ingresar Trabajador\n2.-Salir\n");
            opc = sc.nextInt();
            if (opc == 1) {
               sc.nextLine();
                Enlace c = new Enlace();
                System.out.println("Ingrese el numero de cedula del Trabajador");
                String cedula = sc.nextLine();
                System.out.println("Ingrese el nombre del Trabajador");
                String nom = sc.nextLine();
                System.out.println("Ingrese el correo del Trabajador");
                String corr = sc.nextLine();
                System.out.println("Ingrese el sueldo del Trabajador");
                double sueld = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el mes del sueldo del Trabajador");
                String mesSuel = sc.nextLine();
                Trabajador trabajador = new Trabajador(cedula, nom, corr, sueld, mesSuel);
                c.insertarTrabajador(trabajador);
            } else {
                if (opc == 2) {
                    bandera = false;
                } else {
                    System.out.println("Valor fuera del rango");
                }
            }
        }
    }
}

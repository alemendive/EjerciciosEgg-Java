/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345;
import java.util.Scanner;

public class G3ejercicioTeoria8 {

    /*
    Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
    0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        while (nota<0 || nota>10) {
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextInt();
        }
            System.out.println("La nota ingresada es correcta");
    }
    
}

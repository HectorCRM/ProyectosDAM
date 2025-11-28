/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tragabolas;
import java.util.Scanner;


/**
 * Clase GestionTragabolas : cotiene los atributos necesarios para interactuar con el usuario y bucles condicionales para crear el tragabolas de un color determinado
 * @author Héctor Monroy Fuertes
 * @since 18-11-2025
 * @version 20-11-2025
 */
public class GestionTragabolas {
    static int opcion; /** Con esta variable manejamos la interacción del usuario con el menú */
    static int maxBolas; /** Variable con la que pasaremos la maxima cantidad de bolas elegida por el usuario al constructor de la clase TragaBolas */
    static boolean exists; /** Esta variable permanece false hasta que el constructor de la clase TragaBolas haya recibido el color correcto y un numero de bolas maximas, despues pasara a true */
    static boolean colorValido; /**Esta variable tiene doble funcionalidad: comprobar que el usuario elije uno de los colores permitidos y a la vez que no ingresa numeros o un espacio */
    static String color; /**Variable con la que pasaremos el color elegido por el usuario al constructor de la clase TragaBolas */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        TragaBolas tragaBolas = new TragaBolas();
        
        System.out.println("*********TRAGA BOLAS********"); //Menu principal, una vez que se haya creado el tragabolas la opcion 1 desaparece
        System.out.println("Menú trabaBolas: \r\n 1-Crear TragaBolas. \r\n 2-Dar de Comer. \r\n 3-Trotar. \r\n 4-Dormir \r\n 5-Ver estado. \r\n 0-Fin.");
        System.out.print("Elige una opción: ");
        opcion=(teclado.nextInt());
        
        while(exists == false){

            teclado.nextLine();
                if(opcion != 1){
                    System.out.println("Opcion no valida, primero hay que crear el tragabolas");
                    System.out.print("Elige de nuevo: ");
                    opcion=teclado.nextInt();
                }
                if(opcion == 1){
                System.out.println("Elige uno de estos colores(azul, amarillo, rojo, verde)");
                color=teclado.next();
                
               if(color.equalsIgnoreCase("azul")){
                   tragaBolas.color = color;
                   colorValido=true;
               }
               else if(color.equalsIgnoreCase("amarillo")){
                   tragaBolas.color = color;
                   colorValido=true;
               }
               else if(color.equalsIgnoreCase("rojo")){
                   tragaBolas.color = color;
                   colorValido=true;
               }
               else if(color.equalsIgnoreCase("verde")){
                   tragaBolas.color= color;
                   colorValido=true;
               }
               else{
                   System.out.println("Color no valido");
               }
               if(colorValido==true){
                System.out.println("Elige cantidad maxima de bolas");
                maxBolas=teclado.nextInt();
                tragaBolas.maxBolas=maxBolas;
                exists=true;
               }
                }
           
            }
        
 
        System.out.println("*********TRAGA BOLAS********");
        System.out.println("Menú trabaBolas: \r\n 2-Dar de Comer. \r\n 3-Trotar. \r\n 4-Dormir \r\n 5-Ver estado. \r\n 0-Fin.");
        System.out.print("Elige una opción: ");
        
        while(exists == true){
        
        opcion=(teclado.nextInt());
        
        switch(opcion){
            case 2:
                tragaBolas.comer();
                break;
            case 3:
                tragaBolas.trotar();
                break;
            case 4:
                tragaBolas.dormir();
                break;
            case 5:
                tragaBolas.visualizar();
                break;
            case 0:
                exists=false;
        }
      }

    }
 }





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tragabolas;

/**
 * Clase TragaBolas cotiene los atributos para crear el tragabolas, los constructores para invocarlo y los metodos para interactuar con el
 * @author Héctor Monroy Fuertes
 * @since 18-11-2025
 * @version 18-11-2025 
 */
public class TragaBolas {
    String color;
    int bolasComidas, maxBolas;
   
    /**
     * Constructor vacio para poder iniciar el juego
     */
   public TragaBolas(){}
   
    /**
     * Constructor para crear el tragabolas, recibe los siguientes parametros
     * @param color: color elegido por el usuario(azul, amarillo, rojo o verde)
     * @param maxBolas: maxima cantidad de bolas que puede comer el tragabolas 
     */
   public TragaBolas(String color, int maxBolas){
        this.color= color;
        this.maxBolas = maxBolas;
    }
   
   /**
    * Este metodo nos permite visualizar el estado del tragabolas(el color elegido, el maximo de bolas y las bolas comidas)
    * 
    */
    public void visualizar(){
        System.out.println("Estado del tragaBolas: \r\n" + "\t -Color-> " + color + "\r\n" + "\t -Bolas comidas-> " + bolasComidas + "\r\n" + "\t -Máxima cantidad de bolas-> " + maxBolas + "\r\n");
    }
    
    /**
     * Este metodo añade una bola a la cantidad de bolas comidas siempre y cuando esta cantidad sea menor que las bolas maximas
     * 
     */
    public void comer(){
        if(bolasComidas < maxBolas){
        bolasComidas= bolasComidas+1;
        System.out.println("He comido una bola");
        }else{
            System.out.println("Estoy lleno");
        }
    }
    
    /**
     * Este metodo resta una bola a bolasComidas si son mayores o iguales a 1 cuando es invocado
     * 
     */
    public void trotar(){
        if(bolasComidas >= 1){
        bolasComidas --;
        System.out.println("Estoy trotando");
        }
    }

/**
 * Este metodo, cuando la cantidad de bolas comidas es igual a la cantidad maxima, divide bolasComidas a la mitad
 * 
 */
    public void dormir(){
        if(bolasComidas == maxBolas){
        bolasComidas = (bolasComidas/2);
        System.out.println("Tripa llena. ZzZ");
        }else{
            System.out.println("No quiero dormir!");
        }
    }
}

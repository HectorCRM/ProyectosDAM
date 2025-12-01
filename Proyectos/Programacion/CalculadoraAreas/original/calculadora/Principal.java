/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 * Clase Principal, contiene el metodo main y utiliza los metodos de la clase Rctangulo
 * @author Héctor Monroy Fuertes
 * @since 17-11-2025
 * @version 17-11-2025
 */
public class Principal {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        Rectangulo forma = new Rectangulo();
        
        System.out.println("***********************************************************************");
        System.out.println("                        CALCULADORA DE AREAS                           ");
        System.out.println("***********************************************************************");
        System.out.print("Introduce la medida de la base por favor: ");
        forma.setBase(teclado.nextFloat());
        System.out.println("De acuerdo!");
        System.out.print("Ahora introduce la medida de la alturua por favor: ");
        forma.setAltura(teclado.nextFloat());
        forma.rectToString(forma.getBase(), forma.getAltura());
        System.out.println("El rectangulo tiene un area de " + forma.getArea(forma.getBase(), forma.getAltura()));
        System.out.println("¿Es un cuadrado? "+ forma.isCuadrado(forma.getBase(), forma.getAltura()));
    }
}
class Rectangulo {
  float base, altura;
    
    public Rectangulo(){  
    }
     
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base = base;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getArea(float base, float altura) {
        return this.base * this.altura;
    } 
    
    public String rectToString(float base, float altura){
        return "El rectangulo tiene una base de "+ this.base + " y una altura de " + this.altura;
    }
    
    public boolean isCuadrado(float base, float altura){
        return this.altura == this.base;
    }
}

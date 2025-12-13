

/**
 * Clase Rectangulo para calcular el área de un rectangulo y comprobar con la medida de la base y la altura si se trata o no de un cuadrado
 * @author Héctor Monroy Fuertes
 * @since 17-11-2025
 * @version 17-11-2025
 */
public class Rectangulo {
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
    /*public float getPerimetro(float base, float altura) {
        return (this.base *2) + (this.altura *2);
    }*/
    
    public String rectToString(float base, float altura){
        return "El rectangulo tiene una base de "+ this.base + " y una altura de " + this.altura;
    }
    
    public boolean isCuadrado(float base, float altura){
        return this.altura == this.base;
    }
}

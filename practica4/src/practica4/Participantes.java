/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Jimena
 */
public class Participantes {
    
    //Este codigo gestiona los datos de corredores de una maraton
    
    //Atributos de los participantes
    private String nombre;
    private int edad;
    private int corredor;
    private double tiempo;
    private String categoria;
    
    //Constructores de los participantes 
    
    public Participantes (String nombre, int edad, int corredor, double tiempo, String categoria){
        this.nombre = nombre;
        this.edad = edad;
        this.corredor = corredor;
        this.tiempo = tiempo;
        this.categoria = categoria; 
    }
    //Encapsuladores de los participantes 

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCorredor() {
        return corredor;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    //Metodos para generar la categoria del participante
    
    private String calcularCategoria (int edad){
        if (edad < 18){
            return "Eres categoria juvenil";
        } else (edad <= 40){
            return "Eres categoria Adulto";
        } else {
            return "Eres categoria master";
                }
       
        }
    
    
    }

    
    
    
    
    
}

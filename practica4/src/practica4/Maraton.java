/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;
import java.util.Scanner; 
/**
 *
 * @author Jimena
 */
public class Maraton {
    
    //Este codigo es para funciones que lleva el registro del maraton 
   
    //Atributos del maraton 
    
    private Participantes participante [];
    private int cantidadparticipantes;
    
    //Instanciar participantes 
    
    public Maraton(){
        participante = new Participantes [100];
        cantidadparticipantes = 0;
    }
    
    //Metodos para algunas de las funcionalidades del programa
    //Codigo para registrar un nuevo participante 
    
    public void registroDeParticipantes (String nombre, int edad, int corredor, double tiempo, String categoria){
        if (cantidadparticipantes >= participante.length){
            System.out.println("Ya llego al limite maximo de participantes");
            
        }
        
        //Codigo para verificar que ningun participante se repita
        for (int i = 0; i < cantidadparticipantes; i++){
            if (Participantes[i].getCorredor ()== corredor){
                System.out.println("El numero de participante ya esta registrado.Intente con otro nombre");
                return;
            }
            
            
        }
      
        
    
        
        
    }
    
   
    
    
}

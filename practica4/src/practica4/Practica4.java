/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

/**
 *
 * @author Jimena
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Este codigo lleva las demas funciones de la maraton
        //Instanciar la clase maraton 
        Maraton maraton = new Maraton();
        Scanner scanner = new scanner(System.in);

        //Este es el codigo para crear el menu principal de la maraton
        maraton.generarlistado();

        int opcion;
        do {
            System.out.println("Eliga la opcion de la cual desea ingresae:");
            System.out.println("1) Registrar un nuevo participante");
            System.out.println("2) Busqueda del participante por numero ");
            System.out.println("3) Listado de participantes");
            System.out.println("4) Eliminar participante");
            System.out.println("5) Salir del sistema...");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                
            }
        }
        
    }

}

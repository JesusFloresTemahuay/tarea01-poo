/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea01.poo;

/**
 *
 * @author jft314
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuitarraElectrica guitarraElectrica
                = new GuitarraElectrica(
                        "Yamaha",
                        6,
                        "Palo Rosa",
                        "Escala Larga");
        
        System.out.println("Guitarra: " + guitarraElectrica);
        guitarraElectrica.activarDistorsion();
        guitarraElectrica.afinar();
        guitarraElectrica.ajustarTono(55);
        guitarraElectrica.ajustarVolumen(80);
        guitarraElectrica.cambiarCuerdas();
        guitarraElectrica.conectarAmplificador();
        guitarraElectrica.rasguear();
        guitarraElectrica.seleccionarPastilla("Puente");
    }

}

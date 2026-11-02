/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01.poo;

/**
 *
 * @author jft314
 */
public class GuitarraElectrica extends Guitarra {

    public GuitarraElectrica() {
    }

    public GuitarraElectrica(
            String marca,
            Integer numeroCuerdas, 
            String materiaFabricacion, 
            String escala) {
        super(marca, 
                numeroCuerdas, 
                materiaFabricacion, 
                escala);
    }
    
    @Override
    public void afinar() {
        System.out.println("Bienvendo al asistente de afinacion, aqui puede"
                + " seleccionar que afinacion necesita aplicar a la guitarra.");
    }

    @Override
    public void tocarNota(String nota) {
        System.out.println("Se Tocara la nota: " + nota);
    }

    @Override
    public void tocarAcorde(String acorde) {
        System.out.println("Se tocara el acorde: " + acorde);
    }

    @Override
    public void rasguear() {
        System.out.println("Se rasguea las cuerdas.");
    }

    @Override
    public void cambiarCuerdas() {
        System.out.println("Se deben cambiar las cuerdas como "
                + "mantenimiento critico, Si! todas!");
    }

    public void ajustarVolumen(int nivel) {
        System.out.println("Ajustando nivel al valor: " + String.valueOf(nivel));
    }

    public void ajustarTono(int nivel) {
        System.out.println("Ajustando el tono al valor: " + String.valueOf(nivel));
    }

    public void seleccionarPastilla(String posicion) {
        System.out.println("Se selecciono la pastilla en la pocicion: " + posicion);
    }

    public void conectarAmplificador() {
        System.out.println("Coneccion exitosa al aplificador. "
                + "Verifique el volumen del mismo antes de continuar");
    }

    public void activarDistorsion() {
        System.out.println("Distorsion Activada correctamente. "
                + "Ajuste Tono y volumen nuevamente");
    }

}

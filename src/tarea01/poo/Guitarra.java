/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01.poo;

/**
 *
 * @author jft314
 */
public abstract class Guitarra implements IGuitarra {

    private String marca;
    private Integer numeroCuerdas;
    private String materiaFabricacion;
    private String escala;

    public Guitarra() {
    }

    public Guitarra(
            String marca,
            Integer numeroCuerdas,
            String materiaFabricacion,
            String escala) {
        this.marca = marca;
        this.numeroCuerdas = numeroCuerdas;
        this.materiaFabricacion = materiaFabricacion;
        this.escala = escala;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the numeroCuerdas
     */
    public Integer getNumeroCuerdas() {
        return numeroCuerdas;
    }

    /**
     * @param numeroCuerdas the numeroCuerdas to set
     */
    public void setNumeroCuerdas(Integer numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    /**
     * @return the materiaFabricacion
     */
    public String getMateriaFabricacion() {
        return materiaFabricacion;
    }

    /**
     * @param materiaFabricacion the materiaFabricacion to set
     */
    public void setMateriaFabricacion(String materiaFabricacion) {
        this.materiaFabricacion = materiaFabricacion;
    }

    /**
     * @return the escala
     */
    public String getEscala() {
        return escala;
    }

    /**
     * @param escala the escala to set
     */
    public void setEscala(String escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s\n", marca).concat(
                String.format("Numero de cuerdas: %d\n", numeroCuerdas).concat(
                String.format("Material de Fabricacion: %s\n", materiaFabricacion).concat(
                String.format("Escala: %s\n", escala))));
    }

}

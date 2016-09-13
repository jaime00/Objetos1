/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jaime
 */
public class Fraccionario {

    private double numerador;
    private double denominador;

    public Fraccionario(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public Fraccionario Suma(Fraccionario f2) {
        double numerador = this.getNumerador() * f2.getDenominador() + this.getDenominador() * f2.getNumerador();
        double denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

    public Fraccionario Restar(Fraccionario f2) {
        double numerador = this.getNumerador() * f2.getDenominador() - this.getDenominador() * f2.getNumerador();
        double denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

    public Fraccionario Multiplicacion(Fraccionario f2) {
        double numerador = this.getNumerador() * f2.getNumerador();
        double denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }
    public Fraccionario Dividir(Fraccionario f2){
        double numerador = this.getNumerador() * f2.getDenominador();
        double denominador = this.getDenominador() * f2.getNumerador();
        Fraccionario f = new Fraccionario(numerador,denominador);
        return f;
    }

}

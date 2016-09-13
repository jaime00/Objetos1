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

    private int numerador;
    private int denominador;

    public Fraccionario(int numerador, int denominador) throws DenominadorCeroExeption {
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            throw new DenominadorCeroExeption();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccionario Suma(Fraccionario f2) throws DenominadorCeroExeption {
        int numerador = this.getNumerador() * f2.getDenominador() + this.getDenominador() * f2.getNumerador();
        int denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

    public Fraccionario Restar(Fraccionario f2) throws DenominadorCeroExeption {
        int numerador = this.getNumerador() * f2.getDenominador() - this.getDenominador() * f2.getNumerador();
        int denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

    public Fraccionario Multiplicacion(Fraccionario f2) throws DenominadorCeroExeption {
        int numerador = this.getNumerador() * f2.getNumerador();
        int denominador = this.getDenominador() * f2.getDenominador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

    public Fraccionario Dividir(Fraccionario f2) throws DenominadorCeroExeption {
        int numerador = this.getNumerador() * f2.getDenominador();
        int denominador = this.getDenominador() * f2.getNumerador();
        Fraccionario f = new Fraccionario(numerador, denominador);
        return f;
    }

}

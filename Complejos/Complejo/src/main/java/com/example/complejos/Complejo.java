package com.example.complejos;

/** Clase que representa un número complejo. */
class Complejo {
    //Declaración de atributos
    protected double real, imaginario;

    //Declaración de constructor
    /** Constructor del método Complejo
     * @param real Valor real
     * @param imaginario Valor imaginario
     */
    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }

    //Declaración de métodos
    //Métodos GET

    /** Obtiene el valor del atributo Real
     * @return double Real
     */
    public double getReal() {
        return real;
    }

    /** Obtiene el valor del atributo Imaginario
     * @return double Imaginario
     */
    public double getImaginario() {
        return imaginario;
    }

    //Métodos SET

    /** Establece el valor del atributo Real
     * @param real Valor real
     */
    public void setReal(double real) {
        this.real = real;
    }

    /** Establece el valor del atributo Imaginario
     * @param imaginario Valor imaginario
     */
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    //Otros métodos
    /** Transcribe el complejo a String.
     * @return string con la parte entera y la imaginaria
     */
    public String toString() {
        return real + "+"+ imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */
    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    /** Suma a Real el double re y a imaginario el double im
     * @param re Valor a sumar a Real
     * @param im Valor a sumar a Imaginario
     */
    public void suma(double re, double im) {
        real = real + re;
        imaginario = imaginario + im;
    }

    /** Suma a Real el double re
     * @param re Valo a sumar a Real
     */
    public void suma(double re) {
        real = real + re;
    }
}
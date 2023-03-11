package com.example.tp_devops_spring;

public class Calculatrice {
    /**
     * add attributes
     */
    private int a;
    private int b;

    /**
     * initialize our variables
     */
    public Calculatrice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * method somme add to variables
     */
    public int somme() {
        return this.a + this.b;
    }

    /**
     * methode soustraction
     */
    public int soustraction() {
        return a - b;
    }

    /**
     * methode multiplication
     */
    public int multuplication() {
        return a * b;
    }

    /**
     * methode that define the greatest val
     */
    public String greatest() {
        if (a > b) return "a";
        else return "b";
    }
}
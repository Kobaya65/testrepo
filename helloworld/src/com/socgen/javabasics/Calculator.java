package com.socgen.javabasics;

public class Calculator {
    private double a;
    private double b;

    // le constructeur, qui permet de passer des parametres
    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;
    }

    public double add() {
	return a + b;
    }

    /**
     * This function provides substraction capability. a + b
     * 
     * @return
     */
    public double substract() {
	return a - b;
    }

    public double multiply() {
	return a * b;
    }

    public double divide() {
	return a / b;
    }
}
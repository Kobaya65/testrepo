package com.socgen.javabasics;

public class TestClass {

    // constructeur
    public TestClass(int tableau[]) {
	for (int i = 0; i < tableau.length; i++)
	    System.out.println("tableau[" + i + "] = " + tableau[i]);
    }
}

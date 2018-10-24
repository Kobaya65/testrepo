package com.socgen.javabasics;

/**
 * @author Administrateur
 *
 */
public class Arrays {

    public static void main(String[] args) {
	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);

	boolean[] bool = new boolean[10];
//	bool[3] = true;
//	if (bool[3]) {
//	    System.out.println(bool[3] + " est VRAI");
//	} else {
//	    System.out.println(bool[3] + " est FAUX");
//	}

	for (int i = 0; i < bool.length; i++) {
	    System.out.println("Index " + i + " = " + bool[i]);
	}

	System.out.println();

	for (int i = bool.length - 1; i >= 0; i--) {
	    System.out.println("Index " + i + " = " + bool[i]);
	}
    }
}

package com.socgen.javabasics;

public class Strings {

    public static void main(String[] args) {
	String hello = "Hello";
	String world = " World!";

	String helloWorld = hello + world;

	System.out.println(helloWorld.toUpperCase() + ", longueur = " + helloWorld.length());
	System.out.println(helloWorld.toLowerCase() + ", longueur = " + helloWorld.length());
    }
}

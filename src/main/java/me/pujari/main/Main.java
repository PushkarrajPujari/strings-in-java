/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.pujari.main;

/**
 *
 * @author pushkarraj pujari
 * @since 02/09/2019
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n ================ String Literal ================ \n");
        stringLiteral();
        System.out.println("\n ================ Strings are immutable ================ \n");
        stringsAreImmutable();
        System.out.println("\n ================ Strings Objeccts ================ \n");
        stringObject();
        System.out.println("\n ================ Strings intering ================ \n");
        stringIntering();
    }

    /**
     * The below if statement will return true as both string handles are
     * pointing to the same reference fo the String in the String pool
     */
    public static void stringLiteral() {
        String stringOne = "pujari";
        String stringTwo = "pujari";
        if (stringOne == stringTwo) {
            System.out.println("Yes both the handles are pointing to the same reference");
            System.out.println("stringOne hashccode = " + stringOne.hashCode());
            System.out.println("stringTwo hashccode = " + stringTwo.hashCode());
        }
    }

    /**
     * In this method we concat two strings and neither of those strings change
     * in fact a third string is created , you can see the hashcode of all three
     * strings are different
     */
    public static void stringsAreImmutable() {
        String firstName = "pushkarraj";
        String lastName = "pujari";
        String fullName = firstName.concat(lastName);
        System.out.println("firstName = " + firstName + " hascode = " + firstName.hashCode());
        System.out.println("lastName = " + lastName + " hascode = " + lastName.hashCode());
        System.out.println("fullName = " + fullName + " hascode = " + fullName.hashCode());
    }

    /**
     * When a String is created using the new key word a new string object gets
     * created and it doesn't point to the object in the String pool
     */
    public static void stringObject() {
        String stringOne = "pujari";
        String stringTwo = new String("pujari");
        String stringThree = new String("pujari");

        /**
         * This will return false
         */
        if (stringOne == stringTwo) {
            System.out.println("Yes it's true");
        } else {
            System.out.println("Oh! it's false");
        }

        /**
         * This will return false
         */
        if (stringTwo == stringThree) {
            System.out.println("Yes it's true");
        } else {
            System.out.println("Oh! it's false");
        }
    }

    /**
     * This is a manual way of adding a String Object into the String pool
     */
    public static void stringIntering() {
        String stringOne = "pujari";
        String stringTwo = new String("pujari");

        /**
         * This will return false
         */
        if (stringOne == stringTwo) {
            System.out.println("yes it's true");
        } else {
            System.out.println("Oh it's false");
        }

        /**
         * This will add the String to the String pool and it will return the
         * reference for the same
         */
        String stringThree = stringTwo.intern();
    
        /**
         * This will return true as stringThree and stringOne are pointing to
         * the same reference of the String in the String Pool
         */
        if (stringThree == stringOne) {
            System.out.println("yes it's true");
        } else {
            System.out.println("Oh it's false");
        }

    }
}

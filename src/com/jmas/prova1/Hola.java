package com.jmas.prova1;

import java.util.Arrays;

public class Hola {
    public static void main(String[] args) {
        System.out.println("Bon dia!!");


        String[] arr = {"Josep", "David", "Lluis"};
        Arrays.asList(arr).forEach(s -> System.out.println("s = " + s));

        int[] num = {1, 2, 3};




/*
        Arrays.asList(num).forEach( i -> System.out.println("i = " + i));
*/
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

//        for (int i : num) {
//            System.out.println("i = " + i);
//        }

    }



}

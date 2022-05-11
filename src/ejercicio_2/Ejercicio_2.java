package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E, A;
        String W, p;
        boolean o = false;

        System.out.println("Ingresar el tamaño del alfabeto");
        E = sc.nextInt();
        String[] alf = new String[E];
        System.out.println("Ingresa el alfabeto");
        for (int i = 0; i < E; i++) {
            p = sc.next();
            if (p.length() == 1) {
                alf[i] = sc.next();
            } else {
                System.out.println("el simbolo que ingreso es invalido");
                i--;
            }
        }
        System.out.print("{");
        for (int i = 0; i < E; i++) {
            System.out.print(alf[i] + " ");
        }
        System.out.print("}");

        System.out.println("\nIngresar el tamaño del lenguaje");
        A = sc.nextInt();
        String[] len = new String[A];

        System.out.println("Ingresa las palabras al lenguaje separados por un espacio");
        for (int i = 0; i < A; i++) {
            p = sc.next();
            if (validarLen(p, alf)) {
                len[i] = sc.next();
            } else {
                System.out.println("NO existe");
                i--;
            }
        }
        System.out.print("{");
        for (String len1 : len) {
            System.out.print(len1 + " ");
        }
        System.out.println("}");

        System.out.println("\nIngresar la palabra");
        W = sc.next();
        for (String len1 : len) {
            if (W.equals(len1)) {
                o = true;
            }
        }
        if (o) {
            System.out.println("Esta dentro del lenguaje");
            System.out.println("Su longitud es de: " + W.length());
        } else {
            System.out.println("No se encuentra dentro del lenguaje");
        }

    }

    public static boolean validarLen(String p, String[] al) {
        for (int i = 0; i < al.length; i++) {
            char alfa = al[i].charAt(i);
            for (int j = 0; j < p.length(); j++) {
                char palabra = p.charAt(j);
                if (palabra != alfa) {
                   return false; 
                }
            }
        }
        return true;
    }
}



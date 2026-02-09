package com.deshmukh.estudio.unidad04Loops;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Ejercicio de la unidad 04
 *
 * @author Usuario
 */
public class ExerciseLoop {

    public static void one() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[2] = new int[3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix[i].length) {
                matrix[i][j] = (i + j);
                System.out.print(matrix[i][j]);
                j++;
            }
            i++;
            System.out.println("");
        }
    }

    public static void two() {
        Scanner s = new Scanner(System.in);
        System.out.println("Indique número primo:");
        double numero = s.nextInt();
        boolean primo = true;
        for (int i = 2; i < numero / 2; i++) {
            double resultado = numero / i;
            if (resultado % 1 == 0) {
                System.out.println("Not Primo");
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Primo");
        }
    }

    public static void three() {

        Scanner s = new Scanner(System.in);
        System.out.println("Indique el número:");
        int numeroUsuario = s.nextInt();

        ArrayList listaPrimos = new ArrayList<>();

        for (int i = 2; i <= numeroUsuario; i++) {
            boolean primo = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                listaPrimos.add(i);
            }
        }
        System.out.println(listaPrimos);
    }

    public static void four() {
        int[] _1D1 = new int[]{1, 2, 3};
        int[][] _2D1 = new int[][]{_1D1};
        int[][] _2D2 = new int[][]{_1D1, _1D1};
        int[][][] _3D = new int[][][]{_2D1, _2D2};

        for (int i = 0; i < _3D.length; i++) {
            for (int j = 0; j < _3D[i].length; j++) {
                for (int k = 0; k < _3D[i][j].length; k++) {
                    System.out.println("Valor de _3D[" + i + "][" + j + "][" + k + "] " + _3D[i][j][k]);
                }
            }
        }

    }

    public static void five(String texto) {
        int contadorEspacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (ch == ' ') {
                contadorEspacios++;
            }
            if (ch == 'x') {
                break;
            }
        }
        System.out.println("contador de espacios: " + contadorEspacios);
    }

    public static void six() {
        String[][] chars = new String[2][];
        chars[0] = new String[1];
        chars[1] = new String[4];
        char cha = 97;

        for (String[] chara : chars) {
            for (String s : chara) {
                s = "" + cha;
                cha++;
                System.out.println(s);
            }
        }
    }
/**
 * Ejercicio para detercar una falla, se creo un foreach para recorrer ambas dimensiones de la matriz
 * El error está en que foreach no permite modificar el valor de la posición, ya que la variable s es una copia temporal
 * NO es una referencia.
 */
    public static void seven() {

        String[][] chars = new String[2][];
        chars[0] = new String[1];
        chars[1] = new String[4];
        char cha = 97;

        for (String[] chara : chars) {
            for (String s : chara) {
                s = "" + cha;
                cha++;
            }
        }
    }
    
    public static void eigth(){
        
        List<String> names = List.of("Monica","Abedul","Taladro","Alicate","Alvion online","Amparo");
        List<String> capturedNames = new ArrayList<>();
        List<String> capturedNamesReverse = new ArrayList<>();
        int contador = 0;
        
        for(String name:names){
            contador++;
            if(contador%2 == 0){
                capturedNames.add(name);
            }
        }
        System.out.println(capturedNames);
        
        //Now on reverse
        for(String nameReverse : names){
            capturedNamesReverse.add(nameReverse);
        }
        Collections.reverse(capturedNamesReverse);
        System.out.println(capturedNamesReverse);
    }
    
    public static void nine(){
        //List<String> arrayOne = List.of("Monica","Abedul","Taladro","Alicate","Alvion online","Amparo");
        //List<String> arrayTwo = List.of("Monica","Abedul","Taladro","Alicate","Alvion online","Amparo");
        String[] arrayOne = new String[]{"Monica","Abedul","Taladro","Alicate","Alvion online","Amparo"};
        String[] arrayTwo = new String[arrayOne.length];

        for(int i=0;i<arrayOne.length;i++){
            arrayTwo[i] = arrayOne[arrayOne.length -1 -i];
        }
        
        for(String obj : arrayTwo){
            String printArray = (String) obj;
            System.out.println(printArray);
        }
        
    }
 
    public static void test() {

    }

}

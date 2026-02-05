package com.deshmukh.estudio.unidad04Loops;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Unidad04Loops {
    /**
     * Métodos de recorrer una lista usando for-each
     * Sintáxis for(Tyoe variableName : array_or_Iterable){
     *     statement(s);
     * }
     */
    public static void enhancedForLoop(){
        
        String[] values = {"a","bb","ccc"};
        for (String value:values){
            System.out.println(value);
        }
        Set s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");
        
        for(Object value :s){
            System.out.println(value);
        }
    }
    
    public static void enhancedLoopTypifiedCollections(){
        List<String> names = List.of("Monica","Abedul","Taladro");
        for(Object obj:names){
            String name = (String) obj;
            System.out.println(name.toUpperCase());
        }
        
        //or
        for(String name:names){
            System.out.println(name.toUpperCase());
        }
    }
    /**
     * En for each no existe una variable de iteración
     */
    
    public static void numberIterationForEach(){
        List<String> names = List.of("Monica","Abedul","Taladro");
        int i = 0;
        for(String name:names){
            i++;
            System.out.println(i+":"+name.toUpperCase());
        }
        System.out.println("La cantidad de nombres es: "+i);
    }
    
    public static void useBreak(){
        String[] names = {"Juan","Jose","Sonia","Patricia"};
        System.out.println("I Will find Sonia:");
        for(int i = 0;i<names.length;i++){
            if("Sonia"==names[i]){
                System.out.println("Catch you! at "+(i+1)+" position of names");
                break;
            }
        }
    }
    /**
     * usando continue sales de la iteración para entrar en el siguiente update
     */
    
    public static void useContinue(){
        String[] names = {"Juan","Jose","Sonia","Patricia"};
        System.out.println("Avoid Sonia jeje");
        for(String str : names){
            if("Sonia".equals(str)){
                System.out.println("...");
                continue;
            }
            System.out.println("Hi "+str);
        }
    }
    
    public static void errorUsingBreakCotinue(){
        String[] names = {"Juan","Jose","Sonia","Patricia"};
        for(String str:names){
            break;
            //System.out.println("I will never see the light, because I'm an unreachable statement");
        }
    }
    
    public static void nestedLoop(){
        
        String[] names = {"Juan","Jose","Sonia","Patricia"};
        for(String str :names){
            int sum = 0;
            
            //Enter to the inner loop
            
            for(int i = 0; i<str.length();i++){
                char ch = str.charAt(i);
                int letterNumber = ch -96;//conver an 'a' to 1, 'b' to 2, and so
                sum = sum+letterNumber;
            }
            
            System.out.println("Lucky number for"+str+" is "+sum);
        }
    
    }
    /**
     * MY_OUTER_LOOP es un label que se le pude dar a un bucle o grupo de bucles para facilitar su manipulación
     */
    public static void breakAllNesterdLoop(){
        String[][] group = {{"Juan","Jose","Sonia","Patricia"},{"Seba","Vivi","Panchi","Paolo"},{"Martina","Josefa","Sophia","Lupe"}};
        System.out.println("Looking for Vivi...");
        MY_OUTER_LOOP :for(int i = 0; i<group.length;i++){
            for(String name:group[i]){
                System.out.println("cheking...");
                if("Vivi".equals(name)){
                    System.out.println("Catch you! at group "+(i+1));
                    break MY_OUTER_LOOP;
                }
            }
        }
    }
    /**
     * Ejercicio realizado mentalmente con h=5 y h=6
     * @param h 
     */
    
    public static void labelNestedLoop(int h){
        int x = 1;
        LOOP1:do{
            LOOP2:for(int y = 1; y<h;y++){
                if(y ==x) continue;
                
                if(x*x + y*y == h*h){
                    System.out.println("Found "+x+" "+y);
                    break LOOP1;
                }
            }
            x++;
        }
        while(x<h);
    }
}

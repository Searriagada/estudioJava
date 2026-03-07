package com.deshmukh.estudio.unidad08Enums;

/**
 *
 * @author Usuario
 */
public class CoinClass {
    public static void main(String[] args) {
        
        //iterate over Coin and prints name and index of each element in Coin
        for(Coin temp : Coin.values()){
            System.out.print("Coinhaving name: "+temp.name());
            System.out.println(" & index: "+temp.ordinal());
        }
        
        //iterate over Coin and prints name, index & magicNumber of each element in Coin
        for(Coin temp : Coin.values()){
            System.out.print("Coinhaving name: "+temp.name());
            System.out.print(" index: "+temp.ordinal());
            System.out.println(" & value: "+temp.getValue());
        }
        
        //static method getCoin, return value given a number
        Coin resultado = Coin.getCoin(34);
        System.out.println("resultado de getCoin(34): "+resultado);
        System.out.println("resultado de getCoin(569): "+Coin.getCoin(569)); 
        
        //Instance method add that takes Coin for argument and returns the sum of their values.
        Coin c1 = Coin.DOLLAR; //value 89
        Coin c2 = Coin.QUARTER; // value 78
        
        System.out.println("La suma de values es: "+c1.add(c2));
        
        //add modificado para devolver el objeto en caso de match y null si no lo hace
        
        //Caso con match
        Coin c3 = Coin.DOLLAR.addTwo(c2); //78+89 = 169 -> DIME
        if(c3 != null){
            System.out.println("c3 object name: " + c3.name());
        }
        //Caso false
        Coin c4 = Coin.PENNY.addTwo(c3); //c3 cambia de DOLLAR a DIME
        System.out.println("c4 es null: " + (c4 == null));
        
        
    }
}

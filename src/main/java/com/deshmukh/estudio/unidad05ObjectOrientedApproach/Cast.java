package com.deshmukh.estudio.unidad05ObjectOrientedApproach;

/**
 *
 * @author Usuario
 */
public class Cast {
    
    public static int casteoInt(double numero){
        int resultado = (int)numero;
        return resultado;
    }
    
    public static int casteoInteger(Float numero){
        int resultado = numero.intValue();
        return resultado;
    }
    
    public static int casteoString(String numero){
        return Integer.parseInt(numero); 
    }
    
    public static void main(String[] args){
        var resultado = Cast.casteoInt(2.5);
        var resultadoDouble = (double)resultado; // casteo explícito
        var resultado2 = Cast.casteoInteger(3.9099f);
        var resultadoFloat = (float)resultado2; // casteo explícito
        var resultado3 = Cast.casteoString("3030");
        var resultadoString = String.valueOf(resultado3);
        System.out.println("resultado int: "+resultadoString+"3030");
        // Boolean es imposible por el tipo de dato.
    }
}

package com.deshmukh.estudio.unidad06Methods;

/**
 *
 * @author Usuario
 */
public class Varargs {
    
    /**
     * Use (1,2,3)
     * instead of (new int[]{1,2,3})
     * when you call the method
     * 
     * un método varargs puede contener UN parámetro varargs (int... parameter)
     * 
     * Si está presente, debe ser el último en ser declarado (String address, int id, int... data)
     */
    public static void normalMatrix(int[] values){
            System.out.println("normalMatrix: "+values.length);
    }
    
    public static void useVarargs(int... values){
        System.out.println("useVarargs: "+values.length);
    }
    
    public static void varargsAndParameters(int x, int...y){
        System.out.println("int parameter: "+x);
        System.out.println("varargs parameter size:"+y.length);
    }
        
}


package com.deshmukh.estudio.unidad06Methods;

/**
 *
 * @author Usuario
 */
public class TestClass {
    
    public static void main (String[] args){
        
        Varargs.normalMatrix(new int[]{1,2,3,4});
        
        Varargs.useVarargs(1,2,3,4,5);
        
        Varargs.useVarargs(); //Se puede pasar cero argumentos y crea un array de tamaño cero
        
        Varargs.varargsAndParameters(1,2,3,4,5,6);// (int x, int...y) = 1 & {2,3,4,5,6}
        
        Varargs.varargsAndParameters(1); //Igualmente funciona int... vacío
       
    }
    
}

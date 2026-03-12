package com.deshmukh.estudio.unidad10UsingOperators;

/**
 *
 * @author Usuario
 */
public class Casting {

    /*
    byte: 1 byte(8 bits) -> -128-127
    short: 2 bytes (16 bites) -> -32.768 - 32.767
    int: 4 byte (32 bits) -> -2^31 - 2^31
    long: 8 bytes (64 bits) -> -2^63 - 2^63
    float: 4 bytes (32 bits) -> Punto flotante de precisión simple
    double: 8 bytes (64 bits) -> Punto flotante de precisión doble
    char: 2 bytes (16 bits) carácter unicode
    boolean: 1 bit
    
    Widdening Casting:
    
    byte -> short -> char -> int -> long -> float -> double
    
    Widening casting is performed automatically by the compiler when converting a smaller type to a larger type 
    because there is no risk of data loss
    
     */

    public static void main(String[] args) {
        int i1 = 1;
        float f1 = i1; // works fine -> int to float
        double i2 = f1; //works fine -> float to double

        int x = (int) f1 + 2;
        //int x2 = f1; no compila porque f1 es un float y no cabe en un int.
        
        double d1 = 2.0;
        float f2 = 2.0f;
        
        //f2 = f2+d1; no compila porque f2+d1 produce double, no cabe en un float
        f2 +=d1; // compila porque equivale a f2 = (double)(f2+d1)
        
        int i = 10;
        Integer I = 10;
        double d = i; //widening int -> double
        d = I; //fine, unboxes Integer -> int, widening int -> double
        // Double d = i; // no compila, requiere widening
        //Double d2 = (Double)i; NO
        Double d2 = (double)i; //YESS, cuando java resuelve Double d2 =... ve un double y lo autoboxea a Double
        
    }

}

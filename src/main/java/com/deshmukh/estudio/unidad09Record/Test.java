package com.deshmukh.estudio.unidad09Record;

/**
 *
 * @author Usuario
 */
public class Test {
    record CurrencyR(String symbol){}
    class CurrencyC{
        private String symbol;
        CurrencyC(String s){
            symbol = s;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new CurrencyR("$").symbol());
    }
}

package com.deshmukh.estudio.unidad08Enums;

/**
 *
 * @author Usuario
 */
enum Coin {
    PENNY(12),
    NICKEL(34),
    DIME(167),
    QUARTER(78),
    DOLLAR(89);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static Coin getCoin(int value) {
        for (Coin temp : Coin.values()) {
            if (temp.value == value) {
                return temp;
            }
        }
        return null;
    }
    
    public int add (Coin coin){
        return this.value + coin.value;
    }
    
    public Coin addTwo(Coin coin){
        int sum = this.value + coin.value;
        
        for(Coin temp : Coin.values()){
            if(sum == temp.value){
                return temp;
            }
        }
        return null;
    }
}

package com.deshmukh.estudio.unidad09Record;

/**
 *
 * Record permite solamente UN constructor, compacto o no-compacto, no ambos.
 * 
 * @author Usuario
 */

// Compact Constructor
public record TestRecord(int number, String name){
    public TestRecord{
    
    }
}
//non-Compact Constructor
/*
public record TestRecord(int number, String name) {
    
    public TestRecord(int number, String name){
        this.number = number; 
        this.name = name;
    }

}
*/



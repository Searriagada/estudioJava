package com.deshmukh.estudio.unidad09Record;

/**
 *Flujo: constructor no-canónico, RecordConstructorExample(id, nombre)
 * permite el método checkId para validar ID y arrojar Exception.
 * también permite usar this para constructor con distintos parámetros.
 * Constructor canónico: RecordConstructorExample(id, nombre, DUMMY)
 * 
 * 
 * @author Usuario
 */
public record RecordConstructorExample (int id, String name, String address) { //Record solo reconoce los fields en el header, se se declara uno en el cuerpo debe ser static y final.
    public RecordConstructorExample(int whatever, String name) throws Exception{ //poco importa el nombre de las variables, importa el orden de los parámetros
        this(checkId(whatever), name.trim(), "DUMMY");
        
        name = "DUMMY"; //se actualiza el parámetro local, no afecta this.name ya que es final y se definió previamente el valor en nane.trim()
    }
    
    private static int checkId(int value){
        if(value<0) throw new IllegalArgumentException("Id inválida");
        return value;
    }
}


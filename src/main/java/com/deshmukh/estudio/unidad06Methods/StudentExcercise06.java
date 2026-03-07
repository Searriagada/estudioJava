package com.deshmukh.estudio.unidad06Methods;
/**
 *
 * @author Usuario
 */
public class StudentExcercise06 {
    
    int studentId; //non static
    String name; //non static
    String address;//non static
    static int classId; 
    
    public StudentExcercise06(int studentId, String name, String address ){
        this.address = address;
        this.name = name;
        this.studentId = studentId;
    }
    
    public StudentExcercise06(){
        this(123,"dummy","dummy");
    }
    
    public void main (String[] args){
        System.out.println("default value of studenId"+studentId);
    }
    
}

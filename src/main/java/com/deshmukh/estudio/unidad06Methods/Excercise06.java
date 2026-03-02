package com.deshmukh.estudio.unidad06Methods;
import com.deshmukh.estudio.unidad04Loops.ExerciseLoop;
import com.deshmukh.estudio.unidad06Methods.StudentExcercise06;

/**
 *
 * @author Usuario
 */
public class Excercise06 {
    
    public int add(int... values){
        int sum = 0;
        for(int v : values){
            sum = sum + v;
        }
        return sum;
    }
    
    public String add(String anyWord, int... values){
         StringBuilder sb = new StringBuilder();
         for(int v : values){
             sb.append(v);
         }
         return sb.toString();
    }
    
    {
        System.out.println("Default static value of classId field: "+StudentExcercise06.classId); 
    }
    
    public void method1(){
        StudentExcercise06 kaiju = new StudentExcercise06();
        StudentExcercise06.classId = 111;
        kaiju.name = "kaiju";
        kaiju.studentId = 1002;
        
        method2(kaiju);
        
        System.out.println("new object name: "+kaiju.name);
    }
    
    public void method2(StudentExcercise06 student){
        student.name="aaaaaaaa!";
        
        student = new StudentExcercise06();
        student.name = "seba";        
    }
    
    public static void main(String[] args){
        Excercise06 a = new Excercise06();
        String addString = a.add("aaaaa", 1,2,3,4);
        System.out.println("add String: "+addString);
        int addInt = a.add(1,2,3,4,5,5);
        System.out.println("add int: "+addInt);
        a.method1();
    }
    
}

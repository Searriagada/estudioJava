package com.deshmukh.estudio.unidad05ObjectOrientedApproach;

/**
 *
 * @author Usuario
 */
public class Unidad05 {
    static{
        System.out.println("Unidad 05");
        /**
         * Try this para probar static e initializer de Employee
         * Employee numberOne = new Employee("Empleado uno",25);
         * Employee numberTwo = new Employee("Empleado dos",30);
         * 
         */
    }
    
    static{
        System.out.println("Nested Types:");
        /**
         * This is valid because there is a Top Class
         * 
         * public class TestClas{
         *  public class C1{}
         *  public static class C2{}
         *  public enum E1{}
         *  public record R(int val){};
         *  public interface I1{}
         * }
         * 
         * This is not:
         * 
         * public class TestClass{
         * 
         * }
         * 
         * public interface TestInterface{
         * 
         * }
         * 
         */
    }
    

}

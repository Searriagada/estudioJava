package com.deshmukh.estudio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Employee {
    
    private static int count = 0; 
    
    static{
        System.out.println("Creando objeto empleado...");
    }
    {
        Employee.count= Employee.count +1;
        System.out.println("Este es el empleado n° "+Employee.count);
    }
    String name, lastName;
    int age, salary;

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary + '}';
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public static void testEmployee(){
        List<Employee> workers = new ArrayList<>();
        Employee firstEmployee = new Employee("The First",20);
        Employee secondEmployee = new Employee("The Second",20);
        
        workers.add(firstEmployee);
        workers.add(secondEmployee);
        
        String listString = String.valueOf(workers);
        System.out.println(listString);
    }
    
    
}

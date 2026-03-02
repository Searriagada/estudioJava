package com.deshmukh.estudio.unidad05ObjectOrientedApproach;

/**
 *
 * @author Usuario
 */
public class TestClass {

    static Bird defaultBird = new Bird(2, "Eagle");
    static Bird defaultBirdTwo = new Bird(1, "Chicken");

    public static void main(String[] args) {

        /* Bird firstBird = new Bird(3,"Pidgeon");
        Bird secondBird = new Bird(4,"Condor");
        
        System.out.println("firstBird: ");
        System.out.println(firstBird.toString());
        System.out.println("defaultBird: ");
        System.out.println(defaultBird.toString());
        System.out.println("Static variable:");
        System.out.println("Animal type: "+Bird.animalType);
        System.out.println("Average feathers: "+Bird.averageFeathers);
        System.out.println("average weigth: "+Bird.averageWeigth);
        System.out.println("bird count: "+Bird.birdCount); 
        
        defaultBirdTwo.setAlive(true);
        defaultBirdTwo.setBinominal("Super Eagle");
        defaultBirdTwo.setWeigth(4);
        defaultBirdTwo.setWings(1);
        
        defaultBird.setWings(defaultBirdTwo.getWings());
        defaultBird.setBinominal(defaultBirdTwo.getBinominal());
        defaultBird.setFeathers(defaultBirdTwo.getFeathers());
        defaultBird.setWeigth(defaultBirdTwo.getWeigth());
        
        System.out.println("defaultBird: "+defaultBird.toString());
        System.out.println("defaultBirdTwo: "+defaultBirdTwo.toString());
        
        defaultBird.fly();
        defaultBirdTwo.fly();
         */
        //defaultBird.pajarito = new Bird(5,"Pajarito");
        float floatLiteral = 10.344f;
        float floatPrimitivo = 11.344f;
        double numeroDouble = 2.5; // No compila
        int numeroInt = 123;// No compila
        Integer intObject = 456;// No compila
        String textoFloat = "123";// No compila

        int resultado = defaultBird.fly(textoFloat);
        System.out.println("numero en int: " + resultado);

    }
}

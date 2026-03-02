package com.deshmukh.estudio.unidad05ObjectOrientedApproach;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Bird {
    
        
    static int birdCount;
    static double averageWeigth;
    static float averageFeathers;
    static String animalType;
    double weigth;
    int wings;
    float feathers;
    boolean alive;
    String binominal;

    @Override
    public String toString() {
        return "Bird{" + "weigth=" + weigth + ", wings=" + wings + ", feathers=" + feathers + ", alive=" + alive + ", binominal=" + binominal + '}';
    }
    
    public Bird(double weigth, String binominal) {
        this.weigth = weigth;
        this.binominal = binominal;
    }


    public static int getBirdCount() {
        return birdCount;
    }

    public static void setBirdCount(int birdCount) {
        Bird.birdCount = birdCount;
    }

    public static double getAverageWeigth() {
        return averageWeigth;
    }

    public static void setAverageWeigth(double averageWeigth) {
        Bird.averageWeigth = averageWeigth;
    }

    public static float getAverageFeathers() {
        return averageFeathers;
    }

    public static void setAverageFeathers(float averageFeathers) {
        Bird.averageFeathers = averageFeathers;
    }

    public static String getAnimalType() {
        return animalType;
    }

    public static void setAnimalType(String animalType) {
        Bird.animalType = animalType;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public float getFeathers() {
        return feathers;
    }

    public void setFeathers(float feathers) {
        this.feathers = feathers;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getBinominal() {
        return binominal;
    }

    public void setBinominal(String binominal) {
        this.binominal = binominal;
    }

    
    public int fly(String numero){
        /*System.out.println("Fly pajarito!");
        System.out.println("Alive: "+this.alive);
        System.out.println("Weigth: "+this.weigth);
        System.out.println("Feathers: "+this.feathers);
        System.out.println("Binominal: "+this.binominal);
        System.out.println("Wings: "+this.wings);
        System.out.println("Count: "+birdCount);
        System.out.println("Average Feathers: "+averageFeathers);
        System.out.println("Average Weigth: "+averageWeigth);
        System.out.println("Animal Type: "+animalType);
        */
        //System.out.println("numero Float: "+numero);
        /**
         * Para double, float
         * int numeroInt = (int)numero;
         */
        
        /**
         * Para Double, Float 
         * int numeroInt = numero.intValue();
         */
        
        /**
         * Para String int numeroInt = Integer.parseInt(numero);
         * En realidad es un valueOf así que no es un cast directo
         */
        int numeroInt = Integer.parseInt(numero);
        return numeroInt;
    }
    
    Bird pajarito;
}

package ru.mirea.gib04.lab2;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(12, "pink");
        System.out.println("Weight ball " + b1.getWeight()
                +", color is " + b1.getColor());
        Ball b2 = new Ball(15, "green");
        System.out.println("Weight ball " +b2.getWeight()
                +", color is " + b2.getColor());
        Ball b3 = new Ball( 18, "azur");
        System.out.println("Weight ball " + b3.getWeight()
                +", color is " + b3.getColor());
    }
}
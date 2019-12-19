package ru.geekbrains.java_one.homework_five;

public class Dog extends Animal {

    public double jump;
    public int sweem;

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void dogInfo() {
        System.out.println("DogName: " + name + "\nLimitRun: " + run + " meters" + "\nLimitSweem: " + sweem + "\nLimitJump: " + jump + " meters");
    }

    public void runing(int runDistance) {
        if (runDistance <= run) System.out.println("Dog ran!");
        else System.out.println("Dog didn't ran!");
    }

    public void sweeming(int sweemDistance) {
        if (sweemDistance <= sweem) System.out.println("Dog swam!");
        else System.out.println("Dog didn't swim!");
    }

    public void jumping(int jumpDistance) {
        if (jumpDistance <= jump) System.out.println("Cat jumped!");
        else System.out.println("Cat did not jump!");
    }


}
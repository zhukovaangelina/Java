package ru.geekbrains.java_one.homework_five;

public class Horse extends Animal {

    public double jump;
    public int sweem;

    public Horse(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void horseInfo() {
        System.out.println("HorseName: " + name + "\nLimitRun: " + run + " meters" + "\nLimitSweem: " + sweem + "\nLimitJump: " + jump + " meters");
    }

    public void runing(int runDistance) {
        if (runDistance <= run) System.out.println("Horse ran!");
        else System.out.println("Horse didn't ran!");
    }

    public void sweeming(int sweemDistance) {
        if (sweemDistance <= sweem) System.out.println("Horse swam!");
        else System.out.println("Horse didn't swim!");
    }

    public void jumping(int jumpDistance) {
        if (jumpDistance <= jump) System.out.println("Horse jumped!");
        else System.out.println("Horse did not jump!");
    }
}
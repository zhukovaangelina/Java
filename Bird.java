package ru.geekbrains.java_one.homework_five;

public class Bird extends Animal {

    protected boolean sweem;
    double jump;

    public Bird(String name, int run, boolean sweem, double jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    public void birdInfo() {
        System.out.println("BirdName: " + name + "\nLimitRun: " + run + " meters" + "\nSweem: " + sweem + "\nLimitJump: " + jump + " meters");
    }

    public void runing(int runDistance) {
        if (runDistance <= run) System.out.println("Bird ran!");
        else System.out.println("Bird didn't ran!");
    }

    public void sweeming(int sweemDistance) {
        System.out.println("Bird can't swim!");
    }

    public void jumping(int jumpDistance) {
        if (jumpDistance <= jump) System.out.println("Bird jumped!");
        else System.out.println("Bird did not jump!");
    }
}

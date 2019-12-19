package ru.geekbrains.java_one.homework_five;

public final class Cat extends Animal {

        protected boolean sweem;
        int jump;

        public Cat(String name, int run, boolean sweem, int jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void catInfo() {
            System.out.println("CatName: " + name + "\nLimitRun: " + run + " meters" + "\nSweem: " + sweem + "\nLimitJump: " + jump + " meters");
        }

    public void runing(int runDistance) {
        if (runDistance <= run) System.out.println("Cat ran!");
        else System.out.println("Cat didn't ran!");
    }

    public void sweeming(int sweemDistance) {
        System.out.println("Cat can't swim!");
    }

    public void jumping(int jumpDistance) {
        if (jumpDistance <= jump) System.out.println("Cat jumped!");
        else System.out.println("Cat did not jump!");
    }
}

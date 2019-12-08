package ru.geekbrains.java_one.homework_two;

public class HomeworkTwo {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Task1(mass);
        Task2(mass);
        Task3(mass);
        Task4(mass);
        Task5(mass);
    }

    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
    */
    private static void Task1(int[] mas) {
        int maxmas = mas.length;
        for (int i = 0; i < maxmas; i++) {
            if (mas[i] == 1) mas[i] = 0;
            else mas[i] = 1;
        }
        System.out.println("1. Метод, заменяющий в массиве 0 на 1, 1 на 0");
        for (int i = 0; i < maxmas; i++) {
            System.out.println(i + "-" + mas[i]);
        }
        System.out.print("\n");
    }

    /* 2. Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
    */
    private static void Task2(int[] mas) {
        int[] mass = new int[8];
        int j = 1;
        int maxMass = mass.length;
        System.out.println("2. Метод, заполняющий массив значениями 1 4 7 10 13 16 19 22");
        for(int i = 0; i < maxMass; i++, j = j+3)
        {mass[i] = j;
        }

        for(int i = 0; i < maxMass; i++)
        {
            System.out.print (i + "-" + mass[i]+" \n");
        }
        System.out.print("\n");
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2
    */
    private static void Task3(int[] mas) {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            if (mass[i] < 6)
                mass[i] = mass[i] * 2;
        }
        System.out.print("3. Метод, позволяющий умножить числа меньше 6 на 2 \n");

        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " \n");
        }
        System.out.print("\n");
    }

    /* 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
     */
    private static void Task4(int[] mas) {
        int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7 };
        int min = mass[0], max = mass[0], i, imin = 0, imax = 0;
        System.out.print("4. Метод поиска минимального и максимального элемента \n");
        for(i = 0; i != mass.length; i++)
        {
            if(mass[i] < min){
                min = mass[i];
                imin = i;
            }
            if(mass[i] > max){
                max = mass[i];
                imax = i;
            }
        }
        System.out.println("max = "+max+" min = "+min);
        System.out.println("imax = "+imax+" imin = "+imin);
        System.out.print("\n");
    }

    /* 5. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);
    */
    private static void Task5(int[] mas) {
        System.out.println("5. Метод, заполняющий диагональные элементы массива единицами");
        int[][] mass = new int[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0, j2 = mass[i].length; j < mass[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) mass[i][j] = 1;
                System.out.print(mass[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
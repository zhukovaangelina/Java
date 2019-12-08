package ru.geekbrains.java_one.homework_one;

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class HomeworkOne {
    public static void main(String[] args){
        System.out.println("1. Создать пустой проект в IntelliJ IDEA и прописать метод main().");
        Task2();
        Task3(15144, 17447, 19811, 7155);
        Task4(8, 9);
        Task5(-8);
        Task6(-1);
        Task7("Ангелина");
        Task8(2020);
    }

    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    private static void Task2(){
        byte b = 121;
        short sh = 30157;
        int i = 1514478;
        long l = 70548956L;
        float fl = 18.75f;
        double d = 178.832;
        char ch = '+';
        boolean bl = true;
        System.out.println("2. Создать переменные всех пройденных типов данных и инициализировать их значения.");
        System.out.println("Переменная типа byte = " + b);
        System.out.println("Переменная типа short = " + sh);
        System.out.println("Переменная типа int = " + i);
        System.out.println("Переменная типа long = " + l);
        System.out.println("Переменная типа float = " + fl);
        System.out.println("Переменная типа double = " + d);
        System.out.println("Переменная типа char = [" + ch + "]");
        System.out.println("Переменная типа boolean = " + bl);
    }

    /*
        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
        где a, b, c, d – целочисленные входные параметры этого метода;
     */

    private static void Task3(int a, int b, int c, int d){
        System.out.println("3. Написать метод вычисляющий выражение a * (b + (c / d)), где а = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        float fl = a * (b + (c / d));
        System.out.println("a * (b + (c / d)) = "+ fl);
    }

    /*
        4. Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.
    */
    private static boolean Task4(int a, int b){
        System.out.println("4. Лежит ли сумма чисел a = " + a + " и b = " + b + " в пределах от 10 до 20?");
        int s = a + b;
        if (s > 10 && s < 20) {
            System.out.println("Да");
            return true;
        }
        else {
            System.out.println("Нет");
            return false;
        }
    }

    /*
        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    */

        private static void Task5(int a){
            System.out.println("5. Число положительное или отрицательное?");
            if (a >= 0) System.out.println("Число " + a + " положительное");
            else System.out.println("Число " + a + " отрицательное");
        }

    /*
        6. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное.
    */

        private static boolean Task6(int a){
            System.out.println("6. Число " + a + " отрицательное?");
            if (a < 0) {
                System.out.println("Да");
                return true;
            }
            else {
                System.out.println("Нет");
                return false;
            }
        }

     /*
        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */

        private static void Task7(String st){
            System.out.println("7. Передать строку, обозначающее имя");
            System.out.println("Привет, " + st);
        }
    /*
        8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

     */

    private static void Task8(int a){
        System.out.println("8. Год " + a + " високосный или нет?");
        if (a % 4 == 0 && !(a % 100 == 0)) {
            System.out.println("Да");
        }
        else if (a % 400 == 0) {
            System.out.println("Да");
        }
        else System.out.println("Нет");
            }

       }

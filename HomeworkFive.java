package ru.geekbrains.java_one.homework_five;


// 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
// 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
// прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
// 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
// 5. Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class HomeworkFive {
    public static void main(String[] args) {
        Animal canimal = new Animal("Cats");
        Cat c = new Cat("Murka", 200, false, 2);
        canimal.animalInfo();
        c.animalInfo();
        c.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog d = new Dog("Bobik", 500, 10, 0.5);
        danimal.animalInfo();
        d.animalInfo();
        d.dogInfo();

        Animal hanimal = new Animal("Horses");
        Horse h = new Horse("Molly", 1500, 100, 3);
        hanimal.animalInfo();
        h.animalInfo();
        h.horseInfo();

        Animal banimal = new Animal("Birds");
        Bird b = new Bird("Kesha", 5, false, 0.2);
        banimal.animalInfo();
        b.animalInfo();
        b.birdInfo();

        System.out.println();
        d.runing(150);
        h.jumping(2);
        c.sweeming(1);
    }
}

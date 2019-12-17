package ru.geekbrains.java_one.homework_four;

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;

    public class Employee {
        String name;
        String position;
        String phone;
        int salary;
        int age;

        // 2. Конструктор класса должен заполнять эти поля при создании объекта;
        public Employee(String name, String position, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        // 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        public String GetName() { return name; }

        public String GetPosition() { return position; }

        public String GetPhone() { return phone; }

        public int GetSalary() { return salary; }

        public int GetAge() { return age; }

        public void setSalary(int salary) {
            this.salary = salary + 5000;
        }

        void Show() {
            System.out.println(name + " " + position + " " + phone + " " + salary + " " + age);
        }

    }

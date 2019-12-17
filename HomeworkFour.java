package ru.geekbrains.java_one.homework_four;

import static ru.geekbrains.java_one.homework_four.Employee.*;

public class HomeworkFour {
    public static void main(String[] arg){

        // 2. Конструктор класса должен заполнять эти поля при создании объекта;
        Employee Emp0 = new Employee("Павлов Лев Борисович", "Генеральный директор", "+79187894600", 90000, 50);
        Employee Emp1 = new Employee("Кузнецов Константин Александрович", "Земеститель генерального директора", "+79187894601", 55000, 34);
        Employee Emp2 = new Employee("Смирнов Андрей Васильевич", "Менеджер по продажам", "+79187894602", 42000, 30);
        Employee Emp3 = new Employee("Авдеев Денис Васильевич", "Менеджер по закупкам", "+79187894603", 45000, 35);
        Employee Emp4 = new Employee("Поздеева Ольга Сергеевна", "Главный бухгалтер", "+79187894604", 70000, 43);

        // 4. Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("\nВыводим ФИО и должность сотрудников:");
        System.out.println(Emp0.GetName() + " по должности " + Emp0.GetPosition());
        System.out.println(Emp1.GetName() + " по должности " + Emp1.GetPosition());
        System.out.println(Emp2.GetName() + " по должности " + Emp2.GetPosition());
        System.out.println(Emp3.GetName() + " по должности " + Emp3.GetPosition());
        System.out.println(Emp4.GetName() + " по должности " + Emp4.GetPosition());

        // 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] Emp = new Employee[5];
        Emp[0] = new Employee("Павлов Лев Борисович", "Генеральный директор", "+79187894600", 90000, 50);
        Emp[1] = new Employee("Кузнецов Константин Александрович", "Земеститель генерального директора", "+79187894601", 55000, 34);
        Emp[2] = new Employee("Смирнов Андрей Васильевич", "Менеджер по продажам", "+79187894602", 42000, 30);
        Emp[3] = new Employee("Авдеев Денис Васильевич", "Менеджер по закупкам", "+79187894603", 45000, 35);
        Emp[4] = new Employee("Поздеева Ольга Сергеевна", "Главный бухгалтер", "+79187894604", 70000, 43);

        System.out.println("\nВыводим информацию о сотрудниках старше 40 лет:");
        for(Employee item : Emp) {
            if(item.GetAge() > 40) item.Show();
        }

        // 6. Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        System.out.println("\nПовышаем зарплату всем сотрудникам старше 45 лет на 5000:");
        for(Employee item : Emp) {
            if(item.GetAge() > 45) {
                item.setSalary(item.salary);
                item.Show();
            }
        }

        // 4. Вывести при помощи методов из пункта 3 ФИО и должность. (Реализовано из массива)
        System.out.println("\nВыводим ФИО и должность сотрудников:");
        for(int i = 0; i < Emp.length; i++) {
            System.out.println(Emp[i].GetName() + " по должности " + Emp[i].GetPosition());
        }


    }
}
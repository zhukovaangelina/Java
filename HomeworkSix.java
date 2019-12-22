package ru.geekbrains.java_one.homework_six;

import java.io.BufferedReader;
import java.io.*;

public class HomeworkSix {
    public static void main(String[] args) throws IOException {

            // 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
            // Я открыла для чтения файлы, которые были созданы в ручную.
            PrintWriter pw = new PrintWriter("C:\\Users\\Жуковы\\IdeaProjects\\HomeworkSix\\src\\ru\\geekbrains\\java_one\\homework_six\\file3.txt");

            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Жуковы\\IdeaProjects\\HomeworkSix\\src\\ru\\geekbrains\\java_one\\homework_six\\file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Жуковы\\IdeaProjects\\HomeworkSix\\src\\ru\\geekbrains\\java_one\\homework_six\\file2.txt"));

            String line1 = br1.readLine();
            String line2 = br2.readLine();

            //2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
            // потом текст из второго.

            while(line1 != null|| line2 !=null)
            { if(line1 != null)
                    {   pw.println(line1);
                        line1 = br1.readLine();
                    }

                    if(line2 != null)
                    {   pw.println(line2);
                        line2 = br2.readLine();
                    }
            }

            pw.flush();
            br1.close();
            br2.close();
            pw.close();
            System.out.println("Объединены файлы file1.txt и file2.txt в файл file3.txt");
    }
}

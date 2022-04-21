package com.company;

import com.sun.jdi.Value;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List <String> list = new LinkedList<String>();
        ListIterator<String> itr = list.listIterator();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите действие: ");
            System.out.println("1) Добавить.");
            System.out.println("2) Удалить.");
            System.out.println("3) Найти.");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Укажите число:");
                int n = sc.nextInt();
                list.add("" + n + "");
                System.out.println("Добавлено!");
            } else if (x == 2) {
                System.out.println("Удаление по индексу.Введите индекс:");
                int n = sc.nextInt();
                list.remove(n);
                System.out.println("Удалено!");
            } else if (x == 3) {
                int n = sc.nextInt();
                    if (n == list.indexOf(n)){
                       System.out.println("Число " + list.get(n));
                    }
            } else if (x == 4) {
                System.out.println("Завершено!");
                break;
            } else {
                System.out.println("NoNoNoNoooooooooo");
            }
        }
    }
}

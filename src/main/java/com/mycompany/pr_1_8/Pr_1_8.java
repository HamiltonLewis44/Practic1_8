/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr_1_8;

import java.util.*;
/**
 *
 * @author andre
 */

public class Pr_1_8 {
    public static void main(String[] args) {
        List<Passport> passportList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер пропуска, ФИО, должность и отметку о прохождении допуска (true/false) через пробел:");
            int number = scanner.nextInt();
            String surname = scanner.next();
            String name = scanner.next();
            String position = scanner.next();
            String patronymic = scanner.next();
            boolean access = scanner.nextBoolean();

            Passport newPassport = new Passport(number, surname, name, patronymic, position, access);
            passportList.removeIf(p -> p.number == number && !p.surname.equals(surname));
            passportList.add(newPassport);

            Collections.sort(passportList, Comparator.comparing(p -> p.surname));
            System.out.println("Сортировка по ФИО:");
            for (Passport p : passportList) {
                System.out.println(p);
            }

            Collections.sort(passportList, Comparator.comparingInt(p -> p.number));
            System.out.println("Сортировка по номеру пропуска:");
            for (Passport p : passportList) {
                System.out.println(p);
            }
        }
    }
}

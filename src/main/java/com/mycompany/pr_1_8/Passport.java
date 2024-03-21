/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr_1_8;

/**
 *
 * @author andre
 */
public class Passport {
    
    int number;
    String surname;
    String name;
    String patronymic;
    String position;
    boolean access;

    public Passport(int number, String surname, String name, String patronymic, String position, boolean access) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.access = access;
    }
@Override
    public String toString() {
        return surname + " " + name + " " + patronymic + ", " + number + ", " + position + ", " + access;
    }
}

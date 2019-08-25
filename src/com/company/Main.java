package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Nelly";
        int age = 33;
        int temp = 36;

        if ((temp > 30 || temp < -20) && (age > 20 || age < 45)) {
            System.out.println("Не выходим гулять");
        } else {
            System.out.println("Отправляется к своему другу");


        }

        if ((age < 20) && (temp < 0 || temp < 28)) {
            System.out.println("Условия остаются прежними");
        }
        if ((age > 45) && (temp > -10 || temp < 25)) {
        }

    }
}

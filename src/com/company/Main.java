package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Колличество собак, которых вы хотите прокормить ");

        int numberOfDogs = Integer.parseInt(reader.readLine());
        System.out.println("У вас есть : " + numberOfDogs + " собак");

        System.out.println("Колличество котов, которых вы хотите прокормить: ");

        int numberOfCats = Integer.parseInt(reader.readLine());
        System.out.println("У вас есть : " + numberOfCats + " котов");

        System.out.println("Введите колличество дней : ");

        int numberOfDays = Integer.parseInt(reader.readLine());
        System.out.println("Колличество дней : " + numberOfDays);


        CatsDogs CatsDogs = new CatsDogs(numberOfCats, numberOfDogs,2, numberOfDays);
        System.out.println("----------------------------");

        System.out.println("Для  " + numberOfDogs + " собак тебе нужно " + CatsDogs.eatDogs() + " еды "
                + " на " + numberOfDays + " дней ");

        System.out.println("Для " + numberOfCats + " котов тебе нужно " + CatsDogs.eatCats() + " еды "
                + " на " + numberOfDays + " дней");

        System.out.println("Полная стоимость прокормки животных в  " + "$" + CatsDogs.Cost());
    }
}

package ru.netology.javapackageandcycle.services;

public class RestMonthService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; //количество денег на счету
        for
        (int i = 0; i < 12; i++) {

            if (money >= threshold) // может отдохнуть
            {
                count++; //увеличитвается счётчик месяцев для отдыха
                money = (money - expenses) / 3;

            } else
                money = (money + income) - expenses;
        }
        return count;
    }
}
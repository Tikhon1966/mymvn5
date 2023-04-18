package ru.netology;

import ru.netology.services.MonthService;

public class Main {
    public static void main(String[] args) {
        MonthService service = new MonthService();
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(count);
    }
}
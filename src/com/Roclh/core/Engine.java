package com.Roclh.core;

import com.Roclh.core.commands.CommandList;

import java.util.Scanner;

public class Engine {
    private static final CommandList commandList = new CommandList();
    private static final Scanner scanner = new Scanner(System.in);


    public static void start(){
        System.out.println("Для решения интеграла выберите метод:\n" +
                "1. Метод прямоугольников - 'rectangles'\n" +
                "2. Метод трапеций - 'trapezium'\n" +
                "3. Метод Симпсона - 'simpson");
        while(true){
            System.out.println("Выберите метод решения интеграла");
            if(!commandList.solve(scanner.nextLine())){
                System.out.println("Такого метода не существует. Повторите попытку ввода");
            }else{
                break;
            }
        }
    }
}

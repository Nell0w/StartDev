package com.company;

import java.util.Random;
import java.util.Scanner;

class App {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("1. 1 задание");
        System.out.println("2. 2 задание");
        System.out.println("3. 3 задание");
        System.out.println("4. 4 задание");
        System.out.println("5. 5 задание");
        System.out.println("6. 6 задание");
        System.out.println("7. 7 задание");
        System.out.println();
        System.out.print("Введите задание: ");
        String task = scanner.nextLine();

        switch (task) {
            case "1":
                System.out.println("----- Задача 1 ------");
                System.out.println("Введите число градусов по Цельсию: ");
                // решение задачи
                double celsium = scanner.nextInt();
                double fahrenheit = celsium * 1.8 + 32;
                System.out.print("По Фарингейту это будет: ");
                System.out.print(fahrenheit);

                System.out.println();
                System.out.println("----- конец задачи 1 ------");
                System.out.println();
                break;
            case "2":
                System.out.println("----- Задача 2 ------");
                System.out.println("Загадано число от 5 до 10: ");

                int myNumber = random.nextInt((10 - 5) + 1) + 5;
                System.out.println("Отгадай: ");

                int attempt = 0;
                do {
                    int userNumber = scanner.nextInt();
                    if (myNumber == userNumber) {
                        System.out.println("Ты выиграл");
                        break;
                    } else {
                        if (attempt > 2) {
                            System.out.println("Ты проиграл");
                        } else {
                            System.out.println("Попробуй ещё раз");
                        }
                    }
                    attempt++;
                } while (true);

                System.out.println();
                System.out.println("----- конец задачи 2 ------");
                System.out.println();
                break;
            case "3":
                System.out.println("----- Задача 3 ------");
                System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
                int myArr[] = new int[10];
                int sum = 0;
                int maxNumber = 50;
                int minNumber = 0;
                for (int i = 0; i < myArr.length; i++) {
                    myArr[i] = random.nextInt(49 + 1);
                }

                for (int i = 0; i < myArr.length; i++) {
                    System.out.printf("%4d", myArr[i]);
                }
                System.out.println();
                System.out.println("Сумма всех чисел массива: ");
                for (int i = 0; i < myArr.length; i++) {
                    sum = sum + myArr[i];
                }
                System.out.println(sum);

                for (int i = 0; i < myArr.length; i++) {
                    if (maxNumber < myArr[i]) {
                        maxNumber = myArr[i];
                    }
                    if (minNumber < myArr[i]) {
                        minNumber = myArr[i];
                    }
                }

                System.out.println("min = " + minNumber);
                System.out.println("max = " + maxNumber);

                System.out.println();
                System.out.println("----- конец задачи 3 ------");
                System.out.println();
                break;
            case "4":
                System.out.println("----- Задача 4 ------");
                System.out.println("Создаем одномерный массив  из 10заполняем его случайн ячеек типа int, \nыми ЧЕТНЫМИ числами и выводим \nего значения в цикле");
                int[] myArray = new int[10];
                int evenNumber;
                for (int i = 0; i < myArray.length; i++) {
                    while (true) {
                        evenNumber = random.nextInt(49 + 1);
                        if (evenNumber % 2 == 0) {
                            myArray[i] += evenNumber;
                            break;
                        }
                    }
                }
                for (int i = 0; i < myArray.length; i++) {
                    System.out.printf("%4d", myArray[i]);
                }

                System.out.println();
                System.out.println("----- конец задачи 4 ------");
                break;
            case "5":
                System.out.println("----- Задача 5 ------");
                System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
                System.out.println("----- конец задачи 5 ------");
                int MyArr[][] = new int[10][5];
                for (int i = 0; i < MyArr.length; i++) {
                    for (int j = 0; j < MyArr[i].length; j++)
                        MyArr[i][j] = random.nextInt(49 + 1);
                }
                for (int i = 0; i < MyArr.length; i++) {
                    System.out.println();
                    for (int j = 0; j < MyArr[i].length; j++) {
                        System.out.printf(MyArr[i][j] + " ");
                    }
                }
                break;
            case "6":
                System.out.println("----- Задача 6 ------");
                System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
                int n = 0;
                int[][] MyArray = new int[10][];
                for (int i = 0; i < MyArray.length; i++) {
                    switch (i) {
                        case 0:
                        case 5:
                            n = 5;
                            break;
                        case 1:
                        case 6:
                            n = 6;
                            break;
                        case 2:
                        case 7:
                            n = 7;
                            break;
                        case 3:
                        case 8:
                            n = 8;
                            break;
                        case 4:
                        case 9:
                            n = 9;
                            break;
                    }
                    MyArray[i] = new int[n];
                    for (int j = 0; j < MyArray[i].length; j++) {
                        MyArray[i][j] = random.nextInt(49 + 1);
                        System.out.printf("%3d", MyArray[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("----- конец задачи 6 ------");
                break;
            case "7":
                System.out.println("----- Задача 7 ------");
                System.out.println("Введите строку");
                String str = scanner.nextLine();
                // посчитайте сколько раз в строке встречается введенная вами буква
                System.out.println("Введите букву: ");
                String letter = scanner.nextLine();


                int count = 0;
                int index = str.indexOf(letter);
                while (index != -1) {
                    count++;
                    str = str.substring(index + 1);
                    index = str.indexOf(letter);
                }
                System.out.println("Буква \"" + letter + "\" встречается в тексте " + count + " раз");
                break;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package startdev;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author nello
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int myNumber = random.nextInt((10 - 5) + 1) + 5;
        System.out.println("Отгадай: ");

        int attempt = 0;
        do {
            int userNumber = scanner.nextInt();
            if (myNumber == userNumber) {
                System.out.println("Ты выиграл");
                break;
            }else {
                if (attempt > 2) {
                    System.out.println("Ты проиграл");
                } else {
                    System.out.println("Попробуй ещё раз");
                }
            }attempt++;
        } while (true);

        System.out.println();
        System.out.println("----- Конец задачи 2 ------");
        System.out.println();
    }
}
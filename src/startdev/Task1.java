/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author nello
 */
class Task1 {
    public void run(){
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        Scanner scanner = new Scanner (System.in);
        double tempCels =scanner.nextDouble();
        double tempFarin = (tempCels * 9 / 5) + 32; 
//        (0°C × 9/5) + 32 = 32°F    
        // решение задачи
        System.out.printf("По Фарингейту это будет: %6.2f%n", tempFarin);
        System.out.println("----- Конец задачи 1 ------");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author nello
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int n = 10;
        int myArr[] = new int [n];
        Random random = new Random ();
        int randomNum = 0;
        for (int i = 0; i < myArr.length; i++){
            do {
                randomNum = random.nextInt(19-0+1)-0;     //  заполнение только четными числами
            } while (randomNum % 2 != 0);
            myArr[i] = randomNum;
        }        
        System.out.printf ("%-3d",  randomNum );
        System.out.println("----- конец задачи 4 ------");            
    }

}
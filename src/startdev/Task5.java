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
public class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем двухмерный массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[][] = new int [10][5] ;
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                myArr [i][j] = random.nextInt(10);
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----- конец задачи 5 ------");
    }
}
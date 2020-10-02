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
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int n = 10;
        int myArr[] = new int [n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            myArr [i] = random.nextInt(99-0+1)+0;
        }
        for(int i = 0; i < myArr.length; i++){
            System.out.printf ("%-3d", myArr[i]);
        }    
           System.out.println("");
           System.out.println("сумма значений массива");
           int sum = 0;
           for(int i = 0; i < myArr.length; i++){
               sum = sum + myArr[i];
           }        
           
        System.out.println("Сумма чисел массива: " + sum );
        System.out.println("----- конец задачи 3 ------");
    }
    

        
}   

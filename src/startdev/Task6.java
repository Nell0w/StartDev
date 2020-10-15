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

public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем двухмерный зубчатый массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int n = 0;
        int[][] myArr = new int[10][];
        for (int i = 0; i < myArr.length; i++) {
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
                    myArr[i] = new int [n];
            for (int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = random.nextInt(49 + 1);
                System.out.printf("%3d", myArr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----- Конец задачи 6 ------");
    }
}

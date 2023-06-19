/*Пусть дан произвольный список из 100 целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение*/

package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            lst.add(new Random().nextInt(10));
        }
        System.out.println(lst.size());
        System.out.println(lst);

        //Нужно удалить из него чётные числа
        lst.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + lst);
        System.out.println("Размер списка после удаления четных чисел: " + lst.size());

        //Найти минимальное значение
        int min = lst.get(0);
        for (int i : lst) {
            if (i < min) min = i;
        }
        System.out.println("Минимальное значение: " + min);

        //Найти максимальное значение
        int max = lst.get(0);
        for (int i : lst) {
            if (i > max) max = i;
        }
        System.out.println("Максимальное значение: " + max);

        //Найти среднее значение
        double sum = 0;
        for (int i : lst) {
            sum =sum + i ;
        }
        System.out.println(sum);
        double average = sum / lst.size();
        System.out.println("Среднее арифметическое значение: " + average);
    }
}

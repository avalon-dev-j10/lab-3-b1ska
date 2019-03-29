package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        
        //инициализируем массив числами фибоначи и выводим сумму
        FibonacciInitializer fibo = new FibonacciInitializer();
        fibo.initialize(array);
        System.out.println("Сумма массива Фибоначи равна:"+Arrays.stream(array).sum());
        
        
        
        //инициализируем массив случайными числами от -50 до 50, выводим сумму и результат до сортировки
        RandomInitializer random1 = new RandomInitializer();
        random1.initialize(array);
        System.out.println();
        System.out.println("Сумма рандомного Массива 1 равна:"+Arrays.stream(array).sum());
        System.out.println();
        System.out.println("Рандомный Массив 1 до сортировки:");
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        //сортируем массив 1 методом сортировки "Пузырьком"
        BubbleSort sortirovkaBubble = new BubbleSort();
        sortirovkaBubble.sort(array);
        System.out.println();
        System.out.println("Рандомный Массив 1 после сортировки Пузырьком");
	for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        //сортируем массив 2 методом сортировки выбором
        RandomInitializer random2 = new RandomInitializer();
        random1.initialize(array);
        SelectionSort selectSort = new SelectionSort();
        selectSort.sort(array);
        System.out.println();
        System.out.println("Рандомный Массив 2 сортировки с использованием сортровки выбором");
	for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        //сортируем массив 3 методом сортировки Шелла
        RandomInitializer random3 = new RandomInitializer();
        random1.initialize(array);
        ShellSort selectShell = new ShellSort();
        selectSort.sort(array);
        System.out.println();
        System.out.println("Рандомный Массив 3 сортировки с использованием сортировки Шелла");
	for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
         System.out.println();
          }
        
        }
      //  System.out.println(fibo.initialize);
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    


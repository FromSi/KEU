import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScatterArray {
    //Для ввода
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random(System.currentTimeMillis());
    
    //Главный метод
    public static void main(String[] args) {
        //Покажет результат
        System.out.println("\n Sorted: " + Arrays.toString(handler(initArray(scanner.nextInt()))));
    }

    //Метод инициализации
    private static int[] initArray(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < size; i++)
            mas[i] = i + 1; // от 1 до n

        //Показывает результат инициализации массива
        System.out.println("\n Random: " + Arrays.toString(mas));

        return mas;
    }

   /** 
    *  Обработчик. Каждый шаг, мы записываем рандомный элемент со старого массива в новый
    *  и удаляем элемент выбранного массива у старого элемента
    */
    private static int[] handler(int[] mas) {
        int[] newMas = new int[mas.length];

        for (int i = 0; i < mas.length - 1; i++) {
            int index = random.nextInt(mas.length - 1 - i);
            newMas[i] = mas[index];
            removeElement(mas, index);
        }

        return newMas;
    }

    //Удаляет элемент и возвращает новый массив
    private static void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }
}

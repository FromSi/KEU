import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n Sorted: " + Arrays.toString(handler(initArray(scanner.nextInt()))));
    }

    private static int[] initArray(int size){
        int[] mas = new int[size];
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < size; i++)
            mas[i] = random.nextInt(256);

        System.out.println("\n Random: " + Arrays.toString(mas));

        return mas;
    }

    private static int[] handler(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++)
            for (int j = 0; j < mas.length - 1; j++)
                if (mas[j] > mas[j + 1]) {
                    int a = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = a;
                }

        return mas;
    }
}

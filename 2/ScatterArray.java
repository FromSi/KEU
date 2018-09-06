import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScatterArray {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        System.out.println("\n Sorted: " + Arrays.toString(handler(initArray(scanner.nextInt()))));
    }

    private static int[] initArray(int size) {
        int[] mas = new int[size];

        for (int i = 0; i < size; i++)
            mas[i] = i + 1;

        System.out.println("\n Random: " + Arrays.toString(mas));

        return mas;
    }

    private static int[] handler(int[] mas) {
        int[] newMas = new int[mas.length];

        for (int i = 0; i < mas.length - 1; i++) {
            int index = random.nextInt(mas.length - 1 - i);
            newMas[i] = mas[index];
            removeElement(mas, index);
        }

        return newMas;
    }

    private static void removeElement(int[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }
}

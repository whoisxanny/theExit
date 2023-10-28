import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Массив до использование метода = " + Arrays.toString(array));

        noOdds(array);

        System.out.println("Массив после использование метода = " + Arrays.toString(array));
        System.out.println("Перебираем массив с 3 по 7 элемент (со 2 по 6 ключ) дедовским способом: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[2] && array[i] < array[6]) {
                System.out.print(array[i] + ", ");
            }else if (array[i] == array[6]) {
                System.out.print(array[i]);
                break;
            }
        }
        System.out.println();

        int[] newArray = Arrays.copyOfRange(array,2,7);

        System.out.println("Массив прошевший через метод и отсортированный с 3-го по 7-ой (то есть c0 2 по 6 ключ получается) элементы, путём создания нового массива (сделано с 2 по 7, так как последний элемент не включается, и чтобы 7 элемент всё же был, нужно увеличить число индекса его последнего элемента на один) = " + Arrays.toString(newArray));

    }

    public static int[] noOdds(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        return arr;
    }

}
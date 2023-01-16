import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayUtil arrayUtil = new ArrayUtil();
    int[] array1 = arrayUtil.createArray(10);
    arrayUtil.fillArrayWithRandomNumbers(array1);
    System.out.println(Arrays.toString(array1));
    arrayUtil.printArrayToConsole(array1);
    System.out.println("");
    System.out.println("max is "+ arrayUtil.findMaxNumber(array1));
    System.out.println("min is "+ arrayUtil.findMinNumber(array1));

    }
    }

    /*
    https://github.com/tel-ran-de/49-49-morning-basic-java/blob/main/src/main/java/homework/lesson12/arrays_for_loop/Task_38.txt
     */
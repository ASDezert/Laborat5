package ua.zp.brainacad;

import java.util.Arrays;

public class Lab4Test {
    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // init it's array by new with size 4.

        firstArray = new float[] {1, 2, 3, 4}; // insert some value to start of array and to end of array.

        int[] intArray = {5, 6, 7, 8}; // init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // copy "intArray". Use copyOf...

        // 1.3)
        Arrays.sort(intArrayCopy); //sort "intArrayCopy", use Arrays sort.

        // 1.4)
        Arrays.toString(intArrayCopy); // print "intArrayCopy", use Arrays toString.

        // 1.5)
        System.out.println(Arrays.equals(intArray, intArrayCopy) ? "Массивы равны" : "Масивы неравны");
        // compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value: testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // calc sum of all array elements and print result.
        int sum1 = 0;
        for (int item1 : testArray) {
            sum1 += item1;
        }
        System.out.println(" - Сумма: " + sum1);


        // 2.2)
        // calc sum of all numbers with odd indexes and print result.
        int sum2 = 0;
        for (int item2 : testArray) {
            if (item2%2 != 0) {
                sum2 += item2;
            }
        }
        System.out.println("Сумма нечетных: " + sum2);


        // 2.3)
        // TODO find max value in array.
        int max = Integer.MIN_VALUE;
        for (int item3: testArray) {
            if (item3 > max) {
                max = item3;
            }
        }
        System.out.println("аксимальное значение: " + max);

        //ДЛЯ СЕБЯ - просортировал и вывел массив
        Arrays.sort(testArray);
        System.out.println("Сортировка: " + Arrays.toString(testArray));

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]

        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);
    }
}

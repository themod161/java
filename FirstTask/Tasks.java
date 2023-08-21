package FirstTask;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    public void taskMain() {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task11();
        Task12();
    }
    public void Task1() {
        System.out.println("Task1\n");
        System.out.println("Your time is limited,\n\tso don't waste it\n\t\tliving someone else's life\n\t\t\tSteve Jobs");
    }
    public void Task2() {
        System.out.println("\nTask2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = scanner.nextInt();
        System.out.println("Enter percent: ");
        int percent = scanner.nextInt();

        int result = value * percent / 100;
        System.out.println(result);
    }
    public void Task3() {
        System.out.println("\nTask3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter n2: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter n3: ");
        int n3 = scanner.nextInt();
        int result = n1 * 100 + n2 * 10 + n3;

        System.out.println(result);
    }
    public void Task4() {
        System.out.println("\nTask4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter six digits long number: ");
        int number = scanner.nextInt();
        if (number < 100000 || number > 999999) {
            System.out.println("The number must be six digits long.");
            return;
        }

        int firstDigit = number / 100000;
        int secondDigit = (number % 100000) / 10000;
        int thirdDigit = (number % 10000) / 1000;
        int fourthDigit = (number % 1000) / 100;
        int fifthDigit = (number % 100) / 10;
        int sixthDigit = (number % 10);

        int result = sixthDigit * 100000 + fifthDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(result);
    }
    public void Task5() {
        System.out.println("\nTask5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("The month must be in the range from 1 to 12.");
                break;
        }
    }

    public void Task6() {
        System.out.println("\nTask6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of meters: ");
        int meters = scanner.nextInt();

        System.out.println("Enter the unit of measurement: ");
        System.out.println("1. Miles");
        System.out.println("2. Inches");
        System.out.println("3. Yards");
        int unit = scanner.nextInt();

        final double YARD = 1.0936133;
        final double INCHES = 39.3701;
        final double MILES = 1609.344;

        switch (unit) {
            case 1:
                System.out.println("The number of meters in miles is " + meters / MILES);
                break;
            case 2:
                System.out.println("The number of meters in inches is " + meters * INCHES);
                break;
            case 3:
                System.out.println("The number of meters in yards is " + meters * YARD);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                break;
        }
    }
    public void Task7() {
        System.out.println("\nTask7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start + 1; i < end; i += 2) {
            System.out.println(i);
        }
    }
    public void Task8() {
        System.out.println("\nTask8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
    public void Task9() {
        System.out.println("\nTask9");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int min = array[0];
        int max = array[0];
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Number of positive: " + countPositive);
        System.out.println("Number of negative: " + countNegative);
        System.out.println("Count zeros: " + countZero);
        System.out.println("\n");
    }
    public void Task10() {
        System.out.println("\nTask10");
        int[] array = new int[10];
        Arrays.fill(array, (int) (Math.random() * 100));

        int[] evenNumbers = new int[array.length];
        int evenNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[evenNumbersCount++] = array[i];
            }
        }

        int[] oddNumbers = new int[array.length];
        int oddNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers[oddNumbersCount++] = array[i];
            }
        }

        int[] negativeNumbers = new int[array.length];
        int negativeNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeNumbers[negativeNumbersCount++] = array[i];
            }
        }

        int[] positiveNumbers = new int[array.length];
        int positiveNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveNumbers[positiveNumbersCount++] = array[i];
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
        System.out.println("Negative numbers: " + Arrays.toString(negativeNumbers));
        System.out.println("Positive numbers: " + Arrays.toString(positiveNumbers));
        System.out.println("\n");
    }
    public void Task11() {
        System.out.println("\nTask11");
        System.out.println(drawLine(10, '-'));
        System.out.println(drawLine(10, '+'));
        System.out.println(drawLine(10, '*'));
        System.out.println("\n");
    }

    public String drawLine(int length, char symbol) {
        String line = "";
        for (int i = 0; i < length; i++) {
            line += symbol;
        }
        return line;
    }

    public void Task12() {
        System.out.println("\nTask12");
        Integer[] array = new Integer[]{1, 5, 3, 2, 4};

        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array (ascending): " + Arrays.toString(array));

        Arrays.sort(array, (Integer a, Integer b) -> { return b - a;});
        System.out.println("Sorted array (descending): " + Arrays.toString(array));
    }
}
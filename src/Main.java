import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задачи, которую хотите проверить: ");
        int numberTask = in.nextInt();
        switch (numberTask)
        {
            case (1):
                System.out.print("Задача 1: четное или нечетное число\nВведите число: ");
                int number = in.nextInt();
                if (number % 2 == 0)
                {
                    System.out.print("Число четное");
                }
                else
                {
                    System.out.print("Число нечетное");
                }
                break;
            case (2):
                System.out.print("Задача 2: Минимальное из трех чисел\nВведите три числа\n");
                int one = in.nextInt(); int two = in.nextInt(); int three = in.nextInt();
                int max;
                if (one > three)
                {
                    max = one;
                }
                else if (two > one)
                {
                    max = two;
                }
                else
                {
                    max = three;
                }
                System.out.print("Максимальное число из трех: " + max);
                break;
            case (3):
                System.out.print("Задача 3: Таблица умножения\n");
                for (int i = 1; i < 11; i++)
                {
                    System.out.print("\n" + i * 5);
                }
                break;
            case (4):
                System.out.print("Задача 4: Сумма чисел от 1 до N\nВведите число N:");
                int N = in.nextInt();
                int sum = 0;
                for (int i = 1; i <= N; i++)
                {
                    sum += i;
                }
                System.out.printf("Сумма чисел от 1 до %d = %d", N, sum);
                break;
            case (5):
                System.out.print("Задача 5: Число Фибоначчи\nВведите число N:");
                final int N1 = in.nextInt();
                int fibonachi;
                int one1 = 1; int two2 = 1;
                for (int i = 2; i <= N1; i++)
                {
                    fibonachi = one1 + two2;
                    one1 = two2;
                    two2 = fibonachi;
                    System.out.print("|" + fibonachi);
                }
                break;
            case (6):
                System.out.print("Задача 6: Проверка простого числа\nВведите число:");
                int simpleNumber = in.nextInt();
                for (int i = 2; i <= simpleNumber; i++)
                {
                    if (simpleNumber % i == 0 && simpleNumber != i)
                    {
                        System.out.printf("Нет, %d не простое число", simpleNumber);
                        break;
                    }
                    else if (simpleNumber % i == 0 && simpleNumber == i)
                    {
                        System.out.printf("Да, %d простое число", simpleNumber);
                    }
                }
                break;
            case (7):
                System.out.print("Задача 7: Обратный порядок чисел\nВведите число:");
                int N7 = in.nextInt();
                for (; N7 >= 0; N7--)
                {
                    System.out.printf("|" + N7);
                }
                break;
            case (8):
                System.out.print("Задача 8: Сумма четных чисел\nВведите число A и B:\n");
                int A = in.nextInt(); int B = in.nextInt(); int sum8 = 0; int fA = A;
                for (; A <= B; A++)
                {
                    if (A % 2 == 0)
                    {
                        sum8 += A;
                    }
                }
                System.out.printf("Сумма четных чисел в диапазоне от %d до %d = %d", fA, B, sum8);
                break;
            case (9):
                System.out.print("Задача 9: Реверс строки\nВведите строку:");
                in.nextLine(); // Consume newline
                String line = in.nextLine();
                for (int i = line.length() - 1; i >= 0; i--)
                {
                    System.out.print(line.charAt(i));
                }
                break;
            case (10):
                System.out.print("Задача 10: Количество цифр в числе\nВведите число: ");
                int number10 = in.nextInt();
                String str = Integer.toString(number10);
                System.out.print(str.length());
                break;
            case (11):
                System.out.print("Задача 11: Факториал числа\nВведите число: ");
                int n = in.nextInt();
                System.out.println("Факториал: " + factorial(n));
                break;
            case (12):
                System.out.print("Задача 12: Сумма цифр числа\nВведите число: ");
                int num = in.nextInt();
                System.out.println("Сумма цифр: " + sumOfDigits(num));
                break;
            case (13):
                System.out.print("Задача 13: Проверка палиндрома\nВведите строку: ");
                in.nextLine(); // Consume newline
                String str13 = in.nextLine();
                System.out.println("Является палиндромом: " + isPalindrome(str13));
                break;
            case (14):
                System.out.print("Задача 14: Максимальное число в массиве\nВведите размер массива: ");
                int size14 = in.nextInt();
                int[] array14 = new int[size14];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size14; i++) {
                    array14[i] = in.nextInt();
                }
                System.out.println("Максимальное значение: " + findMax(array14));
                break;
            case (15):
                System.out.print("Задача 15: Сумма всех элементов массива\nВведите размер массива: ");
                int size15 = in.nextInt();
                int[] array15 = new int[size15];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size15; i++) {
                    array15[i] = in.nextInt();
                }
                System.out.println("Сумма элементов массива: " + sumOfArray(array15));
                break;
            case (16):
                System.out.print("Задача 16: Количество положительных и отрицательных чисел\nВведите размер массива: ");
                int size16 = in.nextInt();
                int[] array16 = new int[size16];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size16; i++) {
                    array16[i] = in.nextInt();
                }
                countPositivesAndNegatives(array16);
                break;
            case (17):
                System.out.print("Задача 17: Простые числа в диапазоне\nВведите два числа A и B: ");
                int a = in.nextInt();
                int b = in.nextInt();
                printPrimesInRange(a, b);
                break;
            case (18):
                System.out.print("Задача 18: Подсчет гласных и согласных\nВведите строку: ");
                in.nextLine(); // Consume newline
                String str18 = in.nextLine();
                countVowelsAndConsonants(str18);
                break;
            case (19):
                System.out.print("Задача 19: Перестановка слов в строке\nВведите строку: ");
                in.nextLine(); // Consume newline
                String str19 = in.nextLine();
                System.out.println("Слова в обратном порядке: " + reverseWords(str19));
                break;
            case (20):
                System.out.print("Задача 20: Число Армстронга\nВведите число: ");
                int num20 = in.nextInt();
                System.out.println("Является числом Армстронга: " + isArmstrong(num20));
                break;
            default:
                System.out.println("Неверный номер задачи.");
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void countPositivesAndNegatives(int[] array) {
        int positiveCount = 0, negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimesInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, original = num;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == original;
    }
}

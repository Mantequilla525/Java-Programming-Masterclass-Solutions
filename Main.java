package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

    // Number in word exercise
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }

    // Number of days in month exercise (isLeapYear from Section 4)
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month,
                                     int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch(month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
        }
        return -1;
    }

    // Sum 3 and 5 challenge
    public static void sum3and5Challenge() {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count += 1;
                System.out.println("Found number: " + i);
                if (count >= 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of numbers divisible by 3 and 5: " + sum);
    }

    // Sum Odd exercise
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        }

        return true;
    }

    public static int sumOdd(int start,
                             int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <=  end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    // Number palindrome exercise
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int stored = number;
        int reverse = 0;

        if (number < 0) {
            stored = number * -1;
            originalNumber = originalNumber * -1;
        }

        while (stored > 0) {
            int digit = (stored % 10);
            reverse = reverse * 10;
            reverse += digit;
            stored = stored / 10;
        }

        if (reverse == originalNumber) {
            return true;
        }

        return false;
    }

    // First and last digit sum
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number > 9) {
            number = number / 10;
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }

    // Even digit sum
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            number = number / 10;
        }

        return sum;
    }

    // Shared digit
    public static boolean hasSharedDigit(int p1,
                                         int p2) {

        if (p1 < 10 || p1 > 99 || p2 < 10 || p2 > 99) {
            return false;
        }

        int p1_1 = p1 / 10;
        int p1_2 = p1 % 10;
        int p2_1 = p2 / 10;
        int p2_2 = p2 % 10;

        return (p1_1 == p2_1 || p1_1 == p2_2 || p1_2 == p2_1 || p1_2 == p2_2);
    }

    // Last digit checker
    public static boolean hasSameLastDigit(int p1,
                                           int p2,
                                           int p3) {

        if (!isValid(p1) || !isValid(p2) || !isValid(p3)) {
            return false;
        }

        int p1LastDigit = p1 % 10;
        int p2LastDigit = p2 % 10;
        int p3LastDigit = p3 % 10;

        return (p1LastDigit == p2LastDigit || p1LastDigit == p3LastDigit || p2LastDigit == p3LastDigit);
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    // Greatest common divisor
    public static int getGreatestCommonDivisor(int first,
                                               int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int divisor = Math.min(first, second);

        for (int i = divisor; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }

        return -1;
    }

    // All factors
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Perfect number
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0){
                sum += i;
            }
        }

        if (sum == number) {
            return true;
        }

        return false;
    }

    // Number to words
    public static void numberToWords(int number) {
        int newNumber = reverse(number);
        int oldDigits = getDigitCount(number);
        int newDigits = getDigitCount(newNumber);
        int difference = (oldDigits - newDigits);

        if (newNumber < 0) {
            System.out.println("Invalid Value");
            return;
        }


        while (newNumber > 0) {
            switch (newNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }

            newNumber = newNumber / 10;
        }

        if (difference != 0) {
            for (int i = 0; i < difference; i++) {
                System.out.println("Zero");
            }
        }

        if (number == 0) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        boolean negative = false;
        int reversed = 0;

        if (number < 0) {
            negative = true;
            number = number * -1;
        }

        while (number >= 1) {
            reversed *= 10;

            reversed += (number % 10);

            number /= 10;
        }

        if (negative) {
            return -reversed;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int digitCount = 0;

        while (number >= 1) {
            digitCount += 1;
            number /= 10;
        }

        return digitCount;
    }

    // Flour pack
    public static boolean canPack(int bigCount,
                                  int smallCount,
                                  int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int validBigFlour = goal / 5;
        if (bigCount > validBigFlour) {
            bigCount = validBigFlour;
        }

        if ((bigCount * 5) + smallCount >= goal) {
            return true;
        }
        return false;
    }

    // Largest prime
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }

        int largestSoFar = -1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    largestSoFar = i;
                }
            }
        }

        return largestSoFar;
    }

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number < 0 || number % 2 == 0 || number == 1) {
            return false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Diagonal star
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                // Print stars if first or last row
                if (i == 0 || i == number - 1) {
                    System.out.print("*");
                    continue;
                }

                // Print stars if first or last column
                if (j == 0 || j == number - 1) {
                    System.out.print("*");
                    continue;
                }

                // Print stars if row number == column number
                if (i == j) {
                    System.out.print("*");
                    continue;
                }

                // Print stars if column number == number - i + 1
                if (j == number - (i + 1)) {
                    System.out.print("*");
                    continue;
                }


                // Print empty space if conditions above not met
                    System.out.print(" ");
            }

            // Go to next line
            System.out.println();
        }

    }

    // Reading user input challenge
    public static void readingUserInputChallenge() {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count < 11) {
            System.out.print("Enter number #" + count + ": ");

            boolean nextInt = sc.hasNextInt();
            if (nextInt) {
                int input = sc.nextInt();
                sum += input;
                count += 1;
            } else {
                System.out.println("Invalid number");
            }

            sc.nextLine(); // Sets last input to null so program waits for new input
            System.out.println();
        }

        System.out.println("Sum of numbers: " + sum);
        sc.close();
    }

    // Min and max challenge
    public static void minAndMaxChallenge() {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");

            if (sc.hasNextInt()) {
                int input = sc.nextInt();

                if (input > max) {
                    max = input;
                }

                if (input < min) {
                    min = input;
                }
            } else {
                System.out.println("Invalid input.");
                break;
            }

            System.out.println();
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        sc.close();
    }

    // Input calculator
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            if (sc.hasNextInt()) {
                int input = sc.nextInt();

                sum += input;
                count += 1;
            }

            else {
                break;
            }
        }

        long avg = Math.round((double)sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + (int)(avg));
    }

    // Paint job
    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket,
                                     int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double requiredArea = width * height;
        double reqBucketsDouble = Math.ceil(requiredArea / areaPerBucket);

        int requiredBuckets = (int)(reqBucketsDouble);

        return requiredBuckets - extraBuckets;
    }

    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double requiredArea = width * height;
        double reqBucketsDouble = Math.ceil(requiredArea / areaPerBucket);

        int requiredBuckets = (int)(reqBucketsDouble);

        return requiredBuckets;
    }

    public static int getBucketCount(double area,
                                     double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double reqBucketsDouble = Math.ceil(area / areaPerBucket);

        int requiredBuckets = (int)(reqBucketsDouble);

        return requiredBuckets;
    }
}

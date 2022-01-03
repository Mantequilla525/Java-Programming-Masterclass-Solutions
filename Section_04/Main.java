package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    // Speed converter exercise
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }

        double exact = kilometersPerHour / 1.609;
        return (Math.round(exact));
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long converted = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + converted + " mi/h");
    }

    // MegaBytes converter exercise
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int converted = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + converted + " MB and " + remainder + " KB");
    }

    // Barking Dog exercise
    public static boolean shouldWakeUp(boolean barking,
                                       int hourOfTheDay) {
        if (((hourOfTheDay < 8 && hourOfTheDay >= 0) || (hourOfTheDay > 22 && hourOfTheDay <= 23)) && barking) {
            return true;
        }

        return false;
    }

    // Leap Year calculator exercise
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

    // Decimal comparator exercise with alternative
    public static boolean areEqualByThreeDecimalPlaces(double p1,
                                                       double p2) {
        int checker1 = (int)(p1 * 1000);
        int checker2 = (int)(p2 * 1000);

        if (checker1 - checker2 == 0) {
            return true;
        }

        return false;
    }

    public static boolean areEqualByThreeDecimalPlacesAlt(double p1,
                                                          double p2) {
        String str1 = Double.toString(p1);
        String[] str1Parts = str1.split("\\.");
        String floats1 = str1Parts[1];
        String characters1 = "" + floats1.charAt(0) + floats1.charAt(1) + floats1.charAt(2);
        System.out.println(characters1);

        String str2 = Double.toString(p2);
        String[] str2Parts = str1.split("\\.");
        String floats2 = str1Parts[1];
        String characters2 = "" + floats2.charAt(0) + floats2.charAt(1) + floats2.charAt(2);
        System.out.println(characters2);

        if (characters1 == characters2) {
            return true;
        }

        return false;
    }

    // Equal sum checker exercise
    public static boolean hasEqualSum(int p1,
                                      int p2,
                                      int p3) {
        if ((p1 + p2) == p3) {
            return true;
        }

        return false;
    }

    // Teen Number checker exercise
    public static boolean hasTeen(int p1,
                                  int p2,
                                  int p3) {
        if (isTeen(p1) || isTeen(p2) || isTeen(p3)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int p) {
        if (p >= 13 && p <= 19) {
            return true;
        }

        return false;
    }


    // Calculate feet and inches to centimeters
    public static double calcFeetAndInchesToCentimeters(int feet,
                                                        int inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return -1;
        }

        int totalInches = (feet * 12) + inches;

        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0 || inches > 12) {
            return -1;
        }

        return inches * 2.54;
    }

    // Seconds and minutes challenge
    public static String getDurationString(int minutes,
                                           int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        String minutesStr = String.format("%02d", remainderMinutes);
        String secondsStr = String.format("%02d", seconds);

        return (hours + "h " + minutesStr + " m " + secondsStr + "s");
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;

        return getDurationString(minutes, remainderSeconds);
    }

    // Area calculator exercise
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x,
                              double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    // Minutes to years and days calculator exercise
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long daysRemainder = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + daysRemainder + " d");
    }

    // Equality Printer exercise
    public static void printEqual(int p1,
                                  int p2,
                                  int p3) {
        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (p1 == p2 && p1 == p3) {
            System.out.println("All numbers are equal");
        } else if ((p1 != p2) && (p2 != p3) && (p1 != p3) ) {
            System.out.printf("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    // Playing Cat exercise
    public static boolean isCatPlaying(boolean summer,
                                       int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }

        return false;
    }
}

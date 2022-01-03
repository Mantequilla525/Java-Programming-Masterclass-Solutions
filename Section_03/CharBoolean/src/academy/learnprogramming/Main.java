package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);
        System.out.println('\u00A9');

        boolean trueValue = true;
        boolean falseValue = false;

        boolean check;
        check = (2 == 5);
        System.out.println(check);

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
    }
}

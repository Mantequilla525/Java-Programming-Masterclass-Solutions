package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double doubleVar = 20.0;
        double doubleVar2 = 80.0;
        double result1 = (doubleVar + doubleVar2) * 100.0;
        double remainder = result1 % 40.0;
        boolean checkBool = (remainder == 0) ? true : false;
        System.out.println(checkBool);

        if (!checkBool) {
            System.out.println("Got some remainder");
        }

    }
}

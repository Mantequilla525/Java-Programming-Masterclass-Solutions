package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min: " + minFloat);
        System.out.println("Float max: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double min: " + minDouble);
        System.out.println("Double max: " + maxDouble);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("intValue: " + intValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
    }
}

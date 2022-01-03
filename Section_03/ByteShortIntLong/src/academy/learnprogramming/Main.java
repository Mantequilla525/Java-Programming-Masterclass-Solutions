package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
	    int value = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted max int value = " + (myMaxIntValue + 1));
        System.out.println("Busted min int value = " + (myMinIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min:" + minByteValue);
        System.out.println("Byte max:" + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short min:" + minShortValue);
        System.out.println("Short max:" + maxShortValue);
        
        long longValue = 100L;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long min:" + minLongValue);
        System.out.println("Long max:" + maxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int total = (myMinIntValue / 2);

        byte newByteValue = (byte)(myMinIntValue / 2);

        short newShortValue = (short)(myMinIntValue / 2);

        byte challengeByte = 112;
        short challengeShort = 4_125;
        int challengeInt = 6_821_125;
        long challengeLong = 50_000L + (10L * (challengeByte + challengeShort + challengeInt));
        System.out.println(challengeLong);
    }
}

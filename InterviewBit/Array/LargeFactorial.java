package InterviewBit.Array;

public class LargeFactorial {
    public static void main(String[] args) {
        int a = 99;
        java.math.BigInteger fact = new java.math.BigInteger("1");
        for (int i = 1; i <= a; i++) {
            fact = new java.math.BigInteger(fact.multiply(new java.math.BigInteger(Integer.toString(i))).toString());
        }
        System.out.println(fact.toString());
        System.out.println(-1%3);
    }
}

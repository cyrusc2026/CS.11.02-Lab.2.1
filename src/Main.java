// I have neither given nor received unauthorized aid on this piece of work.


public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b) {
    int sum = (a+b);
        return sum;
    }

    // 2. add
public static int add(int a,int b, int c, int d){
        int twonumbers = add(a,b);
        int threenumbers = add(twonumbers,c);
        int fournumbers = add(threenumbers,d);
        return fournumbers;
}
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        String morningGreeting = ("早上好,  "+ name + "!");
        return morningGreeting;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        String afternoonGreeting = ("下午好,  " + name + "!");
        return afternoonGreeting;
    }
// 5. triple
        public static String triple(String name) {
            String triple = (name + name + name);
            return triple;
        }
    // 6. half
    public static double half(int number) {
        double half = (number/ 2);
        return half;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        int roundednumber = (int) Math.round (number);
        return roundednumber;
    }


    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        int roundednumber = (int) Math.round (number);
        return roundednumber;
    }

}

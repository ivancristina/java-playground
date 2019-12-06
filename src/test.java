import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class test {
    public static void main(String[] args){
        //ivan.test();
        ivan.operations();
        ivan.basics();
        ivan.console();
    }
}
class ivan {
    public static void test(){
        boolean bool = false;   // True/false
        byte bt = 2;
        short sh = 4;
        int i = 8;  // 0-255
        double db = 16;
        long lo = 32;
        char c = (char)65;
        String string = "Hello Ivan";
        System.out.println(bool + ", " + bt + ", " + sh + ", " + i + ", " + db + ", "  + lo + ", " + c + ", " + string);
        System.out.println((char)67 + "" + (char)105  + "" + (char)97 + "" + (char)111);
    }
    static void operations(){
        int x = 15;
        int y = 12;
        int sum = x + y;
        int dif = x - y;    // Also x ^ y
        int mol = x * y;
        int div = x / y;
        int rst = x % y;
        //double pwr = Math.pow(x, y);  // Power should be a double, but I want it as an int
        int pwr = (int) Math.pow(x, y); // So I cast it as an int
        double log = (Math.log(x) / (Math.log(y))); // Logarithm of x to the base of y
        System.out.println(x + " sum to " + y + " is " + sum);
        System.out.println(x + " minus " + y + " is " + dif);
        System.out.println(x + " times " + y + " is " + mol);
        System.out.println(x + " divided by " + y + " is " + div + ". The rest is " + rst + ". Exact result is " + (x/y));
        System.out.println(x + " to the power of " + y + " is " + pwr);
        System.out.println("Logarithm of " + x + " in base " + y + " is " + log);
    }
    static void basics(){
        Random random = new Random();

        for (int i = 0; i<10; i++){
            boolean coin = random.nextBoolean();
            if (coin){
                System.out.println("Head");
            }else{
                System.out.println("Cross");
            }
        }
    }

    static void console() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package pro23;

/**
 * @author ζ―θθΏζ
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + calculate(5));
    }

    static int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }
}
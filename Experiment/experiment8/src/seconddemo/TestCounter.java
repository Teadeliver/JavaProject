package seconddemo;

/**
 * @author ζ―θθΏζ
 */
public class TestCounter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread counter = new Counter(storage);
        Thread printer =new Printer(storage);

        counter.start();
        printer.start();
    }
}

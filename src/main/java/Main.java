import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] argv) throws InterruptedException {
        Model.begin();
        sleep(10000);
        Model.end();
    }
}

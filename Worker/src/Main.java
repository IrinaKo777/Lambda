import java.util.function.*;
public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = x -> System.out.println(x);
        OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}

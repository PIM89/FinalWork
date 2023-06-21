package Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static AtomicInteger num = new AtomicInteger();

    public Counter() {
    }
    public int add() {
        return num.incrementAndGet();
    }
}

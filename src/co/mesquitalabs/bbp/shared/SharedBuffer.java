package co.mesquitalabs.bbp.shared;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

    public void produce(int item) throws InterruptedException {
        queue.put(item);  // espera se estiver cheio
        System.out.println("Produzido: " + item);
    }

    public int consume() throws InterruptedException {
        int item = queue.take();  // espera se estiver vazio
        System.out.println("Consumido: " + item);
        return item;
    }
}

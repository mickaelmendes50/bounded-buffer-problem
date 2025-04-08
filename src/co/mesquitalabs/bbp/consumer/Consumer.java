package co.mesquitalabs.bbp.consumer;

import co.mesquitalabs.bbp.shared.SharedBuffer;

public class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep((int)(Math.random() * 150));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

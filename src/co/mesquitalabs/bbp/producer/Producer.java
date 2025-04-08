package co.mesquitalabs.bbp.producer;

import co.mesquitalabs.bbp.shared.SharedBuffer;

public class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final int producerId;

    public Producer(SharedBuffer buffer, int producerId) {
        this.buffer = buffer;
        this.producerId = producerId;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int item = producerId * 100 + i;  // valor único por produtor
                buffer.produce(item);
                Thread.sleep((int)(Math.random() * 100));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

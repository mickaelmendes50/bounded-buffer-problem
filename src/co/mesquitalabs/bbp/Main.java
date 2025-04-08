package co.mesquitalabs.bbp;

import co.mesquitalabs.bbp.consumer.Consumer;
import co.mesquitalabs.bbp.producer.Producer;
import co.mesquitalabs.bbp.shared.SharedBuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Criar e iniciar múltiplos produtores e consumidores
        ExecutorService executor = Executors.newFixedThreadPool(6);

        // 3 produtores
        for (int i = 0; i < 3; i++) {
            executor.execute(new Producer(buffer, i));
        }

        // 3 consumidores
        for (int i = 0; i < 3; i++) {
            executor.execute(new Consumer(buffer));
        }

        executor.shutdown();
    }
}
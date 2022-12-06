package com.oguzhan.bektas.java.news.java8;

import java.util.concurrent.*;

public class ConcurrencyEnhancement {
    /*
    Java 8’e kadar Java 5 ile beraber gelen Thread yapısı kullanılıyordu ve burda biz yönetmek zorunda kalıyorduk.
    E tabi biraz da bug’lar giderilip stabil hale getirildi. Java 8 ile beraber yeni Concurrency API geliştirldi ve
     böylece concurrent/multitasking işlemler daha anlaşılır ve yönetmesi daha kolay hale geldi. Java 8 ile beraber
     açık olarak Thread nesnelerini oluşturmak ve yönetmek zorunda kalmayacaksınız, çünkü bu işi yapacak bir
     ExecutorService’imiz var artık.
     */

    public static void main(String[] args) throws InterruptedException {
        // Java 5 ile ;Runnable bir task ve Thread objesi oluşturduk.
        // Daha sonra runnable task’ı Thread objesine atadık ve Thread’i start ettik. Bu eski ve sıkıcı bir yöntem.
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

        // Java 8 ile
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
//        Hello pool-1-thread-1
//        Executors yapısı Java 8 ile gelen bir yenilik demiştik. Birçok factory metod içeriyor.
//        Böylece yönetmesi çok daha kolay hale gelmiş durumda. Yukarıdaki örneğimizde single thread
//        içeren executor oluşturduk. Bu servis asenkron olarak (yani arkaplanda paralel olarak) hep çalışmaktadır.
//        İstesek bu servisi stop edebiliriz.
        executor.shutdown(); // executor üzerinde bir task var ise onu bitirmesini bekler.
        executor.shutdownNow(); // executor üzerinde bir taskın olup olmadığna bakmaksızın stop eder.
        executor.awaitTermination(5, TimeUnit.SECONDS); // executor'ın 5 sn sonra kapanmasını sağlar.
//        Executor örnekleri için yazının başında ki repoyu kullanabilirsiniz.
//        Executor üzerinde task koşturmayı öğrendikten sonra periyodik olarak taskları nasıl tekrar çalıştırırız,
//        belirli gecikmeler ile nasıl çalıştırırız ona bakalım. Java 8 ile gelen ScheduledExecutor bizim için
//        bunu yapacaktır. Örnekleyelim, 3 saniye gecikmeli olarak başlasın;
        ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(1);

        Runnable task2 = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor2.schedule(task2, 3, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);

//        Periyodik olarak tekrar edecek şekilde çalıştıralım;
        ScheduledExecutorService executor3 = Executors.newScheduledThreadPool(1);

        Runnable task3 = () -> System.out.println("Scheduling: " + System.nanoTime());

        int initialDelay = 0;
        int period = 1;
        executor3.scheduleAtFixedRate(task3, initialDelay, period, TimeUnit.SECONDS);
    }
}

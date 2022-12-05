package com.oguzhan.bektas.java.news.java8;

import com.oguzhan.bektas.java.news.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {

    /*
    Bu özellik sayesinde daha az satır kod yazıyoruz diyebiliriz. Bir metodu tıpkı nesne veya değişkenmiş gibi
    kullanabilmemizi hatta parametre geçirebilmemizi sağlar.

    Şu sembol :: ile metod çağırımı yapılır.

    Burda şuna açıklık getirmek isterim. Biz zaten statik olarak tanımladığımız metodlara obje oluşturmaksızın sınıf
    ismine nokta koyarak metodlarına erişiyoruz. Fakat aşağıdaki örnekte bunu Java 8 ile beraber gelen metod referansı
     yöntemiyle ifade ettim.

    Sıradaki örneğimizde ise statik olmayan bir metodu referans yöntemiyle nasıl kullandık, inceleyelim.


     */

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }

    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        Thread t = new Thread(MethodReferences::ThreadStatus);
        t.start();

        // 2. Example

        MethodReferences methodReference = new MethodReferences(); // Creating object
        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new MethodReferences()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
        Car car1 = new Car();
        car1.kilometers = 5001;
        Car car2 = new Car();
        car2.kilometers = 5001;
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        List<String> methodReferenceList = cars.stream().map(Car::toString)
                .collect(Collectors.toList());
        methodReferenceList.stream().forEach(System.out::println);
    }
}

interface Sayable {
    void say();
}

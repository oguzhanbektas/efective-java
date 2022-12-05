package com.oguzhan.bektas.java.news.java8;

import com.oguzhan.bektas.java.news.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

    /*
    Lambda expressionlar, herhangi bir class’a ait olmadan iş yapabilen fonksiyonlardır.
    Lambda ile birlikte Java, funtional programming dünyasına da girmiş bulunmaktadır.
    Bu oldukça önemli bir gelişme, Java’nın ilerde gideceği yol hakkında da ipucu veriyor bizlere.
    Lambda sayesinde hem daha okunabilir kod üretiyor, hem de kod tekrarından kurtuluyoruz. Bir lambda ifadesini
    tekrar tekrar kullanabilir, parametre olarak başka bir yere iletebiliriz. Lambda syntax’ına bakalım;

    (argument-list) -> {body}

    argument-list : empty yada birden fazla olabilir duruma göre.
    -> : arrow token, parametreler ile body statement’ı linkler.
    {body} : expression yani asıl kodu içeren kısımdır.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        Car car1 = new Car();
        car1.kilometers = 5001;
        Car car2 = new Car();
        car2.kilometers = 5001;
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        // The World Before Lambda Expressions
        List<Car> carsOldWay = findCarsOldWay(carList);
        List<Car> carsNewWay = findCarsUsingLambda(carList);
    }

    interface StringFunction {
        String run(String str);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    public static List<Car> findCarsOldWay(List<Car> cars) {
        List<Car> selectedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.kilometers < 50000) {
                selectedCars.add(car);
            }
        }
        return selectedCars;
    }

    public static List<Car> findCarsUsingLambda(List<Car> cars) {
        return cars.stream().filter(car -> car.kilometers < 50000)
                .collect(Collectors.toList());
    }
}

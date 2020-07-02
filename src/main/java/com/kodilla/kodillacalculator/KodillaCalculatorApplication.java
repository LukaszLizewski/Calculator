package com.kodilla.kodillacalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);
        Calculator object = new Calculator();
        object.addAtoB(5,5);
        System.out.println("Adding: "+object.addAtoB(123,2));
        System.out.println("Subtracting: "+object.subtractBfromA(123,2));
    }
}



package com.overriding;

public class Anjing extends Hewan {

    @Override
    void suara() {
        System.out.println("Anjing berkata: Guk guk");
    }
}

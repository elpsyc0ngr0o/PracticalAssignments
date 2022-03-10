package com.tsi.java.oop.interfaces;

public class PaymentSystem {

    void pay(Payable payableTicket) {
        System.out.println("Charging amount: " + payableTicket.getPrice());

    }
}

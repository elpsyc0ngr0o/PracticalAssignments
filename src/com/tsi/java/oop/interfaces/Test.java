package com.tsi.java.oop.interfaces;

public class Test {

    public static void main(String... args) {
        var bookingSystem = new BookingSystem();
        var paymentSystem = new PaymentSystem();

        var ticket = new Ticket ("Mithun", 100);

        bookingSystem.book(ticket);
        paymentSystem.pay(ticket);

    }
}

package GOODCODE.Strategy.impl;

import GOODCODE.Strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}

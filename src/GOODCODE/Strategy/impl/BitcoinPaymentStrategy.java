package GOODCODE.Strategy.impl;

import GOODCODE.Strategy.PaymentStrategy;

public class BitcoinPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with Bitcoin");
    }
}

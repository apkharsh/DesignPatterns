//import withoutStrategyPattern.PaymentSystem;

import GOODCODE.Factory.PaymentStrategyFactory;
import GOODCODE.Strategy.PaymentStrategy;
import GOODCODE.PaymentSystem;
public class Main {

    public static void main(String[] args) {

        // Logic: Multuple classes needed same code, for example multipple vehicles wanted to drive normally and instread of writing same code in all classes, we can use strategy pattern to avoid code duplication
        // Without strategy pattern
        // PaymentSystem paymentSystem = new PaymentSystem();

        // paymentSystem.pay("CreditCard", 100.0);
        // paymentSystem.pay("PayPal", 50.0);
        // paymentSystem.pay("Bitcoin", 200.0);


        // With strategy pattern

        // withouT factory pattern
        // PaymentSystem paymentSystem = new PaymentSystem(new CreditCardPaymentStrategy());
        // PaymentSystem paymentSystem1 = new PaymentSystem(new BitcoinPaymentStrategy());
        // paymentSystem.pay(100);
        // paymentSystem1.pay(500);

        // Now  after implementing the strategy pattern, we can add new payment methods without modifying the PaymentSystem class. This is the beauty of the Strategy pattern.
        // Now you may notice that we have to create the object of the PaymentSystem class with the desired payment strategy. This is the only place where we have to change the code if we want to add a new payment method.

        // We can also use the factory pattern to create the object of the PaymentSystem class. This way we can further decouple the code.
        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();
        PaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy("CREDIT_CARD");
        PaymentSystem paymentSystem2 = new PaymentSystem(paymentStrategy);
        paymentSystem2.pay(100);


    }
}
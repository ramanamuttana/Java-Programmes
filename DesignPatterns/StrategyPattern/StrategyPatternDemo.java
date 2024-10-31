package org.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        context.setPaymentStrategy(new CreditCardStrategy("1234-5678-9876-5432"));
        context.payAmount(100);

        // Paying with PayPal
        context.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        context.payAmount(150);

        // Paying with Bitcoin
        context.setPaymentStrategy(new BitcoinStrategy("1FfmbHfnpaZjKFvyi1okTjhphnnnnnJJusN455paPH"));
        context.payAmount(200);
    }
}


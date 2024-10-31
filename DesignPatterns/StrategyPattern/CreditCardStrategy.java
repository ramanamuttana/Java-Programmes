package org.strategy;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

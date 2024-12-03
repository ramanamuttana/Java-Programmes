package org.factoryPattern;

public class FactoryMethodDemo {

    public static void main(String[] args){
        NotificationFactory factory = getFactory("Email");
        Notification notification = factory.createNotification();
        notification.notifyUser();
    }

    public static NotificationFactory getFactory(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotificationFactory();
        } else if (type.equalsIgnoreCase("Email")) {
            return new EmailNotificationFactory();
        }
        throw new IllegalArgumentException("Unknown notification type");
    }
}

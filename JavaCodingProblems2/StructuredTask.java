
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.ExecutionException;

public class StructuredTask {
    public static void main(String[] args) throws InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var userTask = scope.fork(() -> fetchUser());
            var orderTask = scope.fork(() -> fetchOrders());
            var orderProducts = scope.fork(()->fetchProducts());

            scope.join(); // wait for both
            scope.throwIfFailed(); // throw if any failed

            String user = userTask.get();
            String orders = orderTask.get();
            String products=orderProducts.get();

            System.out.println("User: " + user);
            System.out.println("Orders: " + orders);
            System.out.println("Products: " + products);

        } catch (ExecutionException e) {
            System.err.println("Error in task: " + e.getCause());
        }
    }

    static String fetchUser() throws InterruptedException {
        Thread.sleep(100);
        return "User: Alice";
    }

    static String fetchOrders() throws InterruptedException {
        Thread.sleep(150);
        return "Orders: [Pizza, Burger]";
    }
    static String fetchProducts() throws InterruptedException {
        throw new RuntimeException();
    }
}

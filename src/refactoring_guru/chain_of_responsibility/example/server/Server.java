package refactoring_guru.chain_of_responsibility.example.server;

import refactoring_guru.chain_of_responsibility.example.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * EN: Server class.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * EN: Client passes a chain of object to server. This improves flexibility
     * and makes testing the server class easier.
     * <p>
     * упрощает тестирование класса сервера.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * EN: Server gets email and password from client and sends the
     * authorization request to the chain.
     * <p>
     * авторизации у цепочки.
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // EN: Do something useful here for authorized users.
            //
            // RU: Здесь должен быть какой-то полезный код, работающий для
            // авторизированных пользователей.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}

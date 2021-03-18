package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.abstract_factory.example.factories.impl.MacOSFactory;
import refactoring_guru.abstract_factory.example.factories.impl.WindowsFactory;

/**
 * EN: Demo class. Everything comes together here.
 *
  */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     *
          * исходя из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

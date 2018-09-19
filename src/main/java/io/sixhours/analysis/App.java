package io.sixhours.analysis;

@SuppressWarnings("PMD.TooManyMethods")
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    @SuppressWarnings("PMD.SystemPrintln")
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

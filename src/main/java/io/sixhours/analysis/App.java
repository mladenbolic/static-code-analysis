package io.sixhours.analysis;

// NOTE: we do not need to suppress TooManyMethods here, it is here for illustration purposes only
@SuppressWarnings("PMD.TooManyMethods")
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    // Example of suppressing the SystemPrintln
    @SuppressWarnings("PMD.SystemPrintln")
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

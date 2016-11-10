package net.sample.prod;

public class MyService {

    public String get() {
        return "My servlet response.";
    }

    public String uncovered() {
        return "I am not covered.";
    }
}

package Exceções;

public class SenhaInvalida extends RuntimeException {
    public SenhaInvalida(String message) {
        super(message);
    }
}

package model;

public interface PaymentAcceptor {
    boolean authentication();
    int getAmount();
    void addAmount();
    boolean deductAmount(int amount);
}

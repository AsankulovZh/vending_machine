package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean authentication() {
        return false;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void addAmount() {

    }

    @Override
    public boolean deductAmount(int amount) {
        return false;
    }
}

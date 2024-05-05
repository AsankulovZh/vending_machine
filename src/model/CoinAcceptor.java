package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean authentication() {
        return true;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void addAmount() {
        setAmount(amount + 10);
    }

    @Override
    public boolean deductAmount(int price) {
        if (this.amount >= amount){
            setAmount(amount - price);
            return true;
        }
        return false;
    }
}

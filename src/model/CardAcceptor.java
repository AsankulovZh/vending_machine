package model;

import java.util.Scanner;

public class CardAcceptor implements PaymentAcceptor {
    private int balance;

    public CardAcceptor(int balance){
        this.balance = balance;
    }

    @Override
    public boolean authentication() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите номер карты (номер: 123): ");
            String cardNumber = sc.nextLine();
            System.out.println("Введите пароль карты (пароль: 123): ");
            String cardPassword = sc.nextLine();
            if (cardNumber.equals("123") && cardPassword.equals("123")){
                return true;
            } else {
                System.out.println("Неверные данные!");
            }
        }
    }

    @Override
    public int getAmount() {
        return balance;
    }

    @Override
    public void addAmount() {
        setBalance(balance + 10);
    }

    @Override
    public boolean deductAmount(int price) {
        if (this.balance >= balance){
            setBalance(balance - price);
            return true;
        }
        return false;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

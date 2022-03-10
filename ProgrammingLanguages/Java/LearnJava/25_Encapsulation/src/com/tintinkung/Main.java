package com.tintinkung;

class Account {

    // public can be access anywhere
    public int balance = 1000;

    // private can't be access, needs getter or setter
    private int bank = 150;

    void deposit(int money) {
        System.out.println("[B] deposited " + money + "$ to account");
        balance -= money;
        bank += money;
    }

    public int getBank() {
        return bank;
    }
}



public class Main {

    public static void main(String[] args) {


        Account tin_account = new Account();

        /* tin_account.balance can be can access because it's public variable
         * tin_account.bank  can't be access since its private variable
         */
        System.out.println("[1] Tin's bank: "
            + tin_account.getBank()
            + "$\n[1] Tin's balance: "
            + tin_account.balance + "$");

        tin_account.deposit(500);

        System.out.println("[2] Tin's bank: "
            + tin_account.getBank()
            + "$\n[2] Tin's balance: "
            + tin_account.balance + "$");
    }
}

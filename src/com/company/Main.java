package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int totalIncome = payments.stream()
                .filter(payment -> payment.amount > 0)
                .map(payment -> payment.amount)
                .reduce(0, (p1, p2) -> p1 + p2)
                .sum ;



    }
}

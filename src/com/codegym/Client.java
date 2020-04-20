package com.codegym;

public class Client {

    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(100, 1, 20);
        System.out.println("Random Even list: ");
        randomListFacade.printRandomEvenList();
        System.out.println("Random Odd list: ");
        randomListFacade.printRandomOddList();
    }
}

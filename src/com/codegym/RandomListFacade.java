package com.codegym;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private  int max;
    private  int min;
    private  int size;

    public RandomListFacade(int max, int min, int size) {
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
        randomList = new RandomList();
        this.max = max;
        this.min = min;
        this.size = size;
    }

    public void printRandomEvenList() {
        List<Integer> integerList = randomList.generateList(size, min, max);
        List<Integer> listEven = listFilter.filterOdd(integerList);
        listPrinter.printList(listEven);
    }

    public void printRandomOddList() {
        List<Integer> integerList1 = randomList.generateList(size, min, max);
        List<Integer> listOdd = listFilter.filterEven(integerList1);
        listPrinter.printList(listOdd);
    }
}

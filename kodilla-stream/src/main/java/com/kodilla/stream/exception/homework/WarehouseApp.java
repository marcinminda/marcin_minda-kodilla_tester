package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("ORD1"));
        warehouse.addOrder(new Order("ORD2"));
        warehouse.addOrder(new Order("ORD3"));

        try {
            Order order = warehouse.getOrder("ORD6");
            System.out.println("Znaleziono zamowienie numer " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie ma takiego zamowienia");
        }
    }
}

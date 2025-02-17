package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {
    @Test
    public void testGetOrderThrowsException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("ORD1"));
        warehouse.addOrder(new Order("ORD2"));
        warehouse.addOrder(new Order("ORD3"));

        Exception exception = assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("ORD9");
        });
        assertEquals(null, exception.getMessage());
    }
}
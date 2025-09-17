package com.mycompany.pruebatecnica.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final String id;
    private final LocalDateTime createdAt;
    private final List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;

    // TODO: Constructor
    // TODO: Métodos para agregar/quitar productos del pedido
    // TODO: Método para calcular el total del pedido
}

package com.sharma.nakul;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    private int orderId;

    private int userId;

    private int productId;


    private int quantity;

    private int price;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}

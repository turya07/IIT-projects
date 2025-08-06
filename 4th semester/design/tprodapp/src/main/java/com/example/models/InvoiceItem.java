package com.example.models;

import java.time.LocalDateTime;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InvoiceItem {
    private static InvoiceItem instance;
    private final IntegerProperty customerId;
    private final StringProperty productName;
    private final IntegerProperty quantity;
    private final DoubleProperty unitPrice;
    private final DoubleProperty lineTotal;
    private LocalDateTime orderDate;

    private InvoiceItem(int cid, String productName, int quantity, double unitPrice, double lineTotal,
            String orderDate) {
        this.customerId = new SimpleIntegerProperty(cid);
        this.productName = new SimpleStringProperty(productName);
        this.quantity = new SimpleIntegerProperty(quantity);
        this.unitPrice = new SimpleDoubleProperty(unitPrice);
        this.lineTotal = new SimpleDoubleProperty(lineTotal);
        this.orderDate = LocalDateTime.parse(orderDate.replace(' ', 'T'));
    }

    // 2007-12-03T10:15:30
    public static void init(int cid, String productName, int quantity, double unitPrice, double lineTotal,
            String orderDate) {
        InvoiceItem.instance = new InvoiceItem(cid, productName, quantity, unitPrice, lineTotal, orderDate);
    }

    public LocalDateTime getDate() {
        return orderDate;
    }

    public int getCustomerId() {
        return customerId.get();
    }

    public String getProductName() {
        return productName.get();
    }

    public int getQuantity() {
        return quantity.get();
    }

    public double getUnitPrice() {
        return unitPrice.get();
    }

    public double getLineTotal() {
        return lineTotal.get();
    }

    // getter of instance
    public static InvoiceItem getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "InvoiceItem ["
                + "productName=" + productName.get() + ", quantity=" + quantity.get() + ", unitPrice="
                + unitPrice.get()
                + ", lineTotal=" + lineTotal.get() + "]";
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

}

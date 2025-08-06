package com.example.controller;

import com.example.App;
import com.example.models.InvoiceItem;

import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class InvoiceController {
    InvoiceItem invoiceItem = InvoiceItem.getInstance();
    @FXML
    private Text invoiceNumberText;
    @FXML
    private Text invoiceDateText;
    @FXML
    private Text customerNameText;
    @FXML
    private Text customerPhoneText;
    @FXML
    private Button backButton;
    @FXML
    private Button printButton;
    @FXML
    private TableView<InvoiceItem> orderItemsTable;
    @FXML
    private TableColumn<InvoiceItem, String> itemNameColumn;
    @FXML
    private TableColumn<InvoiceItem, Integer> quantityColumn;
    @FXML
    private TableColumn<InvoiceItem, Double> unitPriceColumn;
    @FXML
    private TableColumn<InvoiceItem, Double> lineTotalColumn;
    @FXML
    private Text subtotalText;
    @FXML
    private Text taxText;
    @FXML
    private Text shippingText;
    @FXML
    private Text grandTotalText;

    private ObservableList<InvoiceItem> invoiceItems = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        invoiceItems.add(invoiceItem);
        invoiceNumberText.setText(invoiceItem.getProductName());
        invoiceDateText.setText("Invoice Date: " + invoiceItem.getDate());
        orderItemsTable.setItems(invoiceItems);
        customerNameText.setText(Integer.toString(invoiceItem.getCustomerId()));
        customerPhoneText.setText(Integer.toString(invoiceItem.getCustomerId()));
        invoiceDateText.setText(
                invoiceItem.getDate().toLocalDate().toString() + " " + invoiceItem.getDate().toLocalTime().toString());
    }

    @FXML
    protected void printInvoice() {
        System.out.println("DATE: " + invoiceItem.getDate());
        System.out.println(invoiceItem);

    }

    @FXML
    protected void goBack() {
        try {
            App.setRoot("admin/orderspage");
        } catch (Exception e) {
            System.err.println("Error navigating back to orders page: " + e.getMessage());
            e.printStackTrace();
        }

    }
}

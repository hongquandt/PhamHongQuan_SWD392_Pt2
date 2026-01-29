package org.example.model;

import java.time.LocalDateTime;

public class Payment {
    private String id;
    private double amount;
    private LocalDateTime paymentDate;
    private Booking booking;

    public Payment(String id, double amount, LocalDateTime paymentDate) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

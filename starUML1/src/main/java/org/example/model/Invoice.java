package org.example.model;

import java.time.LocalDateTime;

public class Invoice {
    private String id;
    private double amount;
    private LocalDateTime issueDate;
    private Booking booking;

    public Invoice(String id, double amount, LocalDateTime issueDate) {
        this.id = id;
        this.amount = amount;
        this.issueDate = issueDate;
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

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

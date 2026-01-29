package org.example.model;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private String id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Guest guest;
    private List<Room> rooms;
    private Invoice invoice;
    private Payment payment;

    public Booking(String id, LocalDate checkInDate, LocalDate checkOutDate, Guest guest, List<Room> rooms) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guest = guest;
        this.rooms = rooms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
        if (invoice != null && invoice.getBooking() != this) {
            invoice.setBooking(this);
        }
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
        if (payment != null && payment.getBooking() != this) {
            payment.setBooking(this);
        }
    }
}

package org.example.controller;

import org.example.model.Booking;
import org.example.service.IBookingService;
import java.time.LocalDate;
import java.util.List;

public class BookingController {
    private final IBookingService bookingService;

    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    public Booking makeReservation(String guestId, List<String> roomIds, LocalDate checkIn, LocalDate checkOut) {
        return bookingService.makeReservation(guestId, roomIds, checkIn, checkOut);
    }

    public boolean cancelReservation(String bookingId) {
        return bookingService.cancelReservation(bookingId);
    }
}

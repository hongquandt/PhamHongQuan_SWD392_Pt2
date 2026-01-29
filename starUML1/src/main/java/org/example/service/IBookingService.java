package org.example.service;

import org.example.model.Booking;
import org.example.model.Room;
import java.time.LocalDate;
import java.util.List;

public interface IBookingService {
    Booking makeReservation(String guestId, List<String> roomIds, LocalDate checkIn, LocalDate checkOut);
    boolean cancelReservation(String bookingId);
    boolean checkAvailability(List<String> roomIds, LocalDate checkIn, LocalDate checkOut);
    double calculateTotal(Booking booking);
    void applyDiscount(Booking booking, String discountCode);
}

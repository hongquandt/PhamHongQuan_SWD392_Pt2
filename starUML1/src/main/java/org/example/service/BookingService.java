package org.example.service;

import org.example.model.*;
import org.example.repository.IBookingRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService implements IBookingService {

    private final IBookingRepository bookingRepository;
    // In a real app, we would inject GuestRepository and RoomRepository here
    
    public BookingService(IBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking makeReservation(String guestId, List<String> roomIds, LocalDate checkIn, LocalDate checkOut) {
        // 1. Check availability
        if (!checkAvailability(roomIds, checkIn, checkOut)) {
            throw new RuntimeException("Rooms not available");
        }

        // 2. Load entities (Mocking extraction for this exercise)
        Guest guest = new Guest(guestId, "Mock Name", "mock@email.com"); 
        List<Room> rooms = new ArrayList<>();
        for (String rId : roomIds) {
            rooms.add(new Room(rId, RoomType.SINGLE, 100.0)); // Mock room
        }

        // 3. Create Booking
        Booking booking = new Booking(UUID.randomUUID().toString(), checkIn, checkOut, guest, rooms);

        // 4. Calculate Total
        double total = calculateTotal(booking);
        // Save booking
        return bookingRepository.save(booking);
    }

    @Override
    public boolean cancelReservation(String bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            bookingRepository.deleteById(bookingId);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability(List<String> roomIds, LocalDate checkIn, LocalDate checkOut) {
        // Logic to check if rooms are free
        return true; // Mock
    }

    @Override
    public double calculateTotal(Booking booking) {
        double total = 0;
        long days = booking.getCheckOutDate().toEpochDay() - booking.getCheckInDate().toEpochDay();
        for (Room room : booking.getRooms()) {
            total += room.getPrice() * days;
        }
        return total;
    }

    @Override
    public void applyDiscount(Booking booking, String discountCode) {
        // Apply discount logic
    }
}

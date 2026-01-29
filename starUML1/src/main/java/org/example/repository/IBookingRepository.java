package org.example.repository;

import org.example.model.Booking;

import java.util.List;
import java.util.Optional;

public interface IBookingRepository {
    Booking save(Booking booking);
    Optional<Booking> findById(String id);
    List<Booking> findAll();
    void deleteById(String id);
    // Add other methods as needed to support Service logic
}

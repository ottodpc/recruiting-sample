package com.example.recruiting.rentalcar;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author juergen.windhaber
 *
 * Class which holds the status of a reservation.
 */
public class ReservationDto {

    private String driverName;
    private BookingStatus bookingStatus;
    private LocalDate reservationDate;

    private LocalDateTime timestamp;

    public ReservationDto(String driverName, BookingStatus bookingStatus, LocalDate reservationDate, LocalDateTime timestamp) {
        this.driverName = driverName;
        this.bookingStatus = bookingStatus;
        this.reservationDate = reservationDate;
        this.timestamp = timestamp;
    }

    public enum BookingStatus {
        CONFIRMED, CANCELED;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

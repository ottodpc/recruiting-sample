package com.example.recruiting.rentalcar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.example.recruiting.rentalcar.ReservationDto.BookingStatus.CANCELED;
import static com.example.recruiting.rentalcar.ReservationDto.BookingStatus.CONFIRMED;
import static java.time.LocalDate.*;

/**
 * @author juergen.windhaber
 */
public class Reservations {

    public static final List<ReservationDto> RESERVATIONS = new ArrayList<ReservationDto>() {{
        add(new ReservationDto("Carl", CONFIRMED, of(2020, 1 ,1)));
        add(new ReservationDto("Carl", CANCELED , of(2020, 1 ,2)));
        add(new ReservationDto("Carl", CONFIRMED, of(2020, 1 ,3)));

        add(new ReservationDto("Mary", CONFIRMED, of(2020, 1 ,1)));
        add(new ReservationDto("Mary", CANCELED , of(2020, 1 ,2)));

        add(new ReservationDto("Joey", CANCELED , of(2020, 1 ,1)));
        add(new ReservationDto("Joey", CONFIRMED, of(2020, 1 ,2)));



    }};
}

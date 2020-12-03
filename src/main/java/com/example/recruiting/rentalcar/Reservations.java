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

    public static final List<ReservationDto> reservations = new ArrayList<ReservationDto>() {{
        add(new ReservationDto("Carl", CONFIRMED, of(2020, 5 ,1), of(2020, 1, 1).atTime(0,0)));
        add(new ReservationDto("Carl", CANCELED , of(2020, 5 ,1), of(2020, 1, 2).atTime(0,0)));
        add(new ReservationDto("Carl", CONFIRMED, of(2020, 5 ,1), of(2020, 1, 3).atTime(0,0)));

        add(new ReservationDto("Mary", CONFIRMED, of(2020, 5 ,1), of(2020, 1, 1).atTime(0,0)));
        add(new ReservationDto("Mary", CANCELED , of(2020, 5 ,1), of(2020, 1, 2).atTime(0,0)));

        add(new ReservationDto("Joey", CANCELED , of(2020, 5 ,1), of(2020, 1, 1).atTime(0,0)));
        add(new ReservationDto("Joey", CONFIRMED , of(2020, 5 ,1), of(2020, 1, 2).atTime(0,0)));



    }};
}

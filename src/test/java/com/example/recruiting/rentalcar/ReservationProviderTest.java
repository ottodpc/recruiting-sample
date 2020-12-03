package com.example.recruiting.rentalcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static java.time.LocalDate.of;
import static java.util.Collections.shuffle;


/**
 * @author juergen.windhaber
 */
class ReservationProviderTest {

    @Test
    void getAllDriverNamesWithAValidReservation() {

        List<ReservationDto> reservations = new ArrayList<>(Reservations.RESERVATIONS);
        shuffle(reservations);

        List<String> driverNamesWithAValidReservation = ReservationProvider.getCurrentValidReservations(reservations);

        assertThat(driverNamesWithAValidReservation).isNotNull();
        assertThat(driverNamesWithAValidReservation).containsExactlyElementsIn(Arrays.asList("Carl", "Joey"));

    }
}
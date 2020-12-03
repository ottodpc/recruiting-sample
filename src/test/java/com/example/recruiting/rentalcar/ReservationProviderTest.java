package com.example.recruiting.rentalcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static java.time.LocalDate.of;


/**
 * @author juergen.windhaber
 */
class ReservationProviderTest {

    @Test
    void getAllDriverNamesWithAValidReservation() {


        List<String> driverNamesWithAValidReservation = ReservationProvider.getAllDriverNamesWithAValidReservation(of(2020, 5, 1));

        assertThat(driverNamesWithAValidReservation).isNotNull();
        assertThat(driverNamesWithAValidReservation).containsExactlyElementsIn(Arrays.asList("Carl", "Joey"));

    }
}
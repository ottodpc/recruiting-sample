package com.example.recruiting.course.dto;

import java.time.LocalDate;

/**
 * @author juergen.windhaber
 *
 * Dto which holds the status of a registration.
 */

public record CourseRegistrationDto(String courseParticipantName,
                                    RegistrationStatus registrationStatus,
                                    LocalDate registrationDate) {

    public enum RegistrationStatus {
        ENROLLED, CANCELED;
    }
}

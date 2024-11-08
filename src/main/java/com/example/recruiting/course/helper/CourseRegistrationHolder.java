package com.example.recruiting.course.helper;

import com.example.recruiting.course.dto.CourseRegistrationDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus.CANCELED;
import static com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus.ENROLLED;


/**
 * @author juergen.windhaber
 * <p>
 * Holds all registrations which occured ofer time.
 */
public class CourseRegistrationHolder {

    public static final List<CourseRegistrationDto> REGISTRATIONS = List.of(
            new CourseRegistrationDto("Carl", ENROLLED, LocalDate.of(2020, 1, 1)),
            new CourseRegistrationDto("Carl", CANCELED, LocalDate.of(2020, 1, 2)),
            new CourseRegistrationDto("Carl", ENROLLED, LocalDate.of(2020, 1, 3)),

            new CourseRegistrationDto("Mary", ENROLLED, LocalDate.of(2020, 1, 1)),
            new CourseRegistrationDto("Mary", CANCELED, LocalDate.of(2020, 1, 2)),

            new CourseRegistrationDto("Joey", CANCELED, LocalDate.of(2020, 1, 1)),
            new CourseRegistrationDto("Joey", ENROLLED, LocalDate.of(2020, 1, 2)),

            new CourseRegistrationDto("Bill", CANCELED, LocalDate.of(2020, 1, 1)),
            new CourseRegistrationDto("Bill", CANCELED, LocalDate.of(2020, 1, 2)),

            new CourseRegistrationDto("Anne", ENROLLED, LocalDate.of(2020, 1, 1)),
            new CourseRegistrationDto("Anne", ENROLLED, LocalDate.of(2020, 1, 2))
    );
}

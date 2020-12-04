package com.example.recruiting.course.helper;

import com.example.recruiting.course.dto.CourseRegistrationDto;

import java.util.ArrayList;
import java.util.List;

import static com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus.CANCELED;
import static com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus.ENROLLED;
import static java.time.LocalDate.*;

/**
 * @author juergen.windhaber
 *
 * Holds all registrations which occured ofer time.
 */
public class CourseRegistrationHolder {

    public static final List<CourseRegistrationDto> REGISTRATIONS = new ArrayList<CourseRegistrationDto>() {{
        add(new CourseRegistrationDto("Carl", ENROLLED, of(2020, 1 ,1)));
        add(new CourseRegistrationDto("Carl", CANCELED ,of(2020, 1 ,2)));
        add(new CourseRegistrationDto("Carl", ENROLLED, of(2020, 1 ,3)));

        add(new CourseRegistrationDto("Mary", ENROLLED, of(2020, 1 ,1)));
        add(new CourseRegistrationDto("Mary", CANCELED ,of(2020, 1 ,2)));

        add(new CourseRegistrationDto("Joey", CANCELED ,of(2020, 1 ,1)));
        add(new CourseRegistrationDto("Joey", ENROLLED, of(2020, 1 ,2)));
    }};
}

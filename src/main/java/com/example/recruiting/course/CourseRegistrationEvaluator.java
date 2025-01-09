package com.example.recruiting.course;

import com.example.recruiting.course.dto.CourseRegistrationDto;
import com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus;
import org.apache.commons.lang3.Validate;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author juergen.windhaber
 *
 * <p><p>
 * Evaluates which participants are currently valid.
 * As a course participant I can register to a course but I am also allowed to cancel whenever I want.
 * After a cancelation I can also register again, and so on and so forth.
 *
 * <p><p>
 * The current registration is the cronologicaly last registration a course participant sent.
 * <p>
 * A valid registrition is a registration which has the status:
 * <a href="#{@link}">{@link CourseRegistrationDto.RegistrationStatus#ENROLLED}</a>.
 *
 * <p><p>
 * The {@link CourseRegistrationEvaluator} holds a list of registrations. The list is of no particular order.
 *
 * <p><p>
 * The <a href="#{@link}">{@link com.example.recruiting.course.CourseRegistrationEvaluatorTest}</a> tests if the evaluator works correctly.
 */
public class CourseRegistrationEvaluator {

    /**
     * Gets all currently valid course participant names based on their latest registration status.
     * A valid participant is one whose most recent chronological registration status is ENROLLED.
     *
     * @param registrationEntries List of registration entries (can be unordered)
     * @return List of participant names who are currently enrolled
     * @throws IllegalArgumentException if registrationEntries is null
     */
    public static List<String> getAllCurrentValidCourseParticipantNames(
            List<CourseRegistrationDto> registrationEntries) {

        Validate.notNull(registrationEntries, "Registration entries cannot be null");

        if (registrationEntries.isEmpty()) {
            return new ArrayList<>();
        }

        return registrationEntries.stream()
                .collect(Collectors.groupingBy(
                        CourseRegistrationDto::courseParticipantName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy((r1, r2) ->
                                        r1.registrationDate().compareTo(r2.registrationDate())
                                ),
                                opt -> opt.orElseThrow(() ->
                                        new IllegalStateException("Unexpected empty registration")
                                )
                        )
                ))
                .values()
                .stream()
                .filter(registration ->
                        registration.registrationStatus() == RegistrationStatus.ENROLLED
                )
                .map(CourseRegistrationDto::courseParticipantName)
                .collect(Collectors.toList());
    }
}
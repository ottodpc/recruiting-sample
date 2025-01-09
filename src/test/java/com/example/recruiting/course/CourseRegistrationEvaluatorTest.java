package com.example.recruiting.course;

import com.example.recruiting.course.dto.CourseRegistrationDto;
import com.example.recruiting.course.helper.CourseRegistrationHolder;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.recruiting.course.dto.CourseRegistrationDto.RegistrationStatus.*;
import static com.google.common.truth.Truth.assertThat;
import static java.util.Collections.shuffle;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * @author juergen.windhaber
 */
class CourseRegistrationEvaluatorTest {

    @Test
    @DisplayName("getAllDriverNamesWithAValidReservation()")
    void getAllDriverNamesWithAValidReservation() {
        List<CourseRegistrationDto> registrations = new ArrayList<>(CourseRegistrationHolder.REGISTRATIONS);
        shuffle(registrations);

        List<String> participantsWithAValidReservation =
                CourseRegistrationEvaluator.getAllCurrentValidCourseParticipantNames(registrations);

        assertThat(participantsWithAValidReservation).isNotNull();
        assertThat(toUpper(participantsWithAValidReservation))
                .containsExactlyElementsIn(Arrays.asList("CARL", "JOEY", "ANNE"));
    }

    @Nested
    @DisplayName("EdgeCasesTests: ")
    class EdgeCasesTests {

        @Test
        @DisplayName("testEmptyList()")
        void testEmptyList() {
            List<String> result = CourseRegistrationEvaluator
                    .getAllCurrentValidCourseParticipantNames(new ArrayList<>());
            assertThat(result).isEmpty();
        }

        @Test
        @DisplayName("testNullInput()")
        void testNullInput() {
            assertThrows(IllegalArgumentException.class, () ->
                    CourseRegistrationEvaluator.getAllCurrentValidCourseParticipantNames(null));
        }
    }

    @Nested
    @DisplayName("SpecificCasesTests: ")
    class SpecificCasesTests {

        @Test
        @DisplayName("testSingleEnrollment()")
        void testSingleEnrollment() {
            List<CourseRegistrationDto> singleRegistration = List.of(
                    new CourseRegistrationDto("Bob", ENROLLED, LocalDate.of(2020, 1, 1))
            );

            List<String> result = CourseRegistrationEvaluator
                    .getAllCurrentValidCourseParticipantNames(singleRegistration);

            assertThat(toUpper(result)).containsExactly("BOB");
        }

        @Test
        @DisplayName("testSingleCancellation()")
        void testSingleCancellation() {
            List<CourseRegistrationDto> singleRegistration = List.of(
                    new CourseRegistrationDto("Bob", CANCELED, LocalDate.of(2020, 1, 1))
            );

            List<String> result = CourseRegistrationEvaluator
                    .getAllCurrentValidCourseParticipantNames(singleRegistration);

            assertThat(result).isEmpty();
        }
    }

    @Nested
    @DisplayName("ComplexScenariosTests: ")
    class ComplexScenariosTests {
        @Test
        void testMultipleRegistrationsSameDate() {
            List<CourseRegistrationDto> registrations = List.of(
                    new CourseRegistrationDto("Eve", ENROLLED, LocalDate.of(2020, 1, 1)),
                    new CourseRegistrationDto("Eve", CANCELED, LocalDate.of(2020, 1, 1)),
                    new CourseRegistrationDto("Eve", ENROLLED, LocalDate.of(2020, 1, 1))
            );

            List<String> result = CourseRegistrationEvaluator
                    .getAllCurrentValidCourseParticipantNames(registrations);

            assertThat(toUpper(result)).containsExactly("EVE");
        }
    }

    private static List<String> toUpper(List<String> someList) {
        return someList.stream()
                .map(StringUtils::upperCase)
                .collect(Collectors.toList());
    }
}

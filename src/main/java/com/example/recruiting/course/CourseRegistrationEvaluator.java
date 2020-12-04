package com.example.recruiting.course;

import com.example.recruiting.course.dto.CourseRegistrationDto;
import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

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
 *
 */
public class CourseRegistrationEvaluator {


    public static List<String> getAllCurrentValidCourseParticipantNames(List<CourseRegistrationDto> reservationEntries) {

        throw new NotImplementedException("The body of this method is not implemented yet!");
    }
}

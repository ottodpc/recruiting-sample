package com.example.recruiting.course.dto;

import java.time.LocalDate;

/**
 * @author juergen.windhaber
 *
 * Dto which holds the status of a registration.
 */
public class CourseRegistrationDto {

    private String courseParticipantName;
    private RegistrationStatus registrationStatus;
    private LocalDate registrationDate;


    public CourseRegistrationDto(String courseParticipantName, RegistrationStatus registrationStatus, LocalDate RegistrationDate) {
        this.courseParticipantName = courseParticipantName;
        this.registrationStatus = registrationStatus;
        this.registrationDate = RegistrationDate;
    }

    public enum RegistrationStatus {
        ENROLLED, CANCELED;
    }

    public String getCourseParticipantName() {
        return courseParticipantName;
    }

    public void setCourseParticipantName(String courseParticipantName) {
        this.courseParticipantName = courseParticipantName;
    }

    public RegistrationStatus getBookingStatus() {
        return registrationStatus;
    }

    public void setBookingStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

}

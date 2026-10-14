package com.healthcare.healthcaremanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DocTime — Medical Appointment Scheduling System
 * SLIIT Y1S2 Object Oriented Programming (OOP)
 * Group: G31
 * 
 * @author Suriyapperuma S.K.R. (IT26101111) - Group Admin &amp; Project Owner
 * Collaborators:
 * - Randeniya S.M. (IT26101173) - Function 1: Patient Registration &amp; Profile Management
 * - Ekanayaka E.M.C.S.K. (IT26101107) - Function 2: Doctor &amp; Schedule Management
 * - Theekshana W.H.I. (IT26101110) - Function 3: Appointment Booking (Priority Queue)
 * - Premawansha U.G.M.O. (IT26100206) - Function 4: Appointment Scheduling &amp; Sorting (Bubble Sort)
 */
@SpringBootApplication
public class HealthcareManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthcareManagementApplication.class, args);
    }

}

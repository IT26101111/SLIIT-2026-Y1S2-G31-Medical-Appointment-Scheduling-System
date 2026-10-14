# DocTime — Medical Appointment Scheduling System

**SLIIT Y1S2 Object Oriented Programming (OOP) Final Project**  
**Group:** G31  
**Project Owner & Group Admin:** Suriyapperuma S.K.R. (`IT26101111`)

---

## 👥 Group Members & Function Distribution

According to the official project specification report:

| # | Student ID | Member Name | Role | Core Function & Module | Coverage & Responsibilities |
|---|---|---|---|---|---|
| **5** | **IT26101111** | **Suriyapperuma S.K.R.** | **Project Owner & Group Admin** | **Admin Dashboard & System Control** | Managing users, viewing all appointments, generating reports, overall system oversight, backend/admin layer & central integration |
| **1** | **IT26101173** | **Randeniya S.M.** | Collaborator | **Patient Registration & Profile Management** | Patient sign-up, login, profile editing, medical history storage, validation & authentication entry point |
| **2** | **IT26101107** | **Ekanayaka E.M.C.S.K.** | Collaborator | **Doctor & Schedule Management** | Adding/editing doctors, defining available time slots, specialization management, availability queries |
| **3** | **IT26101110** | **Theekshana W.H.I.** | Collaborator | **Appointment Booking (Priority Queue)** | Patient appointment requests, Priority Queue implementation (Emergency > Urgent > Routine), slot allocation |
| **4** | **IT26100206** | **Premawansha U.G.M.O.** | Collaborator | **Appointment Scheduling & Sorting** | Confirmed appointment scheduling, Bubble Sort implementation by time slot for daily doctor agendas |

---

## ⚙️ Key Technical & DSA Requirements

- **Platform:** Web application — Java backend (Spring Boot), web-based frontend (Thymeleaf, HTML5, CSS3, JavaScript), relational database / in-memory store.
- **Priority Queue (Function 3):** Ranks appointment booking requests dynamically based on medical urgency levels (`High: Emergency`, `Medium: Semi-Urgent`, `Low: Routine Checkup`) before slot assignment.
- **Bubble Sort Algorithm (Function 4):** Automatically sorts and reorganizes confirmed appointments into time-ordered sequences for each doctor's daily agenda.
- **Multi-Role Security & Architecture:** Dedicated role-based portals for **Patients**, **Doctors**, and **Administrators** with approval workflows and credential management.

---

## 🗂️ System Architecture & Package Structure

```
src/main/java/com/healthcare/healthcaremanagement/
├── admin/                     # Function 5: Suriyapperuma S.K.R. (IT26101111) [Owner/Admin]
│   ├── Admin.java
│   ├── AdminController.java
│   ├── AdminService.java
│   └── RegistrationRequest.java
├── patient/                   # Function 1: Randeniya S.M. (IT26101173)
│   ├── Patient.java
│   ├── PatientController.java
│   └── PatientService.java
├── doctor/                    # Function 2: Ekanayaka E.M.C.S.K. (IT26101107)
│   ├── Doctor.java
│   ├── DoctorController.java
│   └── DoctorService.java
├── appointment/               # Function 3: Theekshana W.H.I. (IT26101110)
│   ├── Appointment.java
│   ├── AppointmentController.java
│   └── AppointmentService.java
├── scheduling/                # Function 4: Premawansha U.G.M.O. (IT26100206)
│   ├── Schedule.java
│   ├── SchedulingController.java
│   └── SchedulingService.java
└── HealthcareManagementApplication.java
```

---

## 🚀 Running the Project

### Prerequisites
- Java Development Kit (JDK 17+)
- Apache Maven (or bundled `./mvnw`)

### Build & Run
```bash
# Clone the repository
git clone https://github.com/IT26101111/Medical_Appointment_Scheduling_System_Project.git

# Navigate to project root
cd Medical_Appointment_Scheduling_System_Project

# Run with Maven Wrapper
./mvnw spring-boot:run
```

Once started, access the web portals:
- **Landing / Sign In:** `http://localhost:8080/login`
- **Patient Portal:** `http://localhost:8080/home/patient`
- **Doctor Portal:** `http://localhost:8080/home/doctor`
- **Admin Dashboard:** `http://localhost:8080/home/admin`

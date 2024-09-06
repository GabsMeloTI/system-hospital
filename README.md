# 🏥 System Hospital - Backend API

Welcome to **System Hospital**, a comprehensive Java-based API designed for the backend of a hospital management system. This API provides a robust solution for managing hospital operations and patient care.

## 📋 Project Overview

**System Hospital** aims to streamline and enhance the management of hospital activities through a well-structured API. It includes models for various hospital-related entities and supports essential functionalities to ensure efficient operation and patient management.

## 🚀 Features

- **Consultations**: Manage patient consultations and appointment scheduling.
- **Addresses**: Handle patient and hospital addresses.
- **Specialties**: Manage medical specialties and related data.
- **Genders**: Handle gender information for patients and medical staff.
- **Doctors**: Manage doctor profiles and their associated specialties.
- **Patients**: Track patient information and medical history.
- **Prescriptions**: Manage patient prescriptions and medication records.

## 🛠️ Technologies

This project uses the following technologies:

- **Java**: For developing the API.
- **Spring Boot**: For creating a robust and scalable backend.
- **MySQL**: For database management (if used).
- **Maven**: For dependency management and build automation (if used).

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (v11 or higher)
- [Maven](https://maven.apache.org/) (for dependency management and building the project)
- [MySQL](https://www.mysql.com/) (for database management, if used)

## ⚙️ Setup & Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/system-hospital.git
    cd system-hospital
    ```

2. **Install dependencies**:
    ```bash
    mvn install
    ```

3. **Configure the database** (if using MySQL):
    - Create a database in MySQL.
    - Update the database configuration in `src/main/resources/application.properties`.

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## 📚 API Endpoints

The API provides endpoints to manage hospital-related data. Refer to the [API documentation](docs/API.md) for detailed information on available endpoints and their usage.

## 🐛 Troubleshooting

If you encounter issues, make sure:

- You have the correct version of Java and Maven installed.
- Dependencies are properly installed and configured.
- Database configuration matches your setup.

Refer to the [Spring Boot documentation](https://spring.io/projects/spring-boot) for additional help.

## 🤝 Contributing

Contributions are welcome! Feel free to submit a pull request or open an issue to discuss new features or improvements.


# She Can Foundation - Full Stack Internship Task

A responsive, full-stack web application built for the She Can Foundation internship assignment. This project implements a contact form using an MVC pattern.

## ## Tech Stack
* **Backend Framework:** Java, Spring Boot 4.x
* **Frontend View Engine:** Thymeleaf
* **Styling Framework:** Tailwind CSS (via CDN)
* **Build Automation & Dependency Tool:** Maven

## Features Implemented
* **Full-Stack Form Integration:** Binds custom HTML input elements directly to structured Java POJO models (`FormSubmission`).
* **Post/Redirect/Get Pattern:** Prevents duplicate form validation entries upon hitting browser refresh actions via secure `RedirectAttributes` flash parameters.
* **Modern Interface:** Hand-coded responsive layout utilizing helper utilities to optimize visual scaling across dual mobile/desktop resolutions.

## How to Run Locally
1. Clone this repository to your desktop.
2. Open the directory structure inside your preferred IDE (e.g., IntelliJ IDEA).
3. Let Maven resolve external dependencies automatically.
4. Execute the root runtime engine class file: 'SheCanFormApplication.java'.
5. Access the active UI view engine within your web browser endpoint at: 'http://localhost:8080'

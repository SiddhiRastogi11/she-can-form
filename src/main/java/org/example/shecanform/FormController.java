package org.example.shecanform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm(Model model) {
        // Only add a new object if it doesn't already exist from a redirect flash attribute
        if (!model.containsAttribute("formSubmission")) {
            model.addAttribute("formSubmission", new FormSubmission());
        }
        return "index";
    }

    @PostMapping("/submit")
    public String handleFormSubmit(@ModelAttribute FormSubmission submission, RedirectAttributes redirectAttributes) {
        // Backend Validation Check
        if (submission.getName().trim().isEmpty() || submission.getEmail().trim().isEmpty()) {
            redirectAttributes.addFlashAttribute("error", "Name and Email are required fields.");
            redirectAttributes.addFlashAttribute("formSubmission", submission);
            return "redirect:/";
        }

        // Optional: You could easily drop a repository.save(submission) line here later for DB integration.
        System.out.println("Received submission from: " + submission.getName() + " (" + submission.getEmail() + ")");

        // Pass success state back to the UI
        redirectAttributes.addFlashAttribute("successMessage", "Form Submitted Successfully");
        return "redirect:/";
    }
}
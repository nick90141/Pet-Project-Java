package com.example.pet_project.controllers;

import com.example.pet_project.entities.User;
import com.example.pet_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PetProject")
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String petProject() {
        return "main";
    }

    @GetMapping("/catalog")
    public String catalog() {
        return "catalog";
    }

    @GetMapping ("/change")
    public String change (){
        return "change";
    }
    @GetMapping ("/shipping")
    public String shipping (){
        return "shipping";
    }
    @GetMapping ("/payment")
    public String payment(){
        return "payment";
    }
    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "aboutUs";
    }
    @GetMapping("/warranty")
    public String warranty(){
        return "warranty";
    }
    @GetMapping ("/contacts")
    public String contacts(){
        return "contacts";
    }









    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "loginForm";
    }

    @GetMapping("/iPhone15ProMax")
    public String iPhone15ProMax(Model model) {
        model.addAttribute("user", new User());
        return "iPhone15ProMax";
    }


    @GetMapping("/applicationCommodityLoan")
    public String applicationCommodityLoan(Model model) {
        model.addAttribute("user", new User());
        return "applicationCommodityLoan";
    }




    @GetMapping("/registrationForm")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationForm";
    }

    @GetMapping("/saveData")
    public String saveData() {
        return "saveData";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/PetProject/saveData";
    }



}

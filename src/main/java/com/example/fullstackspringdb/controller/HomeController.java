package com.example.fullstackspringdb.controller;


import com.example.fullstackspringdb.model.Person;
import com.example.fullstackspringdb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PersonService personService;
    @GetMapping("/")
    public String index(Model model){
        List<Person> personList = personService.fetchAll();
        model.addAttribute("persons", personList);
        return "home/index";
    }
    @GetMapping("/create")
    public String create(){
        return "home/create";
    }

    @PostMapping("/createNew")
    public String createNew(@ModelAttribute Person person){
        personService.addPerson(person);
        return "redirect:/";
    }


}

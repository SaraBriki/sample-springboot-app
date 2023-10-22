package com.example.bonjour.controller;

import com.example.bonjour.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BonjourController {
    @Autowired
    private final IStudentRepository repository;

    public BonjourController(IStudentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/bonjour/{age}", method = RequestMethod.GET)
    @ResponseBody
    // Method
    public String direBonjour(@PathVariable("age") int age) {
        try {
            return "Bonjour " + repository.findStudentByAge(age).getFullName() + "!";
        } catch (NullPointerException e) {
            return "There is no student with the given age.";
        }
    }
}
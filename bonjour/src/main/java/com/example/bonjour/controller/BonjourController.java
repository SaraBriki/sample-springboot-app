package com.example.bonjour.controller;
// Importing required classes

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

    @RequestMapping(value = "/bonjour/{index}", method = RequestMethod.GET)
    @ResponseBody
    // Method
    public String direBonjour(@PathVariable("index") int index) {
        try {
            return "Bonjour " + repository.findAll().get(index).getFullName() + "!";
        } catch (IndexOutOfBoundsException e) {
            return "There is no person in the database with the given index (index out of bound!)";
        }
    }
}

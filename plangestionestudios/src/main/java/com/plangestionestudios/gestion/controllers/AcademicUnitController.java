package com.plangestionestudios.gestion.controllers;

import com.plangestionestudios.gestion.services.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("api/academicUnit")
@Controller
public class AcademicUnit {
    @Autowired
    AcademicUnitService academicUnitService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public  

}

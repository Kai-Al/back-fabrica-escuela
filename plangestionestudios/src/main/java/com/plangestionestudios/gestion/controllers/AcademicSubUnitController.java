package com.plangestionestudios.gestion.controllers;

import com.plangestionestudios.gestion.services.AcademicSubUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/academicSubUnit")
@RestController
public class AcademicSubUnitController {

    @Autowired
    private AcademicSubUnitService academicSubUnitService;

}

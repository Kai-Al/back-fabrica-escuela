package com.plangestionestudios.gestion.controllers;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.services.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/academicUnit")
@RestController
public class AcademicUnitController {
    @Autowired
    private AcademicUnitService academicUnitService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AcademicUnit> getAllAcademicUnits() {
        List<AcademicUnit> academicUnitList = academicUnitService.getAllAcademicUnits();
        return academicUnitList;
    }

}

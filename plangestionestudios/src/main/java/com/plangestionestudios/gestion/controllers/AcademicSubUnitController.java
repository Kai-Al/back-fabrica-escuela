package com.plangestionestudios.gestion.controllers;

import com.plangestionestudios.gestion.entities.AcademicSubUnit;
import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.services.AcademicSubUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/academicSubUnit")
@RestController
public class AcademicSubUnitController {

    @Autowired
    private AcademicSubUnitService academicSubUnitService;

    @GetMapping("/all")
    public ResponseEntity<List<AcademicSubUnit>> getAllAcademicUnits() {
        List<AcademicSubUnit> academicSubUnitList = this.academicSubUnitService.getAllAcademicSubUnits();
        return new ResponseEntity<>(academicSubUnitList, HttpStatus.OK);
    }

}

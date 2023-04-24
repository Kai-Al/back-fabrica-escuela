package com.plangestionestudios.gestion.controllers;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.services.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/academicUnit")
@RestController
public class AcademicUnitController {

    @Autowired
    private AcademicUnitService academicUnitService;

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteBloque(@PathVariable("id") int id) {
        academicUnitService.deleteAcademicUnit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AcademicUnit>> getAllAcademicUnits() {
        List<AcademicUnit> academicUnitList = academicUnitService.getAllAcademicUnits();
        return new ResponseEntity<>(academicUnitList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcademicUnit> getAcademicUnitById(@PathVariable("id") int id) {
        AcademicUnit academicUnit = academicUnitService.getAcademicUnitById(id);
        if(academicUnit != null) return new ResponseEntity<>(academicUnit, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<AcademicUnit> createAcademicUnits(@RequestBody AcademicUnit academicUnit) {
        AcademicUnit academicUnitCreated = academicUnitService.createAcademicUnit(academicUnit);
        if(academicUnitCreated != null) {
            return new ResponseEntity<>(academicUnitCreated, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(academicUnitCreated, HttpStatus.BAD_REQUEST);
    }

}

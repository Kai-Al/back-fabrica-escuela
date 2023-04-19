package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.repositories.AcademicUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicUnitServiceImp implements AcademicUnitService{

    @Autowired
    AcademicUnitRepository academicUnitRepository;
    @Override
    public List<AcademicUnit> getAllAcademicUnits() {
        List<AcademicUnit> academicUnitList = academicUnitRepository.findAll();
        return academicUnitList;
    }
}

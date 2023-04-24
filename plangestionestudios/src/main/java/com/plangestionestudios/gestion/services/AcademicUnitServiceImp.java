package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.repositories.AcademicUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicUnitServiceImp implements AcademicUnitService{

    @Autowired
    private AcademicUnitRepository academicUnitRepository;

    public void deleteAcademicUnit(int id) {
        academicUnitRepository.deleteById(id);
    }

    @Override
    public List<AcademicUnit> getAllAcademicUnits() {
        List<AcademicUnit> academicUnitList = academicUnitRepository.findAll();
        return academicUnitList;
    }

    @Override
    public AcademicUnit getAcademicUnitById(int id) {
        Optional<AcademicUnit> academicUnit = academicUnitRepository.findById(id);
        if(academicUnit.isPresent()) return academicUnit.get();
        return null;
    }

    @Override
    public AcademicUnit createAcademicUnit(AcademicUnit academicUnit) {
        String codeAU = academicUnit.getCodeAcademicUnit();
        if(codeAU == null || codeAU.length() == 0) return null;
        List<AcademicUnit> academicUnitFound = academicUnitRepository.findByCodeAcademicUnit(codeAU);
        System.out.println(academicUnitFound);
        if(academicUnitFound.isEmpty()) {
            academicUnitRepository.save(academicUnit);
            return academicUnit;
        }
        return null;
    }

}

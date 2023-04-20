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
        return academicUnitRepository.findAll();
    }

    @Override
    public AcademicUnit getAcademicUnitById(int id) {
        Optional<AcademicUnit> academicUnit = academicUnitRepository.findById(id);
        return academicUnit.orElse(null);
    }

    @Override
    public AcademicUnit createAcademicUnit(AcademicUnit academicUnit) {
        int idAcademicUnit = academicUnit.getIdAcademinUnit();
        Optional<AcademicUnit> academicUnitFound = academicUnitRepository.findById(idAcademicUnit);
        if(academicUnitFound.isPresent()) return null;
        academicUnitRepository.save(academicUnit);
        return academicUnit;
    }

}

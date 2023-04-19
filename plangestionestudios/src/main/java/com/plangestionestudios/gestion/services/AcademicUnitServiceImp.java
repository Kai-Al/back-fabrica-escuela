package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.repositories.AcademicUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
        if(!academicUnit.isPresent()) return null;
        return academicUnit.get();
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

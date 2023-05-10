package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicSubUnit;
import com.plangestionestudios.gestion.entities.AcademicUnit;
import com.plangestionestudios.gestion.repositories.AcademicSubUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicSubUnitServiceImp implements AcademicSubUnitService{

    @Autowired
    private AcademicSubUnitRepository academicSubUnitRepository;
    @Autowired
    private AcademicUnitService academicUnitService;
    @Override
    public boolean deleteAcademicSubUnit(int id) {
        return false;
    }

    @Override
    public List<AcademicSubUnit> getAllAcademicSubUnits() {
        List<AcademicSubUnit> academicSubUnitList = this.academicSubUnitRepository.findAll();
        return academicSubUnitList;
    }


    @Override
    public AcademicSubUnit getAcademicSubUnitById(int id) {
        return null;
    }

    @Override
    public AcademicSubUnit createAcademicSubUnit(AcademicSubUnit academicSubUnit) {
        int idAcademicUnit = academicSubUnit.getUnidadAcademica().getIdAcademicUnit();
        AcademicUnit academicUnit = this.academicUnitService.getAcademicUnitById(idAcademicUnit);
        if(academicUnit == null) return null;
        academicSubUnit.setUnidadAcademica(academicUnit);
        this.academicSubUnitRepository.save(academicSubUnit);
        return academicSubUnit;
    }
}

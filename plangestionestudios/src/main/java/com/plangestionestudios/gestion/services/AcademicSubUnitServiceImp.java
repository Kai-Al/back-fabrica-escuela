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

    @Override
    public boolean deleteAcademicSubUnit(int id) {
        return false;
    }

    @Override
    public List<AcademicUnit> getAllAcademicSubUnits() {
        return null;
    }

    @Override
    public AcademicSubUnit getAcademicSubUnitById(int id) {
        return null;
    }

    @Override
    public AcademicSubUnit createAcademicSubUnit(AcademicSubUnit academicSubUnit) {
        return null;
    }
}

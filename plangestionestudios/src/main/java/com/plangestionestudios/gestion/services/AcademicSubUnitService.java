package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicSubUnit;
import com.plangestionestudios.gestion.entities.AcademicUnit;

import java.util.List;

public interface AcademicSubUnitService {
    public boolean deleteAcademicSubUnit(int id);
    public List<AcademicUnit> getAllAcademicSubUnits();
    public AcademicSubUnit getAcademicSubUnitById(int id);
    public AcademicSubUnit createAcademicSubUnit(AcademicSubUnit academicSubUnit);
}

package com.plangestionestudios.gestion.repositories;

import com.plangestionestudios.gestion.entities.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicUnitRepository extends JpaRepository<AcademicUnit, Integer> {
    List<AcademicUnit> findByCodeAcademicUnit(String codeAcademicUnit);
}

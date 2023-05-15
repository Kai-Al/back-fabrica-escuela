package com.plangestionestudios.gestion.repositories;

import com.plangestionestudios.gestion.entities.AcademicSubUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicSubUnitRepository extends JpaRepository<AcademicSubUnit, Integer> {
    List<AcademicSubUnit> findByCodeAcademicSubUnit(String codeAcademicSubUnit);
}

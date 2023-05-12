package com.plangestionestudios.gestion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.plangestionestudios.gestion.entities.AcademicSubUnit;
import com.plangestionestudios.gestion.controllers.AcademicSubUnitController;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class AcademicSubUnitControllerTest {
    @Autowired
    private AcademicSubUnitController academicSubUnitController;
    static AcademicSubUnit subAcademicUnit = new AcademicSubUnit();

    @BeforeAll
    public static void setUp() {
        subAcademicUnit.setCodeAcademicSubUnit("code");
        subAcademicUnit.setNameAcademicSubUnit("name");
        subAcademicUnit.setTypeAcademicSubUnit("type");
        subAcademicUnit.setHeadName("head");
        subAcademicUnit.setDescription("description");
    }

    @Test
    void testGetAllAcademicUnits() {
        assertEquals(HttpStatus.OK, academicSubUnitController.getAllAcademicSubUnits().getStatusCode());
    }

    @Test
    void testCreateAcademicUnits() {
        ResponseEntity<AcademicSubUnit> response = academicSubUnitController.createAcademicSubUnits(subAcademicUnit);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

package com.plangestionestudios.gestion;

import com.plangestionestudios.gestion.controllers.AcademicUnitController;
import com.plangestionestudios.gestion.entities.AcademicUnit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AcademicUnitControllerTest {

    @Autowired
    private AcademicUnitController academicUnitController;

    static AcademicUnit academicUnit = new AcademicUnit();

    @BeforeAll
    public static void setUp() {
        academicUnit.setDeanName("dean");
        academicUnit.setCodeAcademicUnit("code");
        academicUnit.setTypeAcademicUnit("type");
        academicUnit.setDescription("description");
    }


    @Test
    void testGetAllAcademicUnits() {
        assertEquals(HttpStatus.OK, academicUnitController.getAllAcademicUnits().getStatusCode());
    }

}

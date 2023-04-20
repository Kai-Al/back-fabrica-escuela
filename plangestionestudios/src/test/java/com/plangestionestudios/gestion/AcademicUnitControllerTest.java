package com.plangestionestudios.gestion;


import com.plangestionestudios.gestion.controllers.AcademicUnitController;
import com.plangestionestudios.gestion.entities.AcademicUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AcademicUnitControllerTest {

    @Autowired
    private AcademicUnitController academicUnitController;

    @Test
    public void testDeleteAcademicUnit() {
        int id = 1;
        ResponseEntity<HttpStatus> response = academicUnitController.deleteBloque(id);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }
    @Test
    public void testGetAllAcademicUnits() {
        assertEquals(HttpStatus.OK, academicUnitController.getAllAcademicUnits().getStatusCode());
    }
    @Test
    public void testGetAcademicUnitById() {
        int id = 1;
        ResponseEntity<AcademicUnit> response = academicUnitController.getAcademicUnitById(id);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
    @Test
    public void testCreateAcademicUnit() {
        AcademicUnit academicUnit = new AcademicUnit();
        academicUnit.setDeanName("dean");
        academicUnit.setCodeAcademicUnit("code");
        academicUnit.setTypeAcademicUnit("type");
        academicUnit.setDescription("description");
        ResponseEntity<AcademicUnit> response = academicUnitController.createAcademicUnits(academicUnit);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }
}

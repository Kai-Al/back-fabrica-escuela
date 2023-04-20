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
        // Primero se puede probar que no se pueda obtener una unidad académica que no existe
        ResponseEntity<AcademicUnit> response= academicUnitController.getAcademicUnitById(-5);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        // Ahora se puede probar que se pueda obtener una unidad académica que existe
        academicUnitController.createAcademicUnits(academicUnit);
        response = academicUnitController.getAcademicUnitById(academicUnit.getIdAcademinUnit());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
    @Test
    public void testCreateAcademicUnit() {
        AcademicUnit academicUnit = new AcademicUnit();
        /* Primero se prueba que no se pueda crear una unidad académica con datos incompletos */
        assertEquals(HttpStatus.BAD_REQUEST, academicUnitController.createAcademicUnits(academicUnit).getStatusCode());
        /* Ahora se prueba que se pueda crear una unidad académica con datos completos */
        assertEquals(HttpStatus.CREATED, academicUnitController.createAcademicUnits(academicUnit).getStatusCode());
    }
}

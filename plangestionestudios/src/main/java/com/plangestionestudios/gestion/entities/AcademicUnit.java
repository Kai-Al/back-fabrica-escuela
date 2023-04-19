package com.plangestionestudios.gestion.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "unidad_academica")
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAcademinUnit;
    @Column(name = "codigo_unidad_academica")
    private String codeAcademicUnit;
    @Column(name = "tipo_unidad_academica")
    private String typeAcademicUnit;
    @Column(name = "nombre_decano")
    private String deanName;
    @Column(name = "descripcion_unidad_academica")
    private String description;
}

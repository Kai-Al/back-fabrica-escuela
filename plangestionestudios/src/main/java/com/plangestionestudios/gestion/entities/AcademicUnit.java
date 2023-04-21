package com.plangestionestudios.gestion.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "unidad_academica")
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idAcademicUnit;
    @Column(name = "codigo_unidad_academica", nullable = false, unique = true)
    private String codeAcademicUnit;
    @Column(name = "tipo_unidad_academica")
    private String typeAcademicUnit;
    @Column(name = "nombre_decano")
    private String deanName;
    @Column(name = "descripcion_unidad_academica")
    private String description;
    @OneToMany (mappedBy = "unidadAcademica")
    private List<AcademicSubUnit> subUnidadesAcademicas;
}

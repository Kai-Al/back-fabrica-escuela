package com.plangestionestudios.gestion.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sub_unidad_academica")
public class AcademicSubUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idAcademicSubUnit;
    @Column(name = "codigo_sub_unidad_academica", nullable = false, unique = true)
    private String codeAcademicSubUnit;
    @Column(name = "tipo_sub_unidad_academica")
    private String typeAcademicSubUnit;
    @Column(name = "nombre_jefe")
    private String headName;
    @Column(name = "descripcion_sub_unidad_academica")
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_academic_unit")
    private AcademicUnit unidadAcademica;
}

package com.example.catalogosDashboard.CatalogosNomina.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="c_TipoJornada")
public class c_TipoJornadaEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Tipo_Jornada;
    @Column
    private String descripcion;
    @Column
    private Boolean status;
}

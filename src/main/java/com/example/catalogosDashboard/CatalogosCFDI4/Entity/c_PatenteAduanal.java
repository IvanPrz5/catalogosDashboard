package com.example.catalogosDashboard.CatalogosCFDI4.Entity;

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
@Table(name="c_Patente_Aduanal")
public class c_PatenteAduanal {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Patente_Aduanal;
    @Column
    private Boolean status;
}

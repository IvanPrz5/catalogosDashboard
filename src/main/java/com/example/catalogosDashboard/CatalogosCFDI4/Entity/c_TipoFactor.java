package com.example.catalogosDashboard.CatalogosCFDI4.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="c_Tipo_Factor")
public class c_TipoFactor {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Tipo_Factor;
    @Column
    private Boolean status;
}

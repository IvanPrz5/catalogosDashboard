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
@Table(name="c_Uso_Cfdi")
public class c_UsoCFDI {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Uso_Cfdi;
    @Column
    private String descripcion;
    @Column
    private String fisica;
    @Column
    private String moral;
    @Column
    private String regimenFiscalReceptor;
    @Column
    private Boolean status;
}

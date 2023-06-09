package com.example.catalogosDashboard.CatalogosCFDI4.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="c_Codigo_Postal")
public class c_CodigoPostal {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Codigo_Postal;
    @Column
    private Boolean status;
    
    @ManyToOne
    @JoinColumn(name="c_Estado")
    private c_Estado estado;

    @ManyToOne
    @JoinColumn(name="id_Municipio")
    private c_Municipio municipios;

    @ManyToOne
    @JoinColumn(name="id_Localidad")
    private c_Localidad localidades;

    /* @OneToMany(mappedBy = "idAsentamiento")
    private List<c_Asentamientos> asentamientos; */
}

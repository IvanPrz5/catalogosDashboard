package com.example.catalogosDashboard.CatalogosCFDI4.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="c_Asentamientos")
public class c_Asentamientos {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id_Asentamiento;
    @Column
    private String c_Asentamiento;
    @Column
    private String nombre;
    @Column
    private String tipo;
    @Column
    private Boolean status;
    
    @ManyToOne
    @JoinColumn(name="c_Codigo_Postal")
    private c_CodigoPostal codigoPostal;
}

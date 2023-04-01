package com.example.catalogosDashboard.CatalogosCFDI4.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="c_Municipio")
public class c_Municipio {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_Municipio;
    @Column
    private String c_Municipio;
    @Column
    private String descripcion;
    @Column
    private Boolean status;

    @ManyToOne
    @JoinColumn(name="c_Estado")
    private c_Estado estado;

    /* @OneToMany(mappedBy = "cCodigoPostal")
    private List<c_CodigoPostal> codigos; */
}

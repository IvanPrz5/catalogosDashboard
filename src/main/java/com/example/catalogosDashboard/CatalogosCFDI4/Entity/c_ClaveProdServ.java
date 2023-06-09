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
@Table(name="c_Clave_Prod_Serv")
public class c_ClaveProdServ {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Clave_Prod_Serv;
    @Column
    private String descripcion;
    @Column(length = 600)
    private String palabrasSimilares;
    @Column
    private Boolean status;
}

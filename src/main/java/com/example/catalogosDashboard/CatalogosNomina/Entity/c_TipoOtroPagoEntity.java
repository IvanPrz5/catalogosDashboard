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
@Table(name="c_TipoOtroPago")
public class c_TipoOtroPagoEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String c_Tipo_Otro_Pago;
    @Column
    private String descripcion;
    @Column
    private Boolean status;
}

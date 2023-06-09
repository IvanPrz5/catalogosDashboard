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
@Table(name="c_Num_Ped_Aduana")
public class c_NumPedAduana {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_NumAduana;
    @Column
    private String c_Aduana;
    @Column
    private String patente;
    @Column
    private Boolean status;
}

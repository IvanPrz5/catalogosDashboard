package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Aduana;

@Repository
public interface c_AduanaRepository extends JpaRepository<c_Aduana, String> {
    /* public List<c_Pais> findByPaisAndDescripcion(String cPais, String descripcion); */
}

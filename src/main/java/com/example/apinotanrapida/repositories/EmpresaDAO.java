package com.example.apinotanrapida.repositories;

import com.example.apinotanrapida.clases.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDAO extends JpaRepository<Empresa,String> {
}

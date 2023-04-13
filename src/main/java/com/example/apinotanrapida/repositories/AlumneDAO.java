package com.example.apinotanrapida.repositories;

import com.example.apinotanrapida.clases.Alumne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumneDAO extends JpaRepository<Alumne,Long> {
}

package com.formatoweb.crudbasico17032021.repository;

import com.formatoweb.crudbasico17032021.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

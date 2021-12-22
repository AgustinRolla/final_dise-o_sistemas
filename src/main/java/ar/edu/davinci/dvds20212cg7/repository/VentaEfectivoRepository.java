package ar.edu.davinci.dvds20212cg7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20212cg7.domain.VentaEfectivo;

@Repository
public interface VentaEfectivoRepository extends JpaRepository<VentaEfectivo, Long> {

}

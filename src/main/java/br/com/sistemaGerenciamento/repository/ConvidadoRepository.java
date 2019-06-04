package br.com.sistemaGerenciamento.repository;

import br.com.sistemaGerenciamento.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {


}

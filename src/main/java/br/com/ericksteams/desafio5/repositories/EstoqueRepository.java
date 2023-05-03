package br.com.ericksteams.desafio5.repositories;

import br.com.ericksteams.desafio5.Models.ModelestoqueMovimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EstoqueRepository extends JpaRepository<ModelestoqueMovimento, Integer> {
}

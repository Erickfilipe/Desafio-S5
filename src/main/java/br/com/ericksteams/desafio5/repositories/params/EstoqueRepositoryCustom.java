package br.com.ericksteams.desafio5.repositories.params;

import br.com.ericksteams.desafio5.Models.ModelestoqueMovimento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepositoryCustom {
    List<ModelestoqueMovimento> listarHistorico(Integer id);


}

package br.com.ericksteams.desafio5.repositories.params;

import br.com.ericksteams.desafio5.Models.ModelProduto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProdutoRepositoryCustom {
    List<ModelProduto> getFiltro(ProdutoFilterParam params);

    List<ModelProduto> listarPositivos();


}

package br.com.senai.cardapiosmktplaceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senai.cardapiosmktplaceapi.entity.OpcaoDoCardapio;

@Repository
public interface OpcoesCardapioRepository extends JpaRepository<OpcaoDoCardapio, Integer>{

	@Query(value = "SELECT Count(o) FROM OpcaoDoCardapio o WHERE o.secao.id = :idDaSecao")
	public Long contarPor(Integer idDaSecao);
	
}

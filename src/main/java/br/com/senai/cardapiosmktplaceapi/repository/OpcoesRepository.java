package br.com.senai.cardapiosmktplaceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senai.cardapiosmktplaceapi.entity.Opcao;

@Repository
public interface OpcoesRepository extends JpaRepository<Opcao, Integer> {

	@Query(value = "SELECT o "
			     + "FROM Opcao "
			     + "JOIN FETCH o.categoria "
			     + "JOIN FETCH o.restaurante "
			     + "o WHERE o.id = :id")
	public Opcao buscarPor(Integer id);
	
}

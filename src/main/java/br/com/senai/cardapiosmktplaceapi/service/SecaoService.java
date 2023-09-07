package br.com.senai.cardapiosmktplaceapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import br.com.senai.cardapiosmktplaceapi.entity.Secao;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Validated
public interface SecaoService {

	public Secao salvar(
			@NotNull(message = "A seção é obrigtório")
			Secao secao);
	
	public void atualizarStatusPor(
			@NotNull(message = "O id é obrigatório")
			@Positive(message = "O id deve ser positivo")
			Integer id,
			@NotNull(message = "O status é obrigatório")
			Status status);
	
	public Page<Secao> listarPor(
			@NotBlank(message = "O nome é obrigatório")
			@Size(min = 3, max = 250, message = "O nome para listagem deve conter entre 3 e 250 caracteres")
			String nome,
			Pageable paginacao);
	
	public Secao buscarPor(
			@NotNull(message = "O id é obrigatório")
			@Positive(message = "o id para busca deve ser positivo")
			Integer id);
	
	public Secao excluirPor(
			@NotNull(message = "O id para remoção é obrigatório")
			@Positive(message = "O id para remoção deve ser positivo")
			Integer id);
	
}

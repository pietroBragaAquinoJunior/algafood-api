package com.algaworks.algafood.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;

	public Restaurante salvar(Restaurante restaurante) {
		return restauranteRepository.salvar(restaurante);
	}
	
	public void excluir(Long id) {
		try {
			restauranteRepository.remover(id);
		}catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(String.format("Não existe um cadastro de restaurante com código %d", id));
		}
		catch(DataIntegrityViolationException e){
			throw new EntidadeEmUsoException(String.format("Restaurante de código %d não pode ser removida, pois está em uso", id));
		}
	}
	
	public List<Restaurante> listar(){
		return restauranteRepository.listar();
	}
	
	
}

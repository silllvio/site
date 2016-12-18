package br.com.predicao.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.predicao.models.Pessoa;

@Repository
@Transactional
public class PessoaDao {

	@PersistenceContext
	private EntityManager manager;

	public void cadastrar(Pessoa pessoa) {
		manager.persist(pessoa);

	}

}

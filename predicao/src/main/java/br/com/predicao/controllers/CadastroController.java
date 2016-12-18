package br.com.predicao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.predicao.daos.PessoaDao;
import br.com.predicao.models.Pessoa;

@Controller
public class CadastroController {
	
	@Autowired
	private PessoaDao pessoaDao;
	
	@RequestMapping("/cadastro")
	public String cadastrar(Pessoa pessoa){
		
		System.out.println("Página de cadastro chamada");
		
		System.out.println(pessoa);
		
		pessoaDao.cadastrar(pessoa);

		return "/cadastro/cadastrado";
		
	}
	
}

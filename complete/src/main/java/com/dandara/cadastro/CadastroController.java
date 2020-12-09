package com.dandara.cadastro;

import com.dandara.anjoGuarda.AnjoGuardaController;
import com.dandara.login.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/cadastro")
public class CadastroController {
	@Autowired
	private CadastroRepository cadastroRepository;
	private AnjoGuardaController anjoGuardaController;
	private LoginController loginController;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Cadastro cadastro) {
		adicionarDadosPessoais(cadastro.getDadosPessoais());

		cadastro.getAnjoGuarda().forEach(anjoGuarda -> {
			anjoGuardaController.adicionar(anjoGuarda);
		});

		loginController.criarLogin(cadastro.getLogin());

	}

	private void adicionarDadosPessoais(DadosPessoais dadosPessoais) {
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Cadastro> listarTodos() {
		return cadastroRepository.findAll();
	}
}

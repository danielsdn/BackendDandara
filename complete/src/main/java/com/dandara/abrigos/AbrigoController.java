package com.dandara.abrigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/abrigo")
public class AbrigoController {
	@Autowired
	private AbrigoRepository abrigoRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Abrigo abrigo) {
		abrigoRepository.save(abrigo);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Abrigo> listarTodos() {
		return abrigoRepository.findAll();
	}
}

package com.dandara.delegacias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/delegacia")
public class DelegaciaController {
	@Autowired
	private DelegaciaRepository delegaciaRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Delegacia delegacia) {
		delegaciaRepository.save(delegacia);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Delegacia> listarTodos() {
		return delegaciaRepository.findAll();
	}
}

package com.dandara.anjoGuarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/anjoGuarda")
public class AnjoGuardaController {
	@Autowired
	private AnjoGuardaRepository anjoGuardaRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody AnjoGuarda anjoGuarda) {
		anjoGuardaRepository.save(anjoGuarda);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<AnjoGuarda> listarTodos() {
		return anjoGuardaRepository.findAll();
	}
}

package com.dandara.advogados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/advogado")
public class AdvogadoController {
	@Autowired
	private AdvogadoRepository advogadoRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Advogado advogado) {
		advogadoRepository.save(advogado);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Advogado> listarTodos() {
		return advogadoRepository.findAll();
	}
}

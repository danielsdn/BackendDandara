package com.dandara.historias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/historia")
public class HistoriaController {
	@Autowired
	private HistoriaRepository historiaRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Historia historia) {
		historiaRepository.save(historia);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Historia> listarTodos() {
		return historiaRepository.findAll();
	}
}

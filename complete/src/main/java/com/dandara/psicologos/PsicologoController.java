package com.dandara.psicologos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/psicologo")
public class PsicologoController {
	@Autowired
	private PsicologoRepository psicologoRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Psicologo psicologo) {
		psicologoRepository.save(psicologo);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Psicologo> listarTodos() {
		return psicologoRepository.findAll();
	}
}

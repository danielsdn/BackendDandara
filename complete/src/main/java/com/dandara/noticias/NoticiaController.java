package com.dandara.noticias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/noticia")
public class NoticiaController {
	@Autowired
	private NoticiaRepository noticiaRepository;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody Noticia noticia) {
		noticiaRepository.save(noticia);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Noticia> listarTodos() {
		return noticiaRepository.findAll();
	}
}

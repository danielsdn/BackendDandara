package com.dandara.espacoDireito;

import com.dandara.database.ProcedureCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/espacoDireito")
public class EspacoDireitoController {
	@Autowired
	private EspacoDiretoRepository espacoDiretoRepository;
	private ProcedureCaller procedureCaller;

	@PostMapping(path="/adicionar")
	public @ResponseBody void adicionar(@RequestBody EspacoDireito espacoDireito) {
		espacoDiretoRepository.save(espacoDireito);
	}

	@GetMapping(path="/listar")
	public @ResponseBody Iterable<EspacoDireito> listarTodos() {
		return espacoDiretoRepository.findAll();
	}
}

package com.dandara.emergencia;

import com.dandara.database.FunctionNames;
import com.dandara.database.ProcedureCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/emergencia")
public class EmergenciaController {
	@Autowired
	private EmergenciaRepository emergenciaRepository;
	private ProcedureCaller procedureCaller;

	@PostMapping(path="/adicionarConfiguracao")
	public @ResponseBody void adicionarConfiguracao(@RequestBody Emergencia emergencia) {
		emergenciaRepository.save(emergencia);
	}

	@GetMapping(path="/disparar")
	public @ResponseBody Optional<Emergencia> dispararEmergencia() {
		try {
			return Optional.ofNullable(procedureCaller.callQuery(Emergencia.class, FunctionNames.FNC_BUSCAR_EMERGENCIA, new Object[]{}));
		} catch(IncorrectResultSizeDataAccessException ex) {
			return Optional.empty();
		}
	}
}

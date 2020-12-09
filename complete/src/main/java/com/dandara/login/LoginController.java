package com.dandara.login;

import com.dandara.database.FunctionNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;
    private JdbcTemplate jdbcTemplate;

    @PostMapping(path="")
    public Boolean logar(@RequestParam String email) {
        Integer idLogin = buscarIdPorUsuario(email);

        return loginRepository.existsById(idLogin);
    }

    public Integer buscarIdPorUsuario(String email) {
        Login login = jdbcTemplate.queryForObject(FunctionNames.FNC_BUSCAR_ID_POR_USUARIO,
                new Object[]{email},
                new BeanPropertyRowMapper<>(Login.class));

        return login.getId();
    }

    @PostMapping(path="/recuperar")
    public String recuperar(@RequestParam String email) {
        enviarEmailRecuperacao(email);

        return "Senha enviada com sucesso! \n " +
                "Verifique a Caixa de Entrada\n" +
                "do seu e-mail\n" +
                "\n" +
                "Caso não tenha recebido, verifique a Caixa de Spam e Lixo Eletrônico ou\n" +
                "clique aqui para enviar novamente.\n" +
                "\n";
    }

    public void enviarEmailRecuperacao(String email) {
        //Envio do email
    }

    @PostMapping(path="/novo")
    public @ResponseBody void criarLogin(@RequestBody Login login) {
        loginRepository.save(login);
    }
}

package com.dandara.cadastro;

import com.dandara.anjoGuarda.AnjoGuarda;
import com.dandara.login.Login;

import java.util.List;

public class Cadastro {
    private DadosPessoais dadosPessoais;
    private Login login;
    private List<AnjoGuarda> anjoGuarda;

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<AnjoGuarda> getAnjoGuarda() {
        return anjoGuarda;
    }

    public void setAnjoGuarda(List<AnjoGuarda> anjoGuarda) {
        this.anjoGuarda = anjoGuarda;
    }
}

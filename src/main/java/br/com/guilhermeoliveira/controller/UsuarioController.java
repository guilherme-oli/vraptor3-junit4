package br.com.guilhermeoliveira.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.guilhermeoliveira.service.UsuarioService;

/**
 *
 * @author guilherme.oliveira
 */
@Resource
public class UsuarioController { 
    
    private final Result result;
    private final UsuarioService usuarioService;

    public UsuarioController(Result result, UsuarioService usuarioService) {
        this.result = result;
        this.usuarioService = usuarioService;
    }
    
    public void lista() {
        result.include("usuarios", usuarioService.lista());
    }
}

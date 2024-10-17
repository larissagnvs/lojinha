package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {

    public static UsuarioPojo criarUsuarioComum() {

        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("larissapastor");
        usuario.setUsuarioSenha("011216");

        return usuario;
    }

}

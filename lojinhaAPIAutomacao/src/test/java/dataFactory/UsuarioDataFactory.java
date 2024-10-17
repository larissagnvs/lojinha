package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {

    public static UsuarioPojo criarUsuarioComum() {

        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("-");
        usuario.setUsuarioSenha("-");

        return usuario;
    }

}

package com.registro.usuarios.resgistrousuariosspringsecurity.servicio;

import com.registro.usuarios.resgistrousuariosspringsecurity.dto.UsuarioRegistroDTO;
import com.registro.usuarios.resgistrousuariosspringsecurity.modelo.Usuario;

public interface UsuarioServicio {
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
}

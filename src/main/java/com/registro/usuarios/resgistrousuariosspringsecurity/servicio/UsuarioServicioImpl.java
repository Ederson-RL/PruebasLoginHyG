package com.registro.usuarios.resgistrousuariosspringsecurity.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registro.usuarios.resgistrousuariosspringsecurity.dto.UsuarioRegistroDTO;
import com.registro.usuarios.resgistrousuariosspringsecurity.modelo.Rol;
import com.registro.usuarios.resgistrousuariosspringsecurity.modelo.Usuario;
import com.registro.usuarios.resgistrousuariosspringsecurity.repositorio.UsuarioRepo;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private UsuarioRepo usuarioRepositorio;

    public UsuarioServicioImpl(UsuarioRepo usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(), registroDTO.getApellido(), registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Rol("Role_User")));
        return usuarioRepositorio.save(usuario);
    }

}

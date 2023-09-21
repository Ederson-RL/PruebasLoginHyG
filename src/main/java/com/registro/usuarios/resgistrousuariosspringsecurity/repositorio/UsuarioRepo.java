package com.registro.usuarios.resgistrousuariosspringsecurity.repositorio;

import org.springframework.stereotype.Repository;

import com.registro.usuarios.resgistrousuariosspringsecurity.modelo.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}

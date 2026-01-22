package com.gustavocardev.cadastro_usuario.infrastructure.repository;

import com.gustavocardev.cadastro_usuario.infrastructure.entitys.Usuario;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.Transient;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Optional <Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}

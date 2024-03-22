package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Usuario;

public interface UsuarioRepository  extends JpaRepository < Usuario, Long>{

}

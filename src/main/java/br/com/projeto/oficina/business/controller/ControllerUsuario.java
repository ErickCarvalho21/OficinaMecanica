package br.com.projeto.oficina.business.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ControllerUsuario {
    private int idAdministrador;
    private String email;
    private String nome;
    private String senha;
}

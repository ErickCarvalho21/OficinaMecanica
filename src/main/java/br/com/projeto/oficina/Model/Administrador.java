package br.com.projeto.oficina.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Administrador {
    private int idAdministrador;
    private String email;
    private String nome;
    private String senha;
}

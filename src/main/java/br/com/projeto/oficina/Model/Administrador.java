package br.com.projeto.oficina.Model;

import com.sun.jdi.request.StepRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAdministrador;

    @Column(nullable = true, unique = false)
    private String nome_adm;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

}

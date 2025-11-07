package br.com.projeto.oficina.Model;

import br.com.projeto.oficina.Repository.AdministradorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TesteJPA {
    public static void main(String[] args) {
        SpringApplication.run(Administrador.class, args);
    }

    @Bean
    public CommandLineRunner test(AdministradorRepository repository){
        return args -> {
            Administrador adm = new Administrador();
            adm.setNome_adm("Matheus");
            adm.setEmail("joaomatheus@gmail.com");
            adm.setSenha("matheus1234");

            repository.save(adm);

            Administrador encontrado = repository.findById(adm.getIdAdministrador());
            System.out.println("Encontrado: " + encontrado.getNome_adm());
        };
    }
}

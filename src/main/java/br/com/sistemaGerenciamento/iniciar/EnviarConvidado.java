package br.com.sistemaGerenciamento.iniciar;

import br.com.sistemaGerenciamento.model.Convidado;
import br.com.sistemaGerenciamento.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class EnviarConvidado implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    ConvidadoRepository convidadoRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {

            if (convidadoRepository.findAll().isEmpty()){

                for (int i = 0; i < 10; i++) {
                    save("diego danniel", 15);

                }
            }

    }

    public void save(String nome, int numero) {
        Convidado convidado = new Convidado(nome, numero);
        this.convidadoRepository.save(convidado);
    }
}

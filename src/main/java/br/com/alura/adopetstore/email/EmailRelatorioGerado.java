package br.com.alura.adopetstore.email;

import br.com.alura.adopetstore.dto.RelatorioEstoque;
import br.com.alura.adopetstore.dto.RelatorioFaturamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailRelatorioGerado {

    @Autowired
    private EnviadorEmail enviadorEmail;

    public void enviar(RelatorioEstoque relatorioEstoque, RelatorioFaturamento relatorioFaturamento) {
        enviadorEmail.enviarEmail(
                "Relatórios gerados",
                "admin@email.com",
                """
                        Olá!
                        
                        Seus relatórios foram gerados e seguem abaixo!
                        
                        %s
                        
                        %s
                        """.formatted(relatorioEstoque, relatorioFaturamento)
        );
    }

}

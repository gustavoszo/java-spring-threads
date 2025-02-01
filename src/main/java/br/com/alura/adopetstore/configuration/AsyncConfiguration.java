package br.com.alura.adopetstore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AsyncConfiguration {

    @Bean
    public Executor asyncExecutor(){
        // O ThreadPoolTaskExecutor É uma implementação de Executor no Spring, que usa um pool de threads para processar tarefas assíncronas de forma eficiente. Isso evita a criação e destruição constante de threads, o que pode ser caro em termos de desempenho.
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(3); // Define o número mínimo de threads que o pool deve manter ociosas, ou seja, o tamanho do pool básico
        executor.setMaxPoolSize(3);  // Define o número máximo de threads que o pool pode criar quando a carga de trabalho aumentar
        executor.setQueueCapacity(100); // Define a capacidade máxima da fila de tarefas esperando para ser executadas. Se o número de tarefas exceder essa capacidade, novas tarefas serão rejeitadas ou aguardadas, dependendo da estratégia de rejeição.
        executor.setThreadNamePrefix("AsynchThread-");
        executor.initialize(); // Inicializa o executor, o que configura efetivamente o pool de threads.

        return executor;
    }

}
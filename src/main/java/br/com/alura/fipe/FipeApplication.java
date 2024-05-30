package br.com.alura.fipe;

import br.com.alura.fipe.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(FipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var json = consumoApi.obterDados("https://parallelum.com.br/fipe/api/v1/carros/marcas");

	}
}

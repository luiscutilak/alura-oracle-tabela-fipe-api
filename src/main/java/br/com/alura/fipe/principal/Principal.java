package br.com.alura.fipe.principal;

import br.com.alura.fipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner sc = new Scanner(System.in);
    private ConsumoApi c = new ConsumoApi();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        var menu = """
       
       *** Digite o Tipo de veículo para Realizar a Consulta: ***
       
       Carro
       Moto
       Caminhão
                """;

        System.out.println(menu);
        var opcao = sc.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = c.obterDados(endereco);
        System.out.println(json);

    }
}

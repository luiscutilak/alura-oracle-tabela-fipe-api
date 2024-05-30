package br.com.alura.fipe.principal;

import br.com.alura.fipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner sc = new Scanner(System.in);
    private ConsumoApi c = new ConsumoApi();
    private final String ENDERECO = "";

    public void exibeMenu() {
        var menu = """
       *** Digite o Tipo de veículo para Realizar a Consulta: ***\n";
       Carro
       Moto
       Caminhão
                """;

        System.out.println(menu);
        var opcao = sc.nextLine();


    }
}

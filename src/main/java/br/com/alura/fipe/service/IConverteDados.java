package br.com.alura.fipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}

package Exercises.SenhasPrioridade;

import Exercises.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Senha> filaPrioridade = new Fila<>(6);
        Fila<Senha> filaNormal = new Fila<>(6);
        Atendimento at = new Atendimento(filaPrioridade, filaNormal);

        at.enfileirar(new Senha("Joelson", TipoSenha.NORMAL));
        at.enfileirar(new Senha("Joelson1", TipoSenha.NORMAL));
        at.enfileirar(new Senha("João", TipoSenha.PRIORITARIA));
        at.enfileirar(new Senha("Maria", TipoSenha.NORMAL));

        at.enfileirar(new Senha("Nanda", TipoSenha.PRIORITARIA));
        at.enfileirar(new Senha("Rodrigo", TipoSenha.PRIORITARIA));
        at.enfileirar(new Senha("Marcio", TipoSenha.PRIORITARIA));

        at.enfileirar(new Senha("Robson", TipoSenha.NORMAL));
        at.enfileirar(new Senha("Aline", TipoSenha.NORMAL));

        for (int i = 0; i < at.getTotalFila(); i++) {
            System.out.println(at.atender());
        }


    }
}

package Exercises.ControleProcessos;

import Exercises.Fila;

public class Main {

    public static void main(String[] args) {
        Fila<Processo> processoFila = new Fila<>(4);
        Controle controle = new Controle(processoFila);

        controle.adicionaProcesso(new Processo("Upload", 5000));
        controle.adicionaProcesso(new Processo("Http POST Request", 12000));
        controle.adicionaProcesso(new Processo("Photoshop.exe", 6000));
        controle.adicionaProcesso(new Processo("Bloco_de_Notas.exe", 11000));

        for (int i = 0; i < 4; i++) {
            System.out.println(controle.executaProcesso());
        }


    }
}

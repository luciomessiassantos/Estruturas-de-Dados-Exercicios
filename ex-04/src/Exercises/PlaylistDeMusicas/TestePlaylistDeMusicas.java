package Exercises.PlaylistDeMusicas;

import Exercises.ListaEncadeada;

public class TestePlaylistDeMusicas {
    public static void main(String[] args) {

        ListaEncadeada<String> playlist = new ListaEncadeada<>();

        playlist.adiciona("Musica A - Artista X");
        playlist.adiciona("Musica B - Artista Y");
        playlist.adiciona("Musica C - Artista Z");
        playlist.adiciona("Musica D - Artista W");
        playlist.adiciona("Musica E - Artista K");
        playlist.adiciona("Musica F - Artista L");

        System.out.println(playlist);

        System.out.println("Contém 'Musica B - Artista Y'? "
                + playlist.contem("Musica B - Artista Y"));

        System.out.println("Contém 'Musica X - Artista Z'? "
                + playlist.contem("Musica X - Artista Z"));

        System.out.println("\nTotal: " + playlist.getTamanho());

    }
}
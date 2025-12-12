package exercicios.minhasMusicas.principal;

import exercicios.minhasMusicas.modelos.MinhasPreferidas;
import exercicios.minhasMusicas.modelos.Musica;
import exercicios.minhasMusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Walk");
        minhaMusica.setArtista("Foo Fighters");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast podCast = new PodCast();
        podCast.setTitulo("Inglês do Zero ao Cem");
        podCast.setApresentador("Teacher Jay");
        podCast.setDescricao("Curso de inglês em formato de podcast");

        for (int i = 0; i < 5000; i++) {
            podCast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podCast);
        preferidas.inclui(minhaMusica);

    }
}

package game;

import game.level.Experencia;
import game.personaje.Heroe;
import game.personaje.Personaje;
import game.personaje.TipoAtaque;
import game.personaje.Villano;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner sc = new Scanner(System.in);
    private final Random rnd = new Random();

    public void start(Heroe heroe, Villano enemigo) {
        boolean turnoJugador = true;

        System.out.println("¡Comienza el combate!");
        printStatus(heroe, enemigo);

        while (!isComplete(heroe, enemigo)) {
            if (turnoJugador) {

                System.out.print("Tu turno. Escribe ataque (ATAQUE_ESPDADA, ATAQUE_FUEGO, ATAQUE_HIELO, CURACION): ");
                String input = sc.nextLine().trim();

                try {
                    TipoAtaque ataque = TipoAtaque.fromKeyboard(input);
                    heroe.userSkill(ataque, enemigo);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage()); // llama refactorizar en dos funciones
                    continue;
                }

            } else {

                TipoAtaque[] opciones = { TipoAtaque.ATAQUE_ESPDADA, TipoAtaque.ATAQUE_FUEGO, TipoAtaque.ATAQUE_HIELO };
                TipoAtaque ataque = opciones[rnd.nextInt(opciones.length)];
                enemigo.userSkill(ataque, heroe);
            }

            printStatus(heroe, enemigo);
            turnoJugador = !turnoJugador;
        }

      printResult(heroe,enemigo);
    }

    private boolean isComplete(Personaje h, Personaje e) {
        return h.getVida() <= 0 || e.getVida() <= 0;
    }

    private void printResult(Personaje heroe, Personaje enemigo){
        if (heroe.getVida() <= 0 && enemigo.getVida() <= 0) {
            System.out.println("¡Empate técnico!");
        } else if (heroe.getVida() <= 0) {
            System.out.println("Has sido derrotado…");
        } else {
            System.out.println("¡Victoria!");
        }
    }

    private void printStatus(Personaje h, Personaje e) {
        System.out.printf("Estado -> Héroe: %.0f HP | Enemigo: %.0f HP%n", h.getVida(), e.getVida());
    }
    //El juego hace que mi personaje suba de nivel se debe llamar cada vez que el heroe mate algo

    private void levelUp(Experencia experencia, Heroe h){
        if (h.getExp() >= experencia.getRangoDeExperencia()){
            h.setLevel(h.getLevel()+ 1);
            h.setVida(100);
            h.setAtaque(h.getAtaque() + 10);
        }
    }
}

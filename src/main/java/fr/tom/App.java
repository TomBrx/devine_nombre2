package fr.tom;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        Random randomNumbers = new Random();
        int nombreDeviner = randomNumbers.nextInt(100) + 1;

        System.out.println("Deviner le nombre : ");
        int nombre = clavier.nextInt();

        if (nombreDeviner == nombre) {
            System.out.println("Bonne réponse");
        }

        else if (nombreDeviner < nombre) {
            int ecart = nombre - nombreDeviner;
            System.out.println("Mauvaise reponse , Il vous manquait " + ecart + " .");
        }

        else {
            int ecart2 = nombreDeviner - nombre;
            System.out.println("Mauvaise reponse , vous avez de  " + ecart2 + " .");
        }
        System.out.println("Le nombre était " + nombreDeviner + " ."); // bonus pour test
    }

}

// 19. Deviner le nombre, version 2
// Reprenez le programme « Devinez le nombre » du TP précédent. Changez la
// sortie pour indiquer si votre nombre était trop grand ou
// trop petit. Le programme indiquera par exemple : Perdu ! Vous avez dépassé de
// 34 ou bien Perdu ! Il vous manquait 12.
// Si on a gagné, le programme doit afficher : Quel bol, vous avez trouvé !

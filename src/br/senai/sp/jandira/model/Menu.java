package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public void Menu(){

        boolean status = true;

        while (status) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("      menu Z O O L O G I C O");
            System.out.println(" ");
            System.out.println("[1] - Cadastro de animais");
            System.out.println("[2] - Gerenciamento de alojamento");
            System.out.println("[3] - Consulta de animais");
            System.out.println("[4] - Informações sobre saúde");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            int escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                Animais animais = new Animais();
                animais.CategoriaAnimal();
            }

        }
    }
}

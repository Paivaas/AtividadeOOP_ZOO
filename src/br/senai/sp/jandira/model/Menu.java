package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    boolean continuar = true;

    Scanner scanner = new Scanner(System.in);

    Mamiferos referenciaMamiferos = new Mamiferos();

    Repteis referenciaRepteis = new Repteis();
    Aves referenciaAves = new Aves();


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
            scanner.nextLine();

            if (escolhaMenu == 1) {

                while(continuar){

                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                    System.out.println("CADASTRO DE ANIMAIS");
                    System.out.println("Selecione a classificação:");
                    System.out.println("[1 - Mamifero] [2 - Ave] [3 - Reptil]");
                    System.out.println("[4 - Voltar]");
                    int categoria = scanner.nextInt();
                    scanner.nextLine();

                    if (categoria == 1) {
                        Mamiferos mamiferos = new Mamiferos();
                        mamiferos.CadastroMamifero();
                        referenciaMamiferos.adicionarLista(mamiferos);


                    } else if (categoria == 2) {
                        Aves aves = new Aves();
                        aves.CadastroAves();
                        referenciaAves.adicionarLista(aves);


                    } else if (categoria == 3) {
                        Repteis repteis = new Repteis();
                        repteis.CadastroReptil();
                        referenciaRepteis.adicionarLista(repteis);


                    } else if (categoria == 4){
                        continuar = false;
                    }else{
                        System.out.println("Valor invalido");

                    }

                }

            } else if (escolhaMenu == 3) {

                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("LISTAR ANIMAIS");
                System.out.println("[1 - Todos] [2 - Apenas Mamiferos] [3 - Apenas repteis] [4 - Apenas Aves]");
                int listarEscolha = scanner.nextInt();
                scanner.nextLine();

                if (listarEscolha == 1) {
                    referenciaMamiferos.listarMamiferos();
                    System.out.println("");
                    referenciaAves.ListaAves();
                    System.out.println("");
                    referenciaRepteis.ListaRepteis();

                }else if (listarEscolha == 2){
                    referenciaMamiferos.listarMamiferos();
                }else if (listarEscolha == 3){
                    referenciaRepteis.ListaRepteis();
                }else if (listarEscolha == 4){
                    referenciaAves.ListaAves();
                }else{

                }



            }

        }
    }
}

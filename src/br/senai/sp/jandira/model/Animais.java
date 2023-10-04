package br.senai.sp.jandira.model;

import java.util.Random;
import java.util.Scanner;

public class Animais {
    String nome, sexo, especie;

    Mamiferos referenciaMamiferos = new Mamiferos();
    int idade, identificacao;
    Scanner scanner = new Scanner(System.in);

    public void CategoriaAnimal(){
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("CADASTRO DE ANIMAIS");
        System.out.println("Selecione a classificação:");
        System.out.println("[1 - Mamifero] [2 - Ave] [3 - Reptil]");
        int categoria = scanner.nextInt();

        if (categoria == 1){
            Mamiferos mamiferos = new Mamiferos();
            mamiferos.CadastroMamifero();
            referenciaMamiferos.adicionarLista(mamiferos);
            mamiferos.listarMamiferos();

        }else if(categoria == 2){
            Aves aves = new Aves();
            aves.CadastroAves();

        } else if (categoria == 3) {
            Repteis repteis = new Repteis();
            repteis.CadastroReptil();
        }else
            System.out.println("Valor invalido");


    }

}


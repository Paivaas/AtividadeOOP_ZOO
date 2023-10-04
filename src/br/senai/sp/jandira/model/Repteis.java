package br.senai.sp.jandira.model;

import br.senai.sp.jandira.App;

import java.util.Scanner;

public class Repteis extends Animais {

    Scanner scanner = new Scanner(System.in);

    public void CadastroReptil() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("RÉPTIL");
        System.out.print("Nome: ");
        super.nome = scanner.nextLine();
        System.out.print("Especie: ");
        super.especie = scanner.nextLine();
        System.out.print("Sexo [F][M]: ");
        super.sexo = scanner.nextLine();
        System.out.print("Idade: ");
        super.idade = scanner.nextInt();
        System.out.print("Identificação: ");
        super.identificacao = scanner.nextInt();
        System.out.println("Cadastro de "+nome.toUpperCase()+" concluido com sucesso!");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }



}

package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamiferos extends Animais{

    Scanner scanner = new Scanner(System.in);

    List <Mamiferos> listaMamiferos = new ArrayList<>();

    public void adicionarLista(Mamiferos mamifero){
        listaMamiferos.add(mamifero);
    }
    public void listarMamiferos(){
        for(Mamiferos mamiferos : listaMamiferos){
            System.out.println(mamiferos.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }



    public void CadastroMamifero() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("MAMIFERO");
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

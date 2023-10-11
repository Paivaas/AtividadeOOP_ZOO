package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamiferos extends Animais{

    Scanner scanner = new Scanner(System.in);

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
        // listarMamiferos();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    List <Mamiferos> listaMamiferos = new ArrayList<>();


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void setIdentificacao(int identificacao) {this.identificacao = identificacao;}
    public int getIdentificacao(){ return identificacao; }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo(){ return sexo;}
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){ return idade;}



    public void adicionarLista(Mamiferos mamifero){
        listaMamiferos.add(mamifero);
    }
    public void listarMamiferos(){
        for(Mamiferos mamiferos : listaMamiferos){
            System.out.println("MAMIFERO ━━ "+mamiferos.getIdentificacao());
            System.out.println("Nome: "+mamiferos.getNome());
            System.out.println("Especie: "+mamiferos.getEspecie());
            System.out.println("Sexo: "+mamiferos.getSexo());
            System.out.println("Idade: "+mamiferos.getIdade());
            System.out.println(" ");
        }
    }

}

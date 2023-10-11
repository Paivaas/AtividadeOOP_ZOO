package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aves extends Animais{

    Scanner scanner = new Scanner(System.in);

    public void CadastroAves() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("AVES");
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

    List<Aves> listaAves = new ArrayList<>();

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


    public void adicionarLista(Aves aves){
        listaAves.add(aves);
    }

    public void ListaAves(){
        for(Aves aves : listaAves){
            System.out.println("AVE ━━ "+aves.getIdentificacao());
            System.out.println("Nome: "+aves.getNome());
            System.out.println("Especie: "+aves.getEspecie());
            System.out.println("Sexo: "+aves.getSexo());
            System.out.println("Idade: "+aves.getIdade());
            System.out.println(" ");
        }
    }


}

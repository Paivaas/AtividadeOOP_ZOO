package br.senai.sp.jandira.model;

import br.senai.sp.jandira.App;

import java.util.ArrayList;
import java.util.List;
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

    List<Repteis> listaRepteis = new ArrayList<>();

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


    public void adicionarLista(Repteis repteis){
        listaRepteis.add(repteis);
    }

    public void ListaRepteis(){
        for(Repteis repteis : listaRepteis){
            System.out.println("REPTEIS ━━ "+repteis.getIdentificacao());
            System.out.println("Nome: "+repteis.getNome());
            System.out.println("Especie: "+repteis.getEspecie());
            System.out.println("Sexo: "+repteis.getSexo());
            System.out.println("Idade: "+repteis.getIdade());
            System.out.println(" ");
        }
    }



}

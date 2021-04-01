/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author salmo
 */
public class Operator {
  Scanner cc = new Scanner(System.in);
    //Atributos da classe Operator, alterados para private  
    private String nome;
    private String oopcao;
    private String email;
    private int idade;
    private int quarto;
    private String telefone;
    private String cpf;
    //Construtor para acesso aos atributos através de outra classes 
    public Operator(String nome,int idade,String telefone, String cpf,String email) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    /*Linhas 38 á 84 - Metodos Getters e Setters
     *Getters --> Metodo para ler atributos
     *Setters --> Metodo para alterar valores dos atributos 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public int getQuarto() {
        return quarto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
    

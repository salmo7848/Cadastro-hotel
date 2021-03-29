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
  //NumberFormat ftel = new DecimalFormat("###.###.###-##");
  //NumberFormat fcpf = new DecimalFormat("###.###.###-##");   
    public String nome;
    public String oopcao;
    public String email;
    public int idade;
    public int quarto;
    public String telefone;
    public String cpf;

    public Operator(String nome,int idade,String telefone, String cpf,String email) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Operator() {
      
    }

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


    
    /*public void email(){
        String eemail = null;
        String p = "";
        System.out.print("Deseja informar o email: S/N ");
        String oopcao = cc.nextLine();
        if("S".equals(oopcao)){
           System.out.print("Informe o e-mail:");
           eemail = cc.nextLine();
           setEmail(eemail);
        }else{
           System.out.print("Email não cadastrado!");
         }
           
    }*/
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Operation.Operator;
import java.util.Scanner;

/**
 *
 * @author salmo
 */
public class TelaUm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alugado = 20;
        System.out.println("Quantidade de quartos: "+alugado);
        
        System.out.println("Quantidade de quartos a ocupar: ");
        int quant = sc.nextInt();
        Operator dados = new Operator();
        Operator [] vetor = new Operator [alugado];
       
        
        for(int i=1;i<=quant;i++){
            sc.nextLine();
        System.out.print("\nInforme o nome:");
            String nome = sc.nextLine();
        System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();
        System.out.print("Informe o quarto: ");
            int  quarto = sc.nextInt();
            sc.nextLine();
        System.out.print("Informe o telefone: ");
            String telefone = sc.nextLine();
        System.out.print("Informe o CPF: ");
            String cpf = sc.nextLine();
            
            String  email = "Email não cadastrado!";
     System.out.print("Deseja informar o email: S/N ");
         String oopcao = sc.nextLine();
             if("S".equals(oopcao)){
                 System.out.print("Informe o e-mail:");
                   email = sc.nextLine();
        }else{
           System.out.print(email);
        }
             
        vetor [quarto] = new Operator(nome,idade,telefone,cpf,email);
        }
        System.out.println(" ");
       for(int i=0; i < alugado; i++) {
            if(vetor[i] != null){
                System.out.println(i+": "+vetor[i].getNome()+", "+vetor[i].getIdade()+", "+vetor[i].getTelefone()
                        +", "+vetor[i].getCpf()+", "+vetor[i].getEmail());
            }
            }
            
       /*for(int i=0; i < alugado; i++) {
            if(vetor[i] != null){
		System.out.println(i+": "+vetor[i].getNome()+", "+vetor[i].getIdade()+", "+vetor[i].getIdade()+
                        ", "+vetor[i].getTelefone()+", "+vetor[i].getCpf()+", "+vetor[i].getEmail());
            }
        }*/
        
        
        
        sc.close();
    
    }
}


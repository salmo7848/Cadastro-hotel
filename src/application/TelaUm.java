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
        /*Variável alugado definirá o tamanhho do vetor*/
        int alugado = 20;
        System.out.println("Quantidade de quartos: "+alugado);
        /* Linha23 e 24 - variável quant definirá a quantidade de quartos a serem ocupados
        * quant será o limite de repetições do laço do vetor que solicitará os dados dos clientes
         * for(int i=1;i<=quant;i++)-->laço linha 35*/
        System.out.println("Quantidade de quartos a ocupar: ");
        int quant = sc.nextInt();
        /*Linha 27 - Objeto dados intanciando o construtor Operator()
         *Linha 28 - Objeto vetor  intanciando a variavel alugado como tamanho do vetor*/
        Operator dados = new Operator();
        Operator [] vetor = new Operator [alugado];
       
        /* Linhas 36 á 61 - Laço do vetor solicitando dados intanciados de contrutor
         * Operator(nome,idade,telefone,cpf,email); em objeto vetor [quarto], objeto na liha 60 
         * a variável quarto intanciada nesse objeto, serve para indicar as posições ou "quartos ocupados" que os dados
         * inseridos pertencem */
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
        /*Linhas 67 á 72 - Esse laço fará a impressão dos dados de cada quarto
         * Enquanto a posição de i for menor que a quantidade de quartos do hotel, imprima o que for diferente de nulo
         * Nesse laço vetor[i] é o mesmo que vetor[quarto] do laço acima, sendo i as posilçoes dos quartos ocupados
         * Se for preenchido um quarto com posição maior que alugado acontecerá o estouro do vetor*/
       for(int i=0; i < alugado; i++) {
            if(vetor[i] != null){
                System.out.println(i+": "+vetor[i].getNome()+", "+vetor[i].getIdade()+", "+vetor[i].getTelefone()
                        +", "+vetor[i].getCpf()+", "+vetor[i].getEmail());
            }
            }
      
        sc.close();
    
    }
}


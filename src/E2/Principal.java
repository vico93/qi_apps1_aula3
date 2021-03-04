/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

import java.util.Scanner;

/**
 *
 * @author Vico
 */
public class Principal {
    public static void main(String[] args) {
        // Entrada
        Scanner entrada = new Scanner(System.in);
        
        // Variáveis
        int opcao;
        
        // Menu
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Positivo ou Negativo");
        System.out.println("2 - Valores Iguais");
        System.out.println("3 - Par ou Impar");
        System.out.println("4 - Valor Maior");
        
        // Ler opção
        opcao = entrada.nextInt();
        
        switch (opcao)
        {
            case 1:
                // Instancia a classe do primeiro item
                NumInteiro positivo = new NumInteiro();
                
                // Lê atributos
                System.out.print("Digite o número: ");
                positivo.numero = entrada.nextInt();
                           
                // Resultado
                System.out.println(positivo.ehPositivo());
                break;
            case 2:
                // Instancia a classe do primeiro item
                DoisValores doisValores = new DoisValores();
                
                // Lê atributos
                System.out.print("Digite o primeiro valor real: ");
                doisValores.x = entrada.nextDouble();
                System.out.print("Digite o segundo valor real: ");
                doisValores.y = entrada.nextDouble();

                // Resultado
                System.out.println(doisValores.saoIguais());
                break;
            case 3:
                // Instancia a classe do primeiro item
                ParImpar parImpar = new ParImpar();
                
                // Lê atributos
                System.out.print("Digite o valor inteiro: ");
                parImpar.valor = entrada.nextInt();
                
                // Resultado
                System.out.println(parImpar.ehPar());
                break;
            case 4:
                // Instancia a classe do primeiro item
                MaiorValor maiorValor = new MaiorValor();
                
                // Lê atributos
                System.out.print("Digite o primeiro valor real (X): ");
                maiorValor.x = entrada.nextDouble();
                
                System.out.print("Digite o segundo valor real (Y): ");
                maiorValor.y = entrada.nextDouble();
                
                // Resultado
                System.out.println(maiorValor.maiorValor());
                break;
            default:
                // 
                System.out.println("Opção INVÁLIDA!");
        }
        
        System.out.println("\nFIM!\n");
    }
    
}

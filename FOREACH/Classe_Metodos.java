/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Particular
 */
public class Classe_Metodos {
    public void SeparaString(String frase) {
        
        String [] vetorPalavras = frase.split(";");
        //int lenght = vetorPalavras.length;
        // lenght seria usado em um método menos eficiente, onde o programa percorre todo o vetor, coletando o tamanho dele e depois, printando com um for.
        
        for (String palavra : vetorPalavras) {
            System.out.print(palavra + " " );
            //esse FOREACH usa uma variável "temporária" pra armazenar toda célula do vetor e printar ela, sendo mais rápido e mais eficiente
        }
       
    }
    
}

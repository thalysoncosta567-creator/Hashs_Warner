/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author aluno9
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Warner");
        nomes.add("Lucas");
        nomes.add("Gabriel");
        
        for (String nome: nomes){
            System.out.println(nome);
        }
        
        nomes.remove("Warner");
        System.out.println("\n NOVA LISTA");
        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println(nomes.contains("Warner"));
           System.out.println(nomes.contains("Lucas"));
           
           System.out.println("tamanho array"+ nomes.size());
           System.out.println("Nome (0)"+ nomes.get(0));
           System.out.println("");
           
           nomes.add("joaquin");
           //crescente
           Collections.sort(nomes);
           //decrescente
           Collections.reverse(nomes);
           System.out.println("Lista ordenada");
           for (String nome: nomes){
        
               System.out.println(nome);
           }
    }
    
}

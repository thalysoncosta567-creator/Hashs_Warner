/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;
import java.util.HashSet;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author aluno9
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        HashSet<String> nomes = new HashSet<>();// 2 valores, pode ser diferente, é um array com chave definida, apartir do ID criadao
        nomes.add("Warner");
        nomes.add("Ana Clara");
        nomes.add("Ligia");
        
        System.out.println(nomes);
        
        for( String pessoa: nomes){
            System.out.println(pessoa);
        }
        HashMap<String,String> unisal= new HashMap<>();
        unisal.put("WBR", "Warner");
        unisal.put("JBL", "Jg B Leonor");
        
            System.out.println(unisal.get("JBL"));
            
            FileWriter arq = new FileWriter("C:\\ARQUIVO\\dados.txt");
            PrintWriter grava = new PrintWriter(arq);
            grava.printf(unisal.get("JBL"));
            grava.printf("\n" + unisal.get( "WBR"));
            arq.close();
    }
    
    
}

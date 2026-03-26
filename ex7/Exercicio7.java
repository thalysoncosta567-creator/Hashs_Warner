/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author aluno9
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\ARQUIVO\\dados.txt"));
        String linha="";
        int i =0 ;
        while(true){
            if(linha != null){
                System.out.println(linha);
            }else{
                break;
            }
             linha = buffRead.readLine();
             
        }
    buffRead.close();
    }
    
}

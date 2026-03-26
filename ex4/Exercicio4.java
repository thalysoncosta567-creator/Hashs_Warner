/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author aluno9
 */
public class Exercicio4 {

      
    public static void main(String[] args) {
        // TODO code application logic here
       double valor [] = new double[10];
       
       
       for( int i = 0; i < valor.length; i++){
         
          System.out.println(" valor "+ i +"]= " + valor[i]);
    }
       System.out.println(" Tamanho " + valor.length); 
        
       for( double  vir : valor){
            System.out.println("Valor = ["+vir+"]");
    }
    Pessoa pessoa[]=  new Pessoa[2];
    Pessoa p1 = new Pessoa("Warner)", 40);
    Pessoa p2 = new Pessoa("Ana Clara", 15);
    
    pessoa[0]=p1;
    pessoa[1]=p2;

    
    
    for( int y = 0; y < pessoa.length; y++){
            System.out.println("Nome pessoa na p [" + y + "] :" + pessoa[y].getNome());
            System.out.println("Idade pessoa na p [" + y + "] :" + pessoa[y].getIdade());
}
}
}

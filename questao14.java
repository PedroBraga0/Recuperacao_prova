/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provarecuperação;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class questao14 {
    
     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("\nINFORME UM NÚMERO: ");
     int numeros = scanner.nextInt();
     
     switch(numeros){
         
         case 1:
         System.out.println ("\nJaneiro");
         break;       
        
        case 2:
         System.out.println ("\nFevereiro");
         break;       
     
         case 3:
         System.out.println ("\nMARÇO");
         break;       
     
         case 4:
         System.out.println ("\nABRIL");
         break;       
     
         case 5:
         System.out.println ("MAIO");
         break;       
     
         case 6:
         System.out.println ("JUNHO");
         break;            
     
         case 7:
         System.out.println ("JULHO");
         break;       
     
         case 8:
         System.out.println ("AGOSTO");
         break;       
         
          case 9:
         System.out.println ("SETEMBRO");
         break;       
         
          case 10:
         System.out.println ("OUTUBRO");
         break;       
         
          case 11:
         System.out.println ("NOVEMBRO");
         break;       
         
          case 12:
         System.out.println ("DEZEMBRO");
         break;       
                
        default:
       System.err.println("OPERAÇÃO INVALIDA USUARIO");
   }
 }
}

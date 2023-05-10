/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provarecuperação;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProvaRecuperação {

 public static void main(String[] args) throws IOException{
    
   Scanner scanner = new Scanner(System.in);

   System.out.println("INSIRA UM NÚMERO ABAIXO");
 
   int Numero = scanner.nextInt();
   String n = null;
   FileWriter arq = new FileWriter("C:Users\\aluno\\Desktop\\[CALCULADORA]]"+n+".txt");
   PrintWriter gravarArq =  new PrintWriter(arq);
   gravarArq.printf("Tabuada de ???");
   gravarArq.printf("-----DATA----");

 }
}
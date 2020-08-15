/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author prisu
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Livro l = new Livro();   
      l.titulo = "Use a Cabeça! Java";
      l.Editora = "Alta Books";
      l.edicao = 2;
      l.ano = 2007;
      l.autor = "Kathy Sierra";
      l.tipoCapa = "Brochura";
      l.QtdeFolhas = 796;
      l.ISBN = "9788576081739";
      l.idioma = "Português";       
          
      l.fechar();        
      l.estudar();
      System.out.println("***********STATUS*******");
      l.status();
      System.out.println("**************************");
    }
    
    }
    


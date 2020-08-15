
package aula2.pkg1;
public class Bolsa {
    
    String Marca;
    String Tipo;
    String Cor;
    int valor;
    boolean aberta;
    
    void abrir(){
        this.aberta = true;
    }
    
    void fechar(){
        this.aberta = false;
    }
    
    void status(){
    
        System.out.println("Marca: " + this.Marca);
        System.out.println("Tipo: " + this.Tipo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Valor " + this.valor);
        
  
    }
    
    
}

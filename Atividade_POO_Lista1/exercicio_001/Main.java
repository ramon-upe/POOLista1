package exercicio_001;

//import javax.swing.JOptionPane;

public class Main {
     public static void main(String[] args) {
         
         Matriz a = new Matriz(2,2);
         Matriz b = new Matriz(2,2);
         a.preencherMatriz(1);
         b.preencherMatriz(2);
         a.ImprimirMatriz(a.mutiplica(a, b));
     }
    
}
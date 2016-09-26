package exercicio_215;

import javax.swing.JOptionPane;

public class Aritmetica {
    private int numero1;
    private int numero2;

    public Aritmetica(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void resultado(){
        int soma;
        int divisao;
        int subtracao;
        int multiplicacao;
        
        soma = this.numero1 + this.numero2;
        divisao = this.numero1 / this.numero2;
        subtracao = this.numero1 - this.numero2;
        multiplicacao = this.numero1 * this.numero2;
        
        JOptionPane.showMessageDialog(null, "Resultado: \n Soma = "+soma+ "\n Subtração = "+subtracao+ "\n Divisão = "+divisao+ "\n Multiplicação = "+multiplicacao);
    }
    
    public int getNumero1(){
        return numero1;
    }
    public void setNumero1(){
        this.numero1 = numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public void setNumero2(){
        this.numero2 = numero2;
    }
}

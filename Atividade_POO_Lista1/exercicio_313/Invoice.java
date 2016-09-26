package exercicio_313;

import javax.swing.JOptionPane;

public class Invoice {
    String numero;
    String descricao;
    int item;
    double preco;
    
    public Invoice(String numero, String descricao, int item, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.item = item;
        this.preco = preco;
    }
    public void getInvoicAmount(){
        double multiplicacao;
        
        multiplicacao = this.item * this.preco;
        
        JOptionPane.showMessageDialog(null, "Digite o numero do produto: "+numero);
        JOptionPane.showMessageDialog(null, "Digite a descrição do produto: "+descricao);
        JOptionPane.showMessageDialog(null, "Digite a quantidade de Itens: "+item);
        JOptionPane.showMessageDialog(null, "Digite o preço do produto: "+preco);
}
     public String getNumero(){
         return numero;
     }
     public void setNumero(){
         this.numero = numero;
     }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(){
        this.descricao = descricao;
    }
    public int getItem(){
        return item;
    }
    public void setItem(){
        this.item = item;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(){
        this.preco = preco;
    }


        
}

package exercicio_001;

import javax.swing.JOptionPane;

public class Matriz {
    
    private int linha;
    private int coluna;
    private int[][] matriz;
    
    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.matriz = new int [linha][coluna];
        
    
    }
     public int getlinha() {
        return linha;
    }

    public void setlinha(int linha) {
        this.linha = linha;
    }
    public int getcoluna(){
        return coluna;
    }
    public void setcoluna(int coluna){
        this.coluna = coluna;
    }
    public int[][] getmatriz(){
        return matriz;
    }
//    public void setmatriz(int[][] matriz){
//        this.matriz = matriz;
//    }
    public void preencherMatriz (int m){
        int element;
        for (int i = 0; i < this.linha; i++){
            for (int j = 0; j < this.coluna; j++){
                element = Integer.parseInt(JOptionPane.showInputDialog("Insira o elemento da linha: "+i+"coluna: "+i+" da Matriz"+m));
                    this.matriz[i][j] = element;
            }
        }
    }
    
    public Matriz mutiplica (Matriz a, Matriz b){
    	if(a.getlinha() != b.getcoluna()){
    		JOptionPane.showMessageDialog(null, "Erro!");
    	}
    	 Matriz resultado = new Matriz(b.getcoluna(), a.getlinha());
    	 for (int i = 0; i < b.getcoluna(); i++) {
			for (int j = 0; j < a.getlinha(); j++) {
				for (int k = 0; k < b.getcoluna(); k++) {
					resultado.getmatriz()[i][j] += (b.getmatriz()[k][j] * a.getmatriz()[i][k]);
				}
			}
		}
    	return resultado;
    }
    
    
    public void ImprimirMatriz(Matriz a){
         String imprimir ="*****Matriz***** \n";
         for (int i = 0; i < a.getlinha(); i++){
        	 imprimir += " | ";
            for (int j = 0; j < a.getcoluna(); j++){
              imprimir += matriz [i][j] + " ";            
            }
            
            imprimir += " | \n";
            
         }
         
         JOptionPane.showMessageDialog(null, imprimir);
        
    }
}

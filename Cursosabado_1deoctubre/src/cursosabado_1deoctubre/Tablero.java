/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursosabado_1deoctubre;

/**
 *
 * @author HP
 */
public class Tablero {
    public static void main(String[] args) {
        
        int num[][] = new int [8][8];
        
int valor = 64;

for(int i = 0; i < num.length; i++){
for(int j = 0; j < num[i].length; j++){
num[i][j] = valor;
valor--;

System.out.print(num[i][j] + " ");
}
System.out.println();
}

        // TODO code application logic here
    }
    
}

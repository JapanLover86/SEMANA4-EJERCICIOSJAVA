
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class matriz10x10sumacolumnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese el tamaño de la matriz nxn: ");
        Scanner num = new Scanner (System.in);
        int n = num.nextInt();

        int [] sumacolumna = new int [n];
        int matriz[][] = new int [n][n];
        int fila1=0,suma2=0;

        System.out.println("Matriz "+n+"x"+n+": ");

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print("Ingrese el numero de la fila "+(i+1)+", columna "+(j+1)+": ");
                int numerov = num.nextInt();
                matriz[i][j] = numerov;
            }
        }
        
        System.out.println("\n");
        //para imprimir la matriz
        for(int i=0;i<matriz.length;i++){
        System.out.println(Arrays.toString(matriz[i]));
        }
        
        //metodo para sumar las columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
                sumacolumna[j] += matriz[i][j];
                
            }
        }
        for(int j=0;j<matriz.length;j++){
        System.out.println("La suma de las columnas es: "+sumacolumna[j]);
        }  
    }
}
    
    

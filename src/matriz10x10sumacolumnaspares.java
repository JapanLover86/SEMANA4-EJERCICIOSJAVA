
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
public class matriz10x10sumacolumnaspares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese el tamaño de la matriz nxn: ");
        Scanner num = new Scanner (System.in);
        int n = num.nextInt();

        int [] sumacolumnaspar = new int [n];
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
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i%2==0){
                    sumacolumnaspar[i] += matriz[i][j];
                }
            }
        }
        
        for(int i=0;i<matriz.length;i++){
            if(i%2==0){
        System.out.println("La suma de la columnas pares: "+i+"es: "+sumacolumnaspar[i]);
            }
        } 
    }
    
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class matriz10x10multiplicaciondiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int [10][10];
        int multi1=0,multi2=0;
        System.out.print("Ingrese el tamaño de la matriz nxn: ");
        Scanner num = new Scanner (System.in);
        int n = num.nextInt();
        System.out.println("Matriz "+n+"x"+n+": ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Ingrese el numero de la fila "+(i+1)+", columna "+(j+1)+": ");
                int numerov = num.nextInt();
                matriz[i][j] = numerov;
            }
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(matriz[i][j]+" ");
            multi1+=matriz[i][i];
            multi2+=matriz[n-i-1][i];
            System.out.print("\n");
        }
        System.out.println("La suma de la diagonal Principal es: "+multi1);
        System.out.println("La suma de la diagonal secundaria es: "+multi2);
        System.out.println("La multiplicacion de las diagonales es: "+(multi1*multi2));
    }
    
}

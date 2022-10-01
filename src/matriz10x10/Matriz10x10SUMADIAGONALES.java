/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz10x10;

import java.util.Scanner;



/**
 *
 * @author Andertaker
 */
public class Matriz10x10SUMADIAGONALES {
    public static void main(String args[]){
        int matriz[][] = new int [10][10];
        int suma1=0,suma2=0;
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
            suma1+=matriz[i][i];
            suma2+=matriz[n-i-1][i];
            System.out.print("\n");
        }
        System.out.println("La suma de la diagonal Principal es: "+suma1);
        System.out.println("La suma de la diagonal secundaria es: "+suma2);
        System.out.println("La suma de las diagonales es: "+(suma1+suma2));
    }
    
}
package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


/*
implementa una aplicación que ordena de menor a mayor los números que recibe
a través de su entrada estándar;
y muestra el resultado de la ordenación en su salida estándar.
 */
public class ordenar_lmp {

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        //creo un ArrayList para poder almacenar cualquier cantidad de números
        while (entrada.hasNextInt())
        //se ejecuta mientras no detecto algo diferente a un entero en su entrada
        {
            numeros.add(entrada.nextInt());
            //añade el siguiente número de la entrada al ArrayList
        }

        int[] ordenados= new int[numeros.size()];
        //creo un vector normal del mismo tamaño que sea el ArrayList tras recibir los números

        for (int i = 0; i < numeros.size(); i++) {
            //recorro el vector de números para copiarlos
            ordenados[i]=numeros.get(i);
        }
        //ordeno los números enteros
        Arrays.sort(ordenados);
        for (int i = 0; i < ordenados.length; i++) {
            //lo recorro, imprimiéndolos uno a uno por orden
            System.out.println(ordenados[i]);
        }
    }
}
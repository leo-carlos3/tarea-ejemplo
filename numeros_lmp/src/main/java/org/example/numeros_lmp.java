package org.example;
import java.util.Random;
public class numeros_lmp {
    /*
    Proyecto números: implementa una aplicación que genera números primos,
    tantos como sean pasados al programa como argumentos.
    El programa imprime los números primos por pantalla.
    El número primo generado no debe tener más de 3 cifras (>1000).
    Los números primos son generados al azar,
    no siguen un orden y nos da igual si se generan repetidos. Cada primo en una línea.
     */
    public static void main(String[] args) {
        int cantidad = 0;//inicializo la variable que almacenará cuántos números queremos
        if (args.length > 0) {
            //comprueba que se le hayan dado argumentos
            try {
                cantidad = Integer.parseInt(args[0]);
            } catch (NumberFormatException var8) {
                System.err.println("Necesito un número entero, no ''" + args[0] + "''.");
                System.exit(1);
            }
            /*
            Este try/catch intenta obtener un número entero del primer elemento
            que se diera como argumento. Si no encuentra un número, imprime
            un mensaje de error. Si lo encuentra, la variable "cantidad" pasa
            a almacenar dicho número
             */
        } else {
            //si no se le han dado argumentos, imprime un mensaje de error
            //para que sepas qué has hecho mal
            System.out.println("¡Dime cuántos números quieres!");
        }

        Random azar = new Random();//para generar un número aleatorio

        for(int i = 0; i < cantidad; ++i)//se repetirá tantas veces como números hayas pedido
        {
            boolean primo = false;
            //inicializo una variable que permitirá comprobar si el número es primo o no

            while(!primo)
            //mientras no encuentre un número primo...
                {
                int aleatorio = azar.nextInt(2, 1000);
                //genera un número al azar en el rango indicado (el límite superior es excluyente)
                    //comienza en 2 porque el 1 técnicamene no puede ser primo
                boolean divisible = false;
                //variable para comprobar si se encontró un divisor válido

                for(int divisor = 2; divisor <= aleatorio / 2; divisor++)
                //este for busca divisores válidos
                {
                    if (aleatorio % divisor == 0)
                    //si el resto del número entre el divisor diera cero...
                    {
                        divisible = true;//divisible pasa a ser verdadero
                        divisor = aleatorio;//el divisor se modifica para detener el bucle
                    }
                }

                if (!divisible)
                //si tras las comprobaciones no se encontró ningún divisor...
                {
                    primo = true; //primo pasa a ser verdadero para detener el while
                    System.out.println(aleatorio); //se imprime el número
                    if (i == cantidad - 1) {
                        System.out.println("Fin");
                        //si hemos encontrado el último número, imprime "Fin"
                        // para que el otro programa detecte que ha terminado
                    }
                }
            }
        }
    }
}
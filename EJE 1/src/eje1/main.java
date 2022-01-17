package eje1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Creamos un objeto Scanner
        Scanner scan = new Scanner(System.in);
        
        //A continuacion mostramos un pequeño menú que nos permite o bien ejecutar una bateria de pruebas o permitir al usuario
        //introducir un array a su gusto
        System.out.println("1. Ejecutar batería de pruebas.");
        System.out.println("2. Introducir array por el usuario.");
        int opt = scan.nextInt();
        long tiempo = 0;
        
        //Ejecutamos los 3 algoritmos para vectores de 4096 elementos
        AlgoritmoDivVen it1 = new AlgoritmoDivVen(4096);
        if(opt==1){   
            System.out.println("Algoritmo lineal \nMedia de un vector de 4096 elementos: ");
            it1.imprimir();
            tiempo=System.nanoTime();
            System.out.println("Media: " + it1.Lineal());
            tiempo = System.nanoTime() - tiempo;
            System.out.println("Tiempo (en ns): " + tiempo);
            System.out.print("\n \n");
            
            System.out.println("Algoritmo Divide y Vencerás para potencias de 2 \nMedia de un vector de 4096 elementos: ");
            it1.imprimir();
            tiempo =System.nanoTime();
            System.out.println("Media: " + it1.mediaEntradaP2());
            tiempo =System.nanoTime() - tiempo;
            System.out.println("Tiempo (en ns): " + tiempo);
            System.out.print("\n \n");
            
            System.out.println("Algoritmo Divide y Vencerás \nMedia de un vector de 4096 elementos: ");
            it1.imprimir();
            tiempo=System.nanoTime();
            System.out.println("Media: " + it1.mediaEntrada());
            tiempo =System.nanoTime() - tiempo;
            System.out.println("Tiempo (en ns): " + tiempo);
            System.out.print("\n \n");
        
        //En este else if permitimos al usuario que introduzca un array personalizado
        }else if(opt==2){
            System.out.println("Introduzca numero de elementos: ");
            int cant = scan.nextInt();
            
            double[] array = new double[cant];
            
            for(int ii=0;ii<cant;ii++){
                System.out.println("Elemento " + (ii+1) + ": ");
                array[ii] = scan.nextInt();
            }
            
            AlgoritmoDivVen it = new AlgoritmoDivVen(array);
            it.imprimir();
            System.out.println("Media Lineal: " + it.Lineal());
            if(it.mediaEntradaP2()!=-1){
                System.out.println("Media Divide y Vencerás para potencias de 2: " + it.mediaEntradaP2());
            }else{
                System.out.println("Media Divide y Vencerás para potencias de 2: El numero de elementos del vector no es potencia de 2");
            }
            System.out.println("Media Divide y Vencerás: " + it.mediaEntrada());
            
        }else{
            System.out.println("Opcion incorrecta");
        }
    } 
} 
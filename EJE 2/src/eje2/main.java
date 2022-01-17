package eje2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Creamos un objeto Scanner y un objeto Par
        Scanner scan = new Scanner(System.in);
        Par temp;
        
        //A continuacion mostramos un pequeño menú que nos permite o bien ejecutar una bateria de pruebas o permitir al usuario
        //introducir un array a su gusto
        System.out.println("1. Ejecutar batería de pruebas.");
        System.out.println("2. Introducir array por el usuario.");
        int opt = scan.nextInt();
        
        //Ejecutamos el algoritmo para arrays de 10, 33, 500 y 5000 elementos, para probar su eficiencia
        if(opt==1){          
            System.out.println("Maximos de un vector de 10 elementos: ");
            AlgoritmoDivVen it1 = new AlgoritmoDivVen(10);
            it1.imprimir();
            (temp = it1.maximo()).imprimir();
            
            System.out.println("Maximos de un vector de 33 elementos: ");
            AlgoritmoDivVen it2 = new AlgoritmoDivVen(33);
            it2.imprimir();
            (temp = it2.maximo()).imprimir();
            
            System.out.println("Maximos de un vector de 500 elementos: ");
            AlgoritmoDivVen it3 = new AlgoritmoDivVen(500);
            it3.imprimir();
            (temp = it3.maximo()).imprimir();
            
            System.out.println("Maximos de un vector de 5000 elementos: ");
            AlgoritmoDivVen it4 = new AlgoritmoDivVen(5000);
            it4.imprimir();
            (temp = it4.maximo()).imprimir();
            
        //En este else if permitimos al usuario que introduzca un array personalizado 
        }else if(opt==2){
            System.out.println("Introduzca numero de elementos: ");
            int cant = scan.nextInt();
            
            int[] array = new int[cant];
            
            for(int ii=0;ii<cant;ii++){
                System.out.println("Elemento " + ii + ": ");
                array[ii] = scan.nextInt();
            }
            
            AlgoritmoDivVen it = new AlgoritmoDivVen(array);
            it.imprimir();
            (temp = it.maximo()).imprimir();
            
        }else{
            System.out.println("Opcion incorrecta");
        }
    } 
}
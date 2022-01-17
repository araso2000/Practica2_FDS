package eje2;

//Clase que define el objeto Par definido por la práctica para guardar los datos mayor y segundo mayor
public class Par {
    private int mayor;
    private int mayor2;
    
    //Constructor que recibe e inicializa los atributos necesarios
    public Par(int v1,int v2){
        this.mayor=v1;
        this.mayor2=v2;
    }
    
    //Función básica para imprimir los datos pedidos ordenadamente
    public void imprimir(){
        System.out.println("Mayor: " + this.mayor + " \nSegundo mayor: " + this.mayor2 + "\n");
    }
}

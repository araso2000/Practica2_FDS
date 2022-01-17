package eje2;

public class AlgoritmoDivVen {
    private int[] vector;
    
    //Primer constructor que a partir del tamaño recibido crea un array con ese tamaño y lo rellena con valores aleatorios
    public AlgoritmoDivVen(int tam){
        this.vector=new int[tam];
        for(int i=0;i<this.vector.length;i++){
            this.vector[i]=(int)(Math.random()*99999);
        }
    }
    
    //Segundo constructor que recibe e inicializa el array con otro array
    public AlgoritmoDivVen(int[] vec){
        this.vector=vec;
    }
    
    //Funcion de entrada al algoritmo de búsqueda del primer y segundo maximo
    public Par maximo(){
        int max=max(0,this.vector.length-1); //Llamada al metodo recursivo que busca el primer maximo
        
        //Con este for buscamos el primer maximo y cambiamos su valor a 0, de esa manera podemos llamar otra vez al metodo recursivo y buscar el
        //segundo mayor que necesitamos
        for(int ii=0;ii<this.vector.length;ii++){
            if(this.vector[ii]==max){
                this.vector[ii]=0;
            }
        }
        
        int max2=max(0,this.vector.length-1);//Volvemos a llamar al metodo recursivo en busca del segundo mayor
        
        return(new Par(max,max2)); //Devolvemos los resultados en un nuevo objeto Par
    }
    
    //Metodo recursivo que busca el mayor de un array, solo necesita la posicion inicio y final
    public int max(int inicio,int fin){
        if(inicio==fin){
            return(this.vector[inicio]);
            //Establecemos el caso base,que define que si las posiciones inicio y final son iguales se devuelva el valor guardado en la posicion
            //inicio,que es la misma que fin
        }else{
            int medio = ((inicio + fin) / 2);//Calculamos la mitad de la porción de array que nos dicen por parámetro
            int maxM1 = max(inicio,medio);//Llamamos recursivamente al propio método dandole la primera mitad del array dado
            int maxM2 = max(medio+1,fin);//Llamamos recursivamente al propio método dandole la segunda mitad del array dad
            
            return(Math.max(maxM1, maxM2));//Devolvemos el mayor elemento encontrado entre la primera mitad y la segunda
        }
    }
    
    //Método básico que imprime el array para mostrar por pantalla
    public void imprimir(){
        for(int ii=0;ii<this.vector.length;ii++){
            System.out.print(this.vector[ii] + "\t");
        }
        System.out.println();
    }
}
package eje1;

public class AlgoritmoDivVen {
    private double[] array;
    private double maxiM1 = 0;
    private double maxiM2 = 0;
    
    //Constructor que inicializa el vector con el tamaño dado y con valores aleatorios
    public AlgoritmoDivVen(int tam){
        this.array=new double[tam];
        for(int i=0;i<this.array.length;i++){
            this.array[i]=(int)(Math.random()*99999);
        }
    }
    
    //Constructor que recibe un array
    public AlgoritmoDivVen(double[] arr){
        this.array=arr;
    }

    //Método lineal que calcula la media sumando todos los valores de un array en un for y despues dividiendolo por el numero de elementos
    public double Lineal(){
        double a=0;
        for(int ii=0;ii<this.array.length;ii++){
            a = a + array[ii];
        }
        return(a/this.array.length);
    }
    
    //Metodo que permite entrar en el posterior metodo recursivo de calculo de media en arrays de tamaño potencias de 2
    public double mediaEntradaP2(){
        if((this.array.length/2)%2==0){ //Comprobamos si el tamaño del array es potencia de 2
            return(mediaP2(0,this.array.length-1));
        }else{
            return(-1);
        }
    }
    
    //Metodo recursivo que calcula la media en arrays de tamaño potencias de 2 mediante divide y venceras
    public double mediaP2(int inicio,int fin){
        if(inicio==fin){ //Caso base
            return(this.array[inicio]);
        }else{
            int medio = ((inicio + fin) / 2); //Dividimos por la mitad el array
            double maxM1 = mediaP2(inicio,medio); //Llamamos recursivamente con la primera mitad del array
            double maxM2 = mediaP2(medio+1,fin);//Llamamos recursivamente con la segunda mitad del array
            return((maxM1+maxM2)/2); //Returneamos la media entre ambas mitades
        }
    }
    
    ////Metodo que permite entrar en el posterior metodo recursivo de calculo de media en arrays de tamaño indiferente
    public double mediaEntrada(){
        return(media(0,this.array.length-1));
    }
    
    //Metodo recursivo que calcula la media en arrays mediante divide y venceras
    public double media(int inicio,int fin){
        if(inicio==fin){ //Caso base
            return(this.array[inicio]);
        }else{
            int medio = ((inicio + fin) / 2); //Dividimos por la mitad el array
            maxiM1 = media(inicio,medio);//Llamamos recursivamente con la primera mitad del array
            maxiM2 = media(medio+1,fin);//Llamamos recursivamente con la segunda mitad del array
            if(((fin+1)-medio)==0 && (medio-inicio)==0){ //Como el array solo tiene un elemento, evitamos que nos haga una media sin valorar el peso de cada mitad
                maxiM1=maxiM1*((medio-inicio)/((fin+1)-inicio));//Porcentaje de peso de la primera mitad
                maxiM2=maxiM2*(((fin+1)-(medio))/((fin+1)-inicio));//Porcentaje de peso de la segunda mitad
            }else{
                return((maxiM1+maxiM2)/2);
            }
            return((maxiM1+maxiM2));
        }
    }
    
    //Metodo basico para imprimir el array
    public void imprimir(){
        for(int ii=0;ii<this.array.length;ii++){
            System.out.print(this.array[ii] + " \t");
        }
        System.out.println();
    }
    
}

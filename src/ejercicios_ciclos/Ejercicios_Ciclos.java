package ejercicios_ciclos;

/**
 *
 * @author SENA
 */
public class Ejercicios_Ciclos {
    public static void main(String[] args) {
        //imorimir los numeros del 1 al 100
        int indice;
        /*
        ciclo for tiene tres partes
        inicializacion
        condicion
        el incremento o decremento
        */
        //for(indice=5;indice<=100;indice+=5){
        //for(indice=100;indice>=1;indice--){
        System.out.println("ciclo for");
        for(indice=1;indice<=100;indice++){
        System.out.println(indice);
        }
        //ciclo do while
        System.out.println("ciclo do whie");
        indice=1;
        do{
            System.out.println(indice);
            indice++;
        }while(indice<=100);
        //ciclo while
        System.out.println("ciclo while");
        indice=1;
        while(indice<=100){
            System.out.println(indice);
            indice++;
        }
    }   
}
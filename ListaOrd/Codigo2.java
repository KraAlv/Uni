
/**
 * ordena los datos dados aleatoriamente en una lista.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Codigo2
{
    int [] lista;
    public Codigo2(int tam){
        lista = new int[tam];    
    }
    public int[] rellenar(int liminf, int limsup){
        for(int i =0; i < lista.length; i++){
            lista[i] = (int)(Math.random()*(limsup - liminf) + liminf+1);
        } 
        return lista;
    }
    public int[] rellenar2(int liminf, int limsup){
        for(int i = 0; i < lista.length; i++){
            int numero = (int)(Math.random()*(limsup - liminf)+ liminf + 1);
            if(!existe(numero)){
                lista[i]= numero;
            }
        }
        return lista;
    }
    private boolean existe(int numero){
        boolean there = existe(numero, 0, false);
        return there;
    }
    private boolean existe(int num, int indice, boolean there){
        if(lista[indice] == num){
            there = true;
        }else{
            there = existe(num, indice++ , there);
        }
        return there;
    }
    
    public int[] ordenar(){
        long startTime = System.nanoTime();
        
        long endTime = System.nanoTime();
        long time = endTime -  startTime;
        return lista;
    }
}

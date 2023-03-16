
/**
 * ordena los datos dados aleatoriamente en una lista.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rellenadorsinrep
{
    int [] lista;
    public Rellenadorsinrep(int tam){
        lista = new int[tam];    
    }
    public int[] rellenar(){
        int max =creadormax(((lista.length)+"").length());
        for(int i =0; i < lista.length; i++){
            lista[i] = (int)(Math.random()*(max - 1) + 1+1);
        } 
        return lista;
    }
    private int creadormax(int length){
        String num =9+"";
        for(int i=1; i < length; i++){
            num = num+"9";
        }
        int max = Integer.parseInt(num);
        return max;
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
    
}

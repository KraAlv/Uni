
/**
 * Write a description of class Replace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replace
{
    private String cad;
    public Replace(String cad){
        this.cad= cad.toLowerCase();
    }
    public void setcad(String ncad){
        cad = ncad.toLowerCase();
    }
    /**
     * funcion predeterminada de Java "ReplaceAll"
     */
    public String Javamode(String ochar, String nchar){
        long startTime = System.nanoTime();
        String cadreem = cad.replaceAll(ochar,nchar);
        long endTime = System.nanoTime();
        long tiempoejecucion = endTime - startTime;
        System.out.println("Tiempo1java: "+tiempoejecucion);
        return cad= cadreem;
    }
    
    /**
     * fucion miReplaceAll esta es otra manera funcional pero no tan efectiva y rapida como la de Java
     ya que suele tardar demasiado tiempo
     */
    public String ourreplace(String old, String nuevo){
        long startTime = System.nanoTime();
        String reem ="";
        for(int i=0; i< cad.length();){
            String palabra="";
            for(int j =0; j < old.length() && (j+i) < cad.length(); j++){   
                palabra = palabra + cad.charAt(i+j);                
            }
            if(palabra.equals(old)){    
                reem = reem + nuevo;      
                i = i + old.length();       
            }else{
                reem = reem + cad.charAt(i);       
                i++;                        
            }
        }
        cad = reem;         
        long endTime = System.nanoTime();
        long tiempo = endTime - startTime;
        System.out.println("Tiempo2: "+ tiempo);
        return cad;                 
    }
    /**
    * Mi metodo final que controlando el tiempo, compite contra el 
    * metodo de Java, incluso en algunos casos es mas eficiente.
    */
    public String ReplaceAll(String old, String nuevo){
        long startTime = System.nanoTime();
        String cd,cd2; cd=cd2="";
        int pos;
        for(int i = 0; (pos = cad.indexOf(old, i)) >= 0;){
            pos = cad.indexOf(old);
            cd2= toString(pos + old.length(), cad.length()); //cadena posterior a la palabra
            if(pos>=1){
                cd = toString(0, pos);              //cadena anterior a la palabra;
                cad = cd + nuevo + cd2;
                i = (cd+nuevo).length();
            }else if(pos == 0){
                cad = nuevo + cd2;
                i = nuevo.length();
            }
        }
        long endTime = System.nanoTime();
        long tiempo = endTime - startTime;
        System.out.println("Tiempo3: "+ tiempo);
        return cad;             //23
    }
    
    /**
    Metodo de ayuda, formador de cadenas que depende de una posicion inicial(pos1), y posicion limite(pos2),
    la cadena cocn la que trabajaran es el atributo esencial de esta clase.
    */
    private String toString(int pos1, int pos2){
        String cd3 ="";
        while(pos1 < pos2){
            cd3 = cd3 + cad.charAt(pos1);
            pos1++;
        }
        return cd3;
    }
}


package sv_sa_uesocc_prn335.guia01;


public class Utilities {

    /**
     Cristian Cornejo CC15085-prn335
     */
    public static void main(String[] args) {
        System.out.println(GetResume("bienvenido a java con maven y git"));
        String Frase="Su primer metodo de programacion con maven y git";
        System.out.print(capitalizar(Frase));
        System.out.print(contarCoincidencias("java es java por que es ","java"));
    }
    
    /**
     * 
     * @param texto
     * @return 
     */
    public static String GetResume(String texto){
    char letras= ' ';
    String cadenatexto="";
    int finaltexto=30;
    int letra;
    for(letra=1; letra<=finaltexto; letra++){
       letras= texto.charAt(letra);
       String ayu= String.valueOf(letras);
       if(!ayu.equals(" ")){
           cadenatexto+=cadenatexto;
           
       }else{
           cadenatexto+=" ";
           finaltexto+=1;
       }
    }
    
    return cadenatexto;
    /**
     * @param texto
     * @return
     */
}public static String capitalizar(String texto){
   char[] caracteres= texto.toCharArray();
   int posicion;
   for (posicion=0; posicion<texto.length();posicion++){
       caracteres[0]=Character.toUpperCase(caracteres[0]);
       if(caracteres[posicion]== ' '){
           caracteres[posicion+1]=Character.toUpperCase(caracteres[posicion+1]);
           
           
       }
       
   }
   texto=String.valueOf(caracteres);
   texto=(texto.replace(" ", " "));
   
   
   return texto; 
}
public static int contarCoincidencias(String frase ,String texto){
    int contador=0;
    while (frase.indexOf(texto)> -1){
        frase=frase.substring(frase.indexOf(texto)+texto.length(),frase.length());
        contador++;
    }
   return contador; 
}
    
}

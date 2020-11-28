
package viggenere5IV7;

/**
 *
 * @author alfre
 */

public class Viggecod {
  
    private String textoCifrado = "";
    private String textoClaro = "";
    
    CifradoViggenere cifradovigi = new CifradoViggenere();
    DecifrarViggenere descivigi = new DecifrarViggenere();
    
    public String encriptarTextoClaro(String textoClaro, String clave){
        String clavecompleta = "";
        int indice = 0;
        for(int i = indice; i<textoClaro.length(); i++){
            for(int j = 0; j<clave.length(); j++){
                if(clavecompleta.length() < textoClaro.length()){
                    if(textoClaro.charAt(i) != ' '){
                        clavecompleta += clave.charAt(j) + "";
                    }else{
                        clavecompleta += "";
                        j--;
                    }
                    indice++;
                }
            }
        }
        
        for(int i = 0; i<textoClaro.length(); i++){
            char charTextoClaro = textoClaro.charAt(i);
            char charClaveCompleta = clavecompleta.charAt(i);

            if(charTextoClaro != ' '){
                textoCifrado += cifradovigi.getTextoCifrado(charTextoClaro, charClaveCompleta);
                
            }else{
                textoCifrado += " ";
            }
        }
        
        return textoCifrado;
    }
    
    public String desencriptarTextoCifrado(String textoCifrado, String clave){
        String clavecompleta = "";
        int indice = 0;
        for(int i = indice; i<textoCifrado.length(); i++){
            for(int j = 0; j<clave.length(); j++){
                if(clavecompleta.length() < textoCifrado.length()){
                    if(textoCifrado.charAt(i) != ' '){
                        clavecompleta += clave.charAt(j) + "";
                    }else{
                        clavecompleta += "";
                        j--;
                    }
                    indice++;
                }
            }
        }
        for(int i = 0; i<textoCifrado.length(); i++){
            char charTextoCifrado = textoCifrado.charAt(i);
            char charClaveCompleta = clavecompleta.charAt(i);
            if(charTextoCifrado != ' '){
                textoClaro += descivigi.getTextoDescifrado(charTextoCifrado, charClaveCompleta);

            }else{
                textoClaro += " ";
            }
        }
        
        return textoClaro;
    }
    
}

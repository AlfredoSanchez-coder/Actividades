
package viggenere5IV7;

/**
 *
 * @author alfre
 */

public class DecifrarViggenere {
    
    char tablaCesar[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public char getTextoDescifrado(char TextoCifrado, char TextoClave){
      
        int indiceCharTextoCifrado = 0;
        int indiceCharTextoClave = 0;
        
        for(int i = 0; i < tablaCesar.length; i++){
            if(TextoCifrado == tablaCesar[i]){
                indiceCharTextoCifrado = i;
                break;
            }
        }
        
        for(int j = 0; j < tablaCesar.length; j++){
            if (tablaCesar[j] == TextoClave) {
                indiceCharTextoClave = j;
                break;
            }
        }
      
        if(indiceCharTextoCifrado >= indiceCharTextoClave){
            return tablaCesar[(indiceCharTextoCifrado - indiceCharTextoClave)%27];
        }else{
            return tablaCesar[27-(indiceCharTextoClave - indiceCharTextoCifrado)];
        }
    }
}
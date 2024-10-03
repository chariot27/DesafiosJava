/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema2.cep;

/**
 *
 * @author maxta
 */
public class CepApi {
    
    private static CepApi instancia = new CepApi();
    
    private CepApi(){
        super();
    }
    
    public static CepApi getInstancia(){
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Farroupilha";
    }

    public String recuperarEstado(String cep){
        return "RS";
    }    
    
    
    
}

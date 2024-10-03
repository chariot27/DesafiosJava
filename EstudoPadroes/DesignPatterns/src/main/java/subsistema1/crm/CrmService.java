/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema1.crm;

/**
 *
 * @author maxta
 */
public class CrmService {
    
    private CrmService(){
        super();
    }
    
    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema de CRM...");
        System.out.println("Nome: "+nome);
        System.out.println("CEP: "+cep);
        System.out.println("Estado: "+estado);
        System.out.println("Cidade: "+cidade);
    }
    
}

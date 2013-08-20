/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author orlando
 */
@WebService(serviceName = "Primo")
public class Primo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "primo")
    public String primo(@WebParam(name = "numero") String num) {
        int numero;
        try {
            numero = Integer.parseInt(num);
        } catch (Exception ex) {
            return "Número inválido!";
        }
        if (numero < 2) {
            return "O número " + numero + " não é primo";
        }
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
            if (cont > 2) {
                return "O número " + numero + " não é primo";
            }
        }
        return "O número " + numero + " é primo";
    }
}

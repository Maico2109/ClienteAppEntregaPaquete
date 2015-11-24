/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteEntrega;

import javax.ejb.Stateless;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

/**
 *
 * @author SIM-12
 */
@Stateless
@ServiceMode(value = javax.xml.ws.Service.Mode.PAYLOAD)
@WebServiceProvider(serviceName = "ServicioEntrega", portName = "ServicioEntregaPort", targetNamespace = "http://ServicioENtrega/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/NewWebServiceFromWSDL.wsdl")
public class NewWebServiceFromWSDL implements javax.xml.ws.Provider<javax.xml.transform.Source> {

    public javax.xml.transform.Source invoke(javax.xml.transform.Source source) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}

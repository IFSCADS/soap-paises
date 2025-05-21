//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.5 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package br.edu.ifsc.sj.ads.pbe;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifsc.sj.ads.pbe package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifsc.sj.ads.pbe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomaRequest }
     * 
     * @return
     *     the new instance of {@link SomaRequest }
     */
    public SomaRequest createSomaRequest() {
        return new SomaRequest();
    }

    /**
     * Create an instance of {@link SomaResponse }
     * 
     * @return
     *     the new instance of {@link SomaResponse }
     */
    public SomaResponse createSomaResponse() {
        return new SomaResponse();
    }

}

//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.5 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package br.edu.ifsc.sj.ads.pbe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="i1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="i2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "i1",
    "i2"
})
@XmlRootElement(name = "somaRequest")
public class SomaRequest {

    protected int i1;
    protected int i2;

    /**
     * Obtém o valor da propriedade i1.
     * 
     */
    public int getI1() {
        return i1;
    }

    /**
     * Define o valor da propriedade i1.
     * 
     */
    public void setI1(int value) {
        this.i1 = value;
    }

    /**
     * Obtém o valor da propriedade i2.
     * 
     */
    public int getI2() {
        return i2;
    }

    /**
     * Define o valor da propriedade i2.
     * 
     */
    public void setI2(int value) {
        this.i2 = value;
    }

}

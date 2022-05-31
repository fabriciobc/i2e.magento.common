//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.08 às 08:24:17 PM BRT 
//


package br.com.i2e.magento.common.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de filters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="filters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filter" type="{urn:Magento}associativeArray" minOccurs="0"/&gt;
 *         &lt;element name="complex_filter" type="{urn:Magento}complexFilterArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filters", propOrder = {
    "filter",
    "complexFilter"
})
public class Filters {

    protected AssociativeArray filter;
    @XmlElement(name = "complex_filter")
    protected ComplexFilterArray complexFilter;

    /**
     * Obtém o valor da propriedade filter.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeArray }
     *     
     */
    public AssociativeArray getFilter() {
        return filter;
    }

    /**
     * Define o valor da propriedade filter.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeArray }
     *     
     */
    public void setFilter(AssociativeArray value) {
        this.filter = value;
    }

    /**
     * Obtém o valor da propriedade complexFilter.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFilterArray }
     *     
     */
    public ComplexFilterArray getComplexFilter() {
        return complexFilter;
    }

    /**
     * Define o valor da propriedade complexFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFilterArray }
     *     
     */
    public void setComplexFilter(ComplexFilterArray value) {
        this.complexFilter = value;
    }

}

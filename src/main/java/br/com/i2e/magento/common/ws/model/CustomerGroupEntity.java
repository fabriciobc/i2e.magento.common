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
 * <p>Classe Java de customerGroupEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="customerGroupEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer_group_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customer_group_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerGroupEntity", propOrder = {
    "customerGroupId",
    "customerGroupCode"
})
public class CustomerGroupEntity {

    @XmlElement(name = "customer_group_id")
    protected int customerGroupId;
    @XmlElement(name = "customer_group_code", required = true)
    protected String customerGroupCode;

    /**
     * Obtém o valor da propriedade customerGroupId.
     * 
     */
    public int getCustomerGroupId() {
        return customerGroupId;
    }

    /**
     * Define o valor da propriedade customerGroupId.
     * 
     */
    public void setCustomerGroupId(int value) {
        this.customerGroupId = value;
    }

    /**
     * Obtém o valor da propriedade customerGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupCode() {
        return customerGroupCode;
    }

    /**
     * Define o valor da propriedade customerGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupCode(String value) {
        this.customerGroupCode = value;
    }

}

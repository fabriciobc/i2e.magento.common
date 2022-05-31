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
 * <p>Classe Java de orderItemIdQty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="orderItemIdQty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="order_item_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderItemIdQty", propOrder = {
    "orderItemId",
    "qty"
})
public class OrderItemIdQty {

    @XmlElement(name = "order_item_id")
    protected int orderItemId;
    protected double qty;

    /**
     * Obtém o valor da propriedade orderItemId.
     * 
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * Define o valor da propriedade orderItemId.
     * 
     */
    public void setOrderItemId(int value) {
        this.orderItemId = value;
    }

    /**
     * Obtém o valor da propriedade qty.
     * 
     */
    public double getQty() {
        return qty;
    }

    /**
     * Define o valor da propriedade qty.
     * 
     */
    public void setQty(double value) {
        this.qty = value;
    }

}

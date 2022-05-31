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
 * <p>Classe Java de customerCustomerEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="customerCustomerEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="website_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="created_in" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxvat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="password_hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerCustomerEntity", propOrder = {
    "customerId",
    "createdAt",
    "updatedAt",
    "incrementId",
    "storeId",
    "websiteId",
    "createdIn",
    "email",
    "firstname",
    "middlename",
    "lastname",
    "groupId",
    "prefix",
    "suffix",
    "dob",
    "taxvat",
    "confirmation",
    "passwordHash"
})
public class CustomerCustomerEntity {

    @XmlElement(name = "customer_id")
    protected Integer customerId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "increment_id")
    protected String incrementId;
    @XmlElement(name = "store_id")
    protected Integer storeId;
    @XmlElement(name = "website_id")
    protected Integer websiteId;
    @XmlElement(name = "created_in")
    protected String createdIn;
    protected String email;
    protected String firstname;
    protected String middlename;
    protected String lastname;
    @XmlElement(name = "group_id")
    protected Integer groupId;
    protected String prefix;
    protected String suffix;
    protected String dob;
    protected String taxvat;
    protected Boolean confirmation;
    @XmlElement(name = "password_hash")
    protected String passwordHash;

    /**
     * Obtém o valor da propriedade customerId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Define o valor da propriedade customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

    /**
     * Obtém o valor da propriedade createdAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Define o valor da propriedade createdAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Obtém o valor da propriedade updatedAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Define o valor da propriedade updatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

    /**
     * Obtém o valor da propriedade incrementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementId() {
        return incrementId;
    }

    /**
     * Define o valor da propriedade incrementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementId(String value) {
        this.incrementId = value;
    }

    /**
     * Obtém o valor da propriedade storeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * Define o valor da propriedade storeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreId(Integer value) {
        this.storeId = value;
    }

    /**
     * Obtém o valor da propriedade websiteId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebsiteId() {
        return websiteId;
    }

    /**
     * Define o valor da propriedade websiteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebsiteId(Integer value) {
        this.websiteId = value;
    }

    /**
     * Obtém o valor da propriedade createdIn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedIn() {
        return createdIn;
    }

    /**
     * Define o valor da propriedade createdIn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedIn(String value) {
        this.createdIn = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Define o valor da propriedade firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtém o valor da propriedade middlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Define o valor da propriedade middlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Obtém o valor da propriedade lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Define o valor da propriedade lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Obtém o valor da propriedade groupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Define o valor da propriedade groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupId(Integer value) {
        this.groupId = value;
    }

    /**
     * Obtém o valor da propriedade prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define o valor da propriedade prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Obtém o valor da propriedade suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Define o valor da propriedade suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Obtém o valor da propriedade dob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Define o valor da propriedade dob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Obtém o valor da propriedade taxvat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxvat() {
        return taxvat;
    }

    /**
     * Define o valor da propriedade taxvat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxvat(String value) {
        this.taxvat = value;
    }

    /**
     * Obtém o valor da propriedade confirmation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmation() {
        return confirmation;
    }

    /**
     * Define o valor da propriedade confirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmation(Boolean value) {
        this.confirmation = value;
    }

    /**
     * Obtém o valor da propriedade passwordHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Define o valor da propriedade passwordHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordHash(String value) {
        this.passwordHash = value;
    }

}

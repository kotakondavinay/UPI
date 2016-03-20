//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 06:38:41 PM GMT+05:30 
//


package com.ultracash.upi.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Head" type="{http://npci.org/upi/schema/}headType"/>
 *         &lt;element name="Txn" type="{http://npci.org/upi/schema/}payTrans"/>
 *         &lt;element name="Payer" type="{http://npci.org/upi/schema/}payerType"/>
 *         &lt;element name="Link">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" type="{http://npci.org/upi/schema/}linkType" />
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "head",
        "txn",
        "payer",
        "link"
})
@XmlRootElement(name = "ReqListAccount")
public class ReqListAccount {

    @XmlElement(name = "Head", required = true)
    protected HeadType head;
    @XmlElement(name = "Txn", required = true)
    protected PayTrans txn;
    @XmlElement(name = "Payer", required = true)
    protected PayerType payer;
    @XmlElement(name = "Link", required = true)
    protected ReqListAccount.Link link;

    /**
     * Gets the value of the head property.
     *
     * @return possible object is
     * {@link HeadType }
     */
    public HeadType getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     *
     * @param value allowed object is
     *              {@link HeadType }
     */
    public void setHead(HeadType value) {
        this.head = value;
    }

    /**
     * Gets the value of the txn property.
     *
     * @return possible object is
     * {@link PayTrans }
     */
    public PayTrans getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     *
     * @param value allowed object is
     *              {@link PayTrans }
     */
    public void setTxn(PayTrans value) {
        this.txn = value;
    }

    /**
     * Gets the value of the payer property.
     *
     * @return possible object is
     * {@link PayerType }
     */
    public PayerType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     *
     * @param value allowed object is
     *              {@link PayerType }
     */
    public void setPayer(PayerType value) {
        this.payer = value;
    }

    /**
     * Gets the value of the link property.
     *
     * @return possible object is
     * {@link ReqListAccount.Link }
     */
    public ReqListAccount.Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     *
     * @param value allowed object is
     *              {@link ReqListAccount.Link }
     */
    public void setLink(ReqListAccount.Link value) {
        this.link = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p/>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" type="{http://npci.org/upi/schema/}linkType" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link {

        @XmlAttribute
        protected LinkType type;
        @XmlAttribute
        protected String value;

        /**
         * Gets the value of the type property.
         *
         * @return possible object is
         * {@link LinkType }
         */
        public LinkType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is
         *              {@link LinkType }
         */
        public void setType(LinkType value) {
            this.type = value;
        }

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return ReflectionToStringBuilder.reflectionToString(this);
        }

    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
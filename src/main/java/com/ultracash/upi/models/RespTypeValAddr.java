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
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


/**
 * <p>Java class for respTypeValAddr complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="respTypeValAddr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="reqMsgId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maskName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respTypeValAddr")
public class RespTypeValAddr {

    @XmlAttribute
    protected String reqMsgId;
    @XmlAttribute
    protected String result;
    @XmlAttribute
    protected String errCode;
    @XmlAttribute
    protected String maskName;

    /**
     * Gets the value of the reqMsgId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqMsgId() {
        return reqMsgId;
    }

    /**
     * Sets the value of the reqMsgId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqMsgId(String value) {
        this.reqMsgId = value;
    }

    /**
     * Gets the value of the result property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the errCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the maskName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaskName() {
        return maskName;
    }

    /**
     * Sets the value of the maskName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaskName(String value) {
        this.maskName = value;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}

//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.03.19 at 01:44:17 PM IST 
//


package org.dspace.workflow;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 		Each task element has a mandatory name attribute and two
 * 		optional, repeatable children. The task name attribute
 * 		must match the plugin manager name given the task in
 * 		dspace.cfg.
 * 	    
 * 
 * <p>Java class for task-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="workflow" type="{https://dspace.org/workflow-curation}workflow-type"/&gt;
 *         &lt;element name="notify" type="{https://dspace.org/workflow-curation}notify-type"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task-type", namespace = "https://dspace.org/workflow-curation", propOrder = {
    "workflowOrNotify"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
public class TaskType {

    @XmlElements({
        @XmlElement(name = "workflow", namespace = "https://dspace.org/workflow-curation", type = WorkflowType.class),
        @XmlElement(name = "notify", namespace = "https://dspace.org/workflow-curation", type = NotifyType.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
    protected List<Object> workflowOrNotify;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
    protected String name;

    /**
     * Gets the value of the workflowOrNotify property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the workflowOrNotify property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowOrNotify().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyType }
     * {@link WorkflowType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
    public List<Object> getWorkflowOrNotify() {
        if (workflowOrNotify == null) {
            workflowOrNotify = new ArrayList<Object>();
        }
        return this.workflowOrNotify;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-19T13:44:17+05:30")
    public void setName(String value) {
        this.name = value;
    }

}

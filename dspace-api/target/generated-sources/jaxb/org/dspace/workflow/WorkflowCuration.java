//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.03.22 at 09:56:22 AM IST 
//


package org.dspace.workflow;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="taskset-map" type="{https://dspace.org/workflow-curation}taskset-map-type"/&gt;
 *         &lt;element name="tasksets" type="{https://dspace.org/workflow-curation}tasksets-type"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "workflow-curation", namespace = "https://dspace.org/workflow-curation")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
public class WorkflowCuration {

    @XmlElement(name = "taskset-map", namespace = "https://dspace.org/workflow-curation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    protected TasksetMapType tasksetMap;
    @XmlElement(namespace = "https://dspace.org/workflow-curation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    protected TasksetsType tasksets;

    /**
     * Gets the value of the tasksetMap property.
     * 
     * @return
     *     possible object is
     *     {@link TasksetMapType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    public TasksetMapType getTasksetMap() {
        return tasksetMap;
    }

    /**
     * Sets the value of the tasksetMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksetMapType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    public void setTasksetMap(TasksetMapType value) {
        this.tasksetMap = value;
    }

    /**
     * Gets the value of the tasksets property.
     * 
     * @return
     *     possible object is
     *     {@link TasksetsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    public TasksetsType getTasksets() {
        return tasksets;
    }

    /**
     * Sets the value of the tasksets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksetsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2025-03-22T09:56:22+05:30")
    public void setTasksets(TasksetsType value) {
        this.tasksets = value;
    }

}

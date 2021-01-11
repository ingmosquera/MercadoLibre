package com.challenge.appproducto.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Attribute implements Serializable {
    @SerializedName("value_id")
    @Expose
    private String valueId;
    @SerializedName("values")
    @Expose
    private List<Value> values = null;
    @SerializedName("source")
    @Expose
    private Integer source;
    @SerializedName("attribute_group_name")
    @Expose
    private String attributeGroupName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value_name")
    @Expose
    private String valueName;
    @SerializedName("value_struct")
    @Expose
    private ValueStruct valueStruct;
    @SerializedName("attribute_group_id")
    @Expose
    private String attributeGroupId;

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getAttributeGroupName() {
        return attributeGroupName;
    }

    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public ValueStruct getValueStruct() {
        return valueStruct;
    }

    public void setValueStruct(ValueStruct valueStruct) {
        this.valueStruct = valueStruct;
    }

    public String getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(String attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }
}

package com.dafei1288.hottea.ast;

import com.dafei1288.hottea.utils.Util;

public class AstNode {



    private String nodeText;
    private String nodeMapText;
    private Object nodeValue;
    private String typeString;
    private Class typeClass;

    public String getNodeText() {
        return nodeText;
    }

    public void setNodeText(String nodeText) {
        this.nodeText = nodeText;
    }

    public String getNodeMapText() {
        return nodeMapText;
    }

    public void setNodeMapText(String nodeMapText) {
        this.nodeMapText = nodeMapText;
    }

    public Object getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Object nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public Class getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(Class typeClass) {
        this.typeClass = typeClass;
    }

    public boolean isNumber(){
        return Util.isNumber(this.typeClass);
    }



    @Override
    public String toString() {
        return "AstNode{" +
                "nodeText='" + nodeText + '\'' +
                ", nodeMapText='" + nodeMapText + '\'' +
                ", nodeValue='" + nodeValue + '\'' +
                ", typeString='" + typeString + '\'' +
                ", typeClass=" + typeClass +
                '}';
    }
}

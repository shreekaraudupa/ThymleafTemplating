package com.shree.template.ThymleafTemplating.utility;

import java.util.Map;

public class Message {

    private String subject;
    private Map<String,String> paramValues;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Map<String, String> getParamValues() {
        return paramValues;
    }

    public void setParamValues(Map<String, String> paramValues) {
        this.paramValues = paramValues;
    }
}

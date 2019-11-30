package com.shree.template.ThymleafTemplating;

import com.shree.template.ThymleafTemplating.utility.Message;
import com.shree.template.ThymleafTemplating.utility.RenderUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TriggerRendering {


    private final RenderUtility renderUtility;

    @Autowired
    public TriggerRendering(RenderUtility renderUtility) {
        this.renderUtility = renderUtility;
    }


    public void triggerRender(){

        String template = "";
        Map<String,String> paramValues = new HashMap<>();
        paramValues.put("Field name","Field Value");
        paramValues.put("Field name 1","Field Value 1");
        paramValues.put("Field name 2","Field Value 2");



        Message message = new Message();
        message.setSubject("This is for test");
        message.setParamValues(paramValues);

        renderUtility.buildTemplate(template,message);

    }

}

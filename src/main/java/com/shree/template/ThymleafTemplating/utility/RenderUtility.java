package com.shree.template.ThymleafTemplating.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class RenderUtility {


    private final SpringTemplateEngine springTemplateEngine;

    @Autowired
    public RenderUtility(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;
    }

    //pass templatepath and object of message
    public String buildTemplate(String templatePath, Message message) {
        Context context = new Context();
        context.setVariable("message", message);

        return springTemplateEngine.process(templatePath, context);
    }

}

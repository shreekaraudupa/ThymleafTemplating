package com.shree.template.ThymleafTemplating.service;

import com.shree.template.ThymleafTemplating.TriggerRendering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemplatingService {


    TriggerRendering triggerRendering;

    public void trigger(){

        triggerRendering.triggerRender();

    }

}

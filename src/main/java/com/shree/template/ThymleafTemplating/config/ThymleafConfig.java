package com.shree.template.ThymleafTemplating.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;

@Configuration
public class ThymleafConfig {

    public static final String JSON_TEMPLATE_RESOLVE_PATTERN = "json/*";

    @Bean
    @Description("Thymeleaf Template Engine")
    public SpringTemplateEngine springTemplateEngine(final Collection<SpringResourceTemplateResolver> inTemplateResolvers) {
        final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        for (SpringResourceTemplateResolver templateResolver : inTemplateResolvers) {
            templateEngine.addTemplateResolver(templateResolver);
        }

        return templateEngine;
    }

    @Bean
    @Description("Thymeleaf HTML Template Resolver")
    public SpringResourceTemplateResolver htmlTemplateResolver() {
        SpringResourceTemplateResolver emailTemplateResolver = new SpringResourceTemplateResolver();
        emailTemplateResolver.setPrefix("classpath:/templates/html/");
        emailTemplateResolver.setSuffix(".html");
        emailTemplateResolver.setTemplateMode(TemplateMode.HTML);
        emailTemplateResolver.setCharacterEncoding(StandardCharsets.UTF_8.name());

        return emailTemplateResolver;
    }

    @Bean
    @Description("Thymeleaf HTML Template Resolver")
    public SpringResourceTemplateResolver jsonMessageTemplateResolver() {
        SpringResourceTemplateResolver jsonTemplateResolver = new SpringResourceTemplateResolver();
        jsonTemplateResolver.setPrefix("classpath:/templates/");
        jsonTemplateResolver.setResolvablePatterns(Collections.singleton(JSON_TEMPLATE_RESOLVE_PATTERN));
        jsonTemplateResolver.setSuffix(".json");
        jsonTemplateResolver.setCharacterEncoding("UTF-8");
        jsonTemplateResolver.setCacheable(false);
        jsonTemplateResolver.setOrder(2);

        return jsonTemplateResolver;
    }


}

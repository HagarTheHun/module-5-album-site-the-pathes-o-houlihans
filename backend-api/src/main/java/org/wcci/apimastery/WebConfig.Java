package org.wcci.apimastery;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

   @Override
    public void addCorsMappings(CorsRegistration registration){
       registry.addMapping("/**").allowedMethod("GET","POST","PUT","DELETE");
   }

}

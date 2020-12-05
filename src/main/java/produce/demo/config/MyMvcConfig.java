package produce.demo.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/equipment.html").setViewName("equipment");
        registry.addViewController("/performance.html").setViewName("performance");
        registry.addViewController("/produce.html").setViewName("produce");
        registry.addViewController("/production.html").setViewName("production");
        registry.addViewController("/quality.html").setViewName("quality");
        registry.addViewController("/login.html").setViewName("login");
    }


}

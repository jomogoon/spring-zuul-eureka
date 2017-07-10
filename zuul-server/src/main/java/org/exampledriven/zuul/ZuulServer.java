package org.exampledriven.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;
import java.net.URL;

@EnableZuulProxy
@SpringBootApplication
public class ZuulServer {

    public static void main(String[] args) throws Exception {

//        Object[] sources = {ZuulServer.class, new UrlResource(new URL("file:C:/dev/abc_dynamic.groovy"))};
//        Object[] sources = {ZuulServer.class,
//                new ClassPathResource("groovy/ExampleSurgicalDebugFilterBean.groovy")};
        SpringApplication.run(ZuulServer.class, args);

    }

}

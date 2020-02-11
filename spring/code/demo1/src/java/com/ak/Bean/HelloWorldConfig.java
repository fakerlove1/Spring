package com.ak.Bean;

import com.ak.Pojo.HelloWorld;
import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {

   @Bean 
   public HelloWorld helloWorld(){
      HelloWorld helloWorld= new HelloWorld();
      helloWorld.setMessage("这个是 基于java 配置的 helloworld");
      return helloWorld;
   }
}
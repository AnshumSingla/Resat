//package com.alibou.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Service;
//
//@Service
//@PropertySource("classpath:custom.properties")
//public class MyFirstService {
//
//    private MyFirstClass myFirstClass;
////    private Environment environment;
//
//    //This constructor was needed because the service file gets executed before the MyFirstClass file so it throws an error that
//    //the function sayHello is empty
//    //Below is the constructor method to inject beans
////    MyFirstService(MyFirstClass myFirstClass) {
////        this.myFirstClass = myFirstClass;
////    }
//
//    //This is the injection method to inject beans
//    @Autowired
//    public void injectDependencies(
//            @Qualifier("bean1") MyFirstClass myFirstClass
//    ) {
//        this.myFirstClass = myFirstClass;
//    }
//
//    @Value("Hello Anshum")
//    private String customProperty;
//    @Value("${my.prop}")
//    private String customPropertyFromFile;
//
//    public String getCustomProperty() {
//        return customProperty;
//    }
//
//    public String getCustomPropertyFromFile() {
//        return customPropertyFromFile;
//    }
//
//    public String tellAStory() {
//        return "My First dependency says " + myFirstClass.sayHello();
//    }
//
//    //The Environment bean is used to get info related to the environment
////    @Autowired
////    public void setEnvironment(Environment environment) {
////        this.environment = environment;
////    }
////
////    public String getJavaVersion() {
////        return environment.getProperty("java.version");
////    }
////
////    public String getOSName() {
////        return environment.getProperty("os.name");
////    }
//}

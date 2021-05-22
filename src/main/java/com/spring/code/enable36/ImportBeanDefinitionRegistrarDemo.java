package com.spring.code.enable36;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

//ImportBeanDefinitionRegistrar spring容器运行时动态添加Bean到配置类中
public class ImportBeanDefinitionRegistrarDemo implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {

        //AnnotationMetadata 获取当前配置类上的注解
        //BeanDefinitionRegistry 注册Bean
        /*Set<MethodMetadata> annotatedMethods =
                importingClassMetadata.getAnnotatedMethods("com.spring.code.enable36.EnableConfig");
        while(annotatedMethods.iterator().hasNext()) {
            MethodMetadata next = annotatedMethods.iterator().next();
            System.out.println(next.getDeclaringClassName());
            System.out.println(next.getMethodName());
            System.out.println(next.getReturnTypeName());
        }*/

       /* System.out.println("-----------获取注解类型-------------");
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        for(String str : annotationTypes) {
            System.out.println(str);
        }*/

        /*System.out.println("------------------------");
        Set<String> metaAnnotationTypes =
                importingClassMetadata.getMetaAnnotationTypes("com.spring.code.enable36.EnableConfig");
        for(String str : metaAnnotationTypes) {
            System.out.println(str);
        }
        System.out.println("------------BeanDefinitionRegistry---------");

        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        System.out.println("----------------");
        BeanDefinition person = registry.getBeanDefinition("enableConfig");
        System.out.println(person.getBeanClassName());
        System.out.println("----------------");
        System.out.println(registry.getBeanDefinitionCount());
        System.out.println("-----------------");
        if(registry.containsBeanDefinition("enableConfig")) {
            registry.registerBeanDefinition("person",person);
        }*/
        // register bean
        // 1 自定义扫描注解
        MyClassPathBeanDefinitionScanner scanner =
                new MyClassPathBeanDefinitionScanner(registry,false);
        scanner.registerFilters();
        scanner.doScan("com.spring.code");

        System.out.println(Arrays.toString(registry.getBeanDefinitionNames()));
        // 2
       /* Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");//扫描类
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
        scanner.addIncludeFilter(new AssignableTypeFilter(X.class));
        scanner.scan(basePackages);*/
        System.out.println(registry.getBeanDefinitionCount());
    }
}

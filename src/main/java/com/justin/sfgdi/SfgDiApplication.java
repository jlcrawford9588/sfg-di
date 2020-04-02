package com.justin.sfgdi;

import com.justin.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.invoke.ConstantBootstraps;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("-----------I18n Profile----------");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("-----------Primary Bean----------");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("-----------Property----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----------Setter----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------Constructor----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

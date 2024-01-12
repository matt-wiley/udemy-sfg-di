package guru.springframework.udemysfgdi;

import guru.springframework.udemysfgdi.controllers.ConstructorInjectedController;
import guru.springframework.udemysfgdi.controllers.PropertyInjectedController;
import guru.springframework.udemysfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemySfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(UdemySfgDiApplication.class, args);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}

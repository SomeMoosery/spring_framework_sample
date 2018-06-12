package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext; // for init, destroy
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      ConfigurableApplicationContext configContext = new ClassPathXmlApplicationContext("Beans.xml");
//      AbstractApplicationContext abContext = new ClassPathXmlApplicationContext("Beans.xml"); // for init, destroy
      
//      /**
//      Singleton scope (in Beans.xml) means only one of these beans is created through the entire IoC 
//  	  Even if you have a HelloWorld objA, set its message to "hey," then make an objB and get its message, it'll still be "hey"
//  	  **/
//      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//      objA.setMessage("Fuck");
//      objA.getMessage();
//      
//      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//      objB.getMessage();
//      
//      /**
//       * Prototype scope (in Beans.xml) means that a new instance of that bean is made every time a new class of it is made
//       * So here, when you getMessage() objC, you'll get objC Test. But when you getMessage() objD, you'll get what's in value in Beans.xml 
//       * If you don't have a value in Beans.xml for helloWorldPrototype, you'll get null
//       */
//      HelloWorldPrototypeBean objC = (HelloWorldPrototypeBean) context.getBean("helloWorldPrototype");
//      objC.setMessage("objC Test");
//      objC.getMessage();
//      
//      HelloWorldPrototypeBean objD = (HelloWorldPrototypeBean) context.getBean("helloWorldPrototype");
//      objD.getMessage();
//      
//      /**
//       * Using init-method and destroy-method provides custom functionality when bean is initially instantiated and just before bean is removed from the container
//       * Could also do default-init-method and default-destory-method under xsi:schemaLocation in Beans.xml header if you do the same init/destroy for many different beans
//       */
//      InitDestroy objE = (InitDestroy) context.getBean("initDestroy");
//      objE.getMessage();
//      //This is commenting out below because you can't continuously shutdown, and we do below for pre and post processing! 
////      abContext.registerShutdownHook(); // ensures graceful shtdown and calls relevant destroy methods
//      
//      /**
//       * Pre and Post processing will print the bean name before and after initialization of every bean
//       */
//      InitDestroy objF = (InitDestroy) context.getBean("initDestroy");
//      objF.getMessage();
//      abContext.registerShutdownHook();
//      
//      /**
//       * Nested Beans
//       * HelloUSA inherits from helloEarth, but because the helloEarth bean is abstract, it cannot be instantiated on its own. It's just a template. Note there's no class.
//       */
//      
//      HelloUSA objH = (HelloUSA) context.getBean("helloUSA");
//      objH.getMessage1();
//      objH.getMessage2();
//      objH.getMessage3();
      
      /**
       * Deals with showing nested dependencies 
       */
//      TextEditor editor = (TextEditor) context.getBean("textEditor");
//      editor.spellCheck();
//      
//      JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
//      jc.getAddressList();
//      jc.getAddressSet();
//      jc.getAddressMap();
//      jc.getAddressProp();
      
      configContext.start();
      HelloWorld object = (HelloWorld) configContext.getBean("helloWorld");
      object.getMessage();
      
      configContext.stop();
   }
}
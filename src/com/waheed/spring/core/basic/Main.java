/**
 * 
 */
package com.waheed.spring.core.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Simple Test cases to print message from default constructor and from XML configuration file. 
 * 
 * @author abdul
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BeanFactory beans = new XmlBeanFactory(new FileSystemResource("beans1.xml"));

        //Get the HelloSpring Object from the container (default)
        HelloSpring spring1 = (HelloSpring)beans.getBean("helloSpring1");

        System.out.println("Message from spring1: \t" + spring1.getMessage());

        HelloSpring spring2 = (HelloSpring)beans.getBean("helloSpring2");
        // From the XML configuation file
        System.out.println("Message from spring2: \t" + spring2.getMessage());

    }
}

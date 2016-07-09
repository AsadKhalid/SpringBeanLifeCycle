/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.life.cycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class ComBeanLifeCycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Shape shape = (Shape) context.getBean("Triangle");
        shape.draw();
        Shape shape1 = (Shape) context.getBean("Circle");
        shape1.draw();
        context.registerShutdownHook();
    }
}

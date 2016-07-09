/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.life.cycle;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Administrator
 */
public class Triangle implements ApplicationContextAware , BeanNameAware, InitializingBean, DisposableBean, Shape{
    private ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext con) throws BeansException{
        this.context=con;
    }
    
    public ApplicationContext getApplicationContext() throws BeansException{
        return context;
    }
    @Override
    public void setBeanName(String beansName){
        System.out.println("Bean Name : "+beansName);
    } 
    
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    @Override
    public void draw(){
        System.out.println("Triangle");
        for(Point point:points){
            System.out.println("Point = ("+point.getxAxis()+","+point.getyAxis()+")");
        }
    }
    public void myInit(){
        System.out.println("Bean is going through init.");
    }
    public void myDestroy(){
        System.out.println("Bean will destroy now");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
         System.out.println("Triangle Bean initialized called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Triangle Bean destory called");
    }

}

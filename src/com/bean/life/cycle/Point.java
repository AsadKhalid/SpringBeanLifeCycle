/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean.life.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Administrator
 */
public class Point implements InitializingBean, DisposableBean{
    private int xAxis,yAxis;

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }
    public void myInit(){
        System.out.println("Bean is going through init.");
    }
    public void myDestroy(){
        System.out.println("Bean will destroy now");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
         System.out.println("Point Bean initialized called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Point Bean destory called");
    }
}

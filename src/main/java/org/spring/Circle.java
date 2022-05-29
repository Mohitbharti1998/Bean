package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.annotation.Resource;

public class Circle implements Shape{


    private Point center;


    public Point getCenter() {
        return center;
    }


    @Resource(name = "point3")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Center Point is :"+center.getX()+", "+center.getY());
    }
}

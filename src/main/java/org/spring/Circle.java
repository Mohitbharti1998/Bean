package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.annotation.Resource;

public class Circle implements Shape{


    private Point center;

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }


    @Resource(name = "point3")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
        System.out.println(this.messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()},"Default Greeting",null));
//        System.out.println("Center Point is :"+center.getX()+", "+center.getY());

    }
}

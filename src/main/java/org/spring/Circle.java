package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.annotation.Resource;

public class Circle implements Shape, ApplicationEventPublisherAware {


    private Point center;

    @Autowired
    private MessageSource messageSource;


    private ApplicationEventPublisher publisher;

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
        DrawEvent drawEvent =  new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}

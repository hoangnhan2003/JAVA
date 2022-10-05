package CaseStudy.ManageResort.model.Facility;

import CaseStudy.ManageResort.model.Facility.AbsUnit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Room extends AbsUnit {
    private String freeService;

    public Room(String service, float fee, float useArea, int maxPerson, String freeService) {
        super(service, fee, useArea, maxPerson);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return
                super.getService() +','+
                super.getFee() +","+
                super.getUseArea() +','+
                super.getMaxPerson() +','+
                freeService + '\n' ;
    }



    public String display(){
        return "Room{" +
                "service='" + getService()  +
                ", fee=" + getFee() +
                ", useArea=" + getUseArea() +
                ", maxPerson=" + getMaxPerson() +" ,"+
                "freeService='" + freeService + '\'' +
                '}';
    }
}

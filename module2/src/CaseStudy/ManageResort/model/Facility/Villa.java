package CaseStudy.ManageResort.model.Facility;

import CaseStudy.ManageResort.model.Facility.AbsUnit;

public class Villa extends AbsUnit {
    private int qualifiedRoom;
    private float poolArea;
    public Villa(String service, float fee, float useArea, int maxPerson, int qualifiedRoom, float poolArea) {
        super(service, fee, useArea, maxPerson);
        this.qualifiedRoom = qualifiedRoom;
        this.poolArea = poolArea;
    }

    public Villa(float useArea) {
        super(useArea);
    }

    public Villa(String service) {
        super(service);
    }

    public int getQualifiedRoom() {
        return qualifiedRoom;
    }

    public void setQualifiedRoom(int qualifiedRoom) {
        this.qualifiedRoom = qualifiedRoom;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return  super.getService()+","
                + super.getFee()+","
                + super.getUseArea()+","
                + super.getMaxPerson()+","
                + qualifiedRoom +","
                + poolArea +"\n";
    }


    public String display(){
        return "Villa{" +
                "service='" + getService()  +
                ", fee=" + getFee() +
                ", useArea=" + getUseArea() +
                ", maxPerson=" + getMaxPerson() +" ,"+
                "qualifiedRoom=" + qualifiedRoom +
                ", poolArea=" + poolArea +
                '}';
    }


}

package CaseStudy.ManageResort.model.Facility;

import java.util.Objects;

public abstract class AbsUnit {
    private String service;
    private float fee;
    private float useArea;
    private int maxPerson;

    public AbsUnit(String service, float fee, float useArea, int maxPerson) {
        this.service = service;
        this.fee = fee;
        this.useArea = useArea;
        this.maxPerson = maxPerson;
    }


    public AbsUnit(float fee) {
        this.fee = fee;
    }

    public AbsUnit(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public float getUseArea() {
        return useArea;
    }

    public void setUseArea(float useArea) {
        this.useArea = useArea;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbsUnit)) return false;
        AbsUnit absUnit = (AbsUnit) o;
        return Objects.equals(getService(), absUnit.getService());
    }

    @Override
    public String toString() {
        return "AbsUnit{" +
                "service='" + service + '\'' +
                ", fee=" + fee +
                ", useArea=" + useArea +
                ", maxPerson=" + maxPerson +
                '}';
    }
}

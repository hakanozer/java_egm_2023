package org.example;

public class City {

    private int cid;
    private String name;
    private String code;

    public City() {
    }

    public City(int cid, String name, String code) {
        this.cid = cid;
        this.name = name;
        this.code = code;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

}

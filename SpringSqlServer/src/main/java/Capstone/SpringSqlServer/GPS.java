package Capstone.SpringSqlServer;

import javax.persistence.Entity;

@Entity
public class GPS {

    private Float xcoord;
    private Float ycoords;

    public Float getXcoord() {
        return this.xcoord;
    }

    public void setXcoord(Float xcoord) {
        this.xcoord = xcoord;
    }

    public Float getYcoord() {
        return this.ycoords;
    }

    public void setYcoords(Float ycoord) {
        this.ycoords = ycoord;
    }
}

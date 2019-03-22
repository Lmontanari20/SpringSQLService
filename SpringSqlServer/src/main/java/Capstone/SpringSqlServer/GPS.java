package Capstone.SpringSqlServer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="gps")
public class GPS {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name ="xcoords")
    private Float xcoord;

    @Column(name ="ycoords")
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

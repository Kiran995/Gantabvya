package kiran.gantabvya.com.gantabya;

/**
 * Created by Prajapati on 2/11/2017.
 */
public class Places {

    int id;
    String name;
    double lat;
    double longi;

    Places(int id, String name, double lat, double longi){
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.longi = longi;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

}

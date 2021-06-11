import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
    private long id;
    private String make;
    private String model;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String toString(){
        return getId() + ". " + getMake() + " " + getModel();
    }
}
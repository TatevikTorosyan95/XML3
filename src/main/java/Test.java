import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        try {
            File file = new File("car.xml");
            Car car = new Car();
            car.setId(1);
            car.setMake("Toyota");
            car.setModel("Camry");
            JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.marshal(car, file);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File file = new File("car.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Car student = (Car) unmarshaller.unmarshal(file);

            System.out.println(student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

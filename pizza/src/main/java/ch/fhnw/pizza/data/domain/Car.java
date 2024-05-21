import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

package ch.fhnw.pizza.data.domain;


@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden //This annotation hides the id field from the swaggerdocumentation
    @Column(name = "car_id", nullable = false)
    private Long carId;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_year")
    private Date carYear;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "car_license_plate")
    private String carLicensePlate;

    @Column(name = "car_rental_rate")
    private Long carRentalRate;

    @Column(name = "car_availability")
    private String carAvailability;


    

 //   @ManyToOne
 //   private Menu menu;
 

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getCarYear() {
        return carYear;
    }

    public void setCarYear(Date carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    public Long getCarRentalRate() {
        return carRentalRate;
    }

    public void setCarRentalRate(Long carRentalRate) {
        this.carRentalRate = carRentalRate;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }
}












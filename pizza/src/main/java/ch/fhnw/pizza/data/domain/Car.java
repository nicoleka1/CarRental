package ch.fhnw.pizza.data.domain;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden //This annotation hides the id field from the swagger documentation
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

 //   public Long getId() {
 //       return id;
 //   }

 //   public void setId(Long id) {
 //       this.id = id;
 //   }

 //   public String getPizzaToppings() {
 //       return pizzaToppings;
 //   }

 //   public void setPizzaToppings(String pizzaToppings) {
 //       this.pizzaToppings = pizzaToppings;
 //   }

 //   public String getPizzaName() {
 //       return pizzaName;
 //   }

 //   public void setPizzaName(String pizzaName) {
 //       this.pizzaName = pizzaName;
 //   } 
    
}

package br.com.multicar.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "carTB")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String model;

    @Column(length = 15)
    private String color;

    @Column(length = 15)
    private Long kilometers;

    @DateTimeFormat(pattern = "yyy")
    @Column(length = 15)
    private Date yearModel;

    @DateTimeFormat(pattern = "yyyy")
    @Column(length = 15)
    private Date yearFabrication;

    @DateTimeFormat(pattern = "yyy/MM/dd")
    @Column(length = 15)
    private Date purchaseDate;

    @Column(length = 10)
    private Double priceStore;

    @Column(length = 10)
    private Double priceFipe;

    @Column(length = 200)
    private String notes;

    public Car() {
    }

    public Car(String model, String color, Long kilometers, Date yearModel, Date yearFabrication, Double priceStore, Double priceFipe, String notes) {
        this.model = model;
        this.color = color;
        this.kilometers = kilometers;
        this.yearModel = yearModel;
        this.yearFabrication = yearFabrication;
        this.priceStore = priceStore;
        this.priceFipe = priceFipe;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getKilometers() {
        return kilometers;
    }

    public void setKilometers(Long kilometers) {
        this.kilometers = kilometers;
    }

    public Date getYearModel() {
        return yearModel;
    }

    public void setYearModel(Date yearModel) {
        this.yearModel = yearModel;
    }

    public Date getYearFabrication() {
        return yearFabrication;
    }

    public void setYearFabrication(Date yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getPriceStore() {
        return priceStore;
    }

    public void setPriceStore(Double priceStore) {
        this.priceStore = priceStore;
    }

    public Double getPriceFipe() {
        return priceFipe;
    }

    public void setPriceFipe(Double priceFipe) {
        this.priceFipe = priceFipe;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", kilometers=" + kilometers +
                ", yearModel=" + yearModel +
                ", yearFrabrication=" + yearFabrication +
                ", priceStore=" + priceStore +
                ", priceFipe=" + priceFipe +
                ", notes='" + notes + '\'' +
                '}';
    }
}

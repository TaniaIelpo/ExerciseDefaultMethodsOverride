package it.develhope.defaultmethodsoverride;
import java.util.Objects;

/**
 * This class represent a Smartphone
 *
 * @author Tania Ielpo
 */
public class Smartphone implements Cloneable {

    public String brandName;
    public String modelName;
    //battery capacity in mHa
    public int batterymAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    public Smartphone (String brand,
                       String model,
                       int battery,
                       SmartphonePrice prodP,
                       SmartphonePrice retailP) {

        this.brandName=brand;
        this.modelName=model;
        this.batterymAh=battery;
        this.producerPrice=prodP;
        this.retailPrice=retailP;

    }


    @Override

    public Smartphone clone() throws CloneNotSupportedException{

        Smartphone clonedSmartphone = (Smartphone) super.clone();
        //clone the element represented by other class
        clonedSmartphone.producerPrice=this.producerPrice.clone();
        clonedSmartphone.retailPrice=this.retailPrice.clone();

        return clonedSmartphone;

    }

    @Override
    public String toString() {
        return
                "BRAND='" + brandName + " '" +
                ", MODEL: '" + modelName + '\'' +
                ", BATTERY CAPACITY: " + batterymAh +" mAh"+
                ", PRICE : " + producerPrice +" "+ retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return this.batterymAh == that.batterymAh &&
                Objects.equals(this.brandName, that.brandName) &&
                Objects.equals(this.modelName, that.modelName) &&
                Objects.equals(this.producerPrice, that.producerPrice) &&
                Objects.equals(this.retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }
}

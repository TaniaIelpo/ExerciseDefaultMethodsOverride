package it.develhope.defaultmethodsoverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String type, double price){

        this.priceType=type;
        this.priceInEuros=price;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice spCloned= (SmartphonePrice)super.clone();
        return spCloned;
    }

    @Override
    public String toString() {
        return
                "{TYPE='" + priceType + '\'' +
                ", PRICE IN EUROS=" + priceInEuros+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(this.priceInEuros, that.priceInEuros) == 0 &&
                Objects.equals(this.priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}

package org.med;

public class Address {

    private String city;
    private String postal_code;
    private String street;
    private int number;

    public Address(String city, String postal_code, String street, int number) {
        this.city = city;
        this.postal_code = postal_code;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "org.med.Address{" +
                "city='" + city + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}

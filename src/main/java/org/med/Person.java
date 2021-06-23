package org.med;

public class Person implements PersonMBean {

    private String name;
    private String nickName;
    private Address address;
    private int age;


    public Person(String name, String nickName, Address address, int age) {
        this.name = name;
        this.nickName = nickName;
        this.address = address;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    @Override
    public String getNickName() {

        return nickName;
    }

    @Override
    public String getAddress() {

        return address.toString();
    }

    @Override
    public int getAge() {

        return age;
    }

    @Override
    public void setNickName(String newNick) {

        this.nickName = newNick;
    }

    @Override
    public String toString() {

        return "org.med.Person{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}

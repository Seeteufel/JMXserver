package org.med;

public interface PersonMBean {

    default String MBeanHelloMsg() {
        return "Hello from MBean";
    }

    String getNickName();

    String getAddress();

    int getAge();

    void setNickName(String newNick);
}

package org.med;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("org.med:type=basic,name=Adam");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            server.registerMBean(
                    new Person("Adam", "RocketMAN",
                            new Address("London", "23X-55", "Sunny st.", 234),
                            23
                    ),
                    objectName
            );
        } catch (MalformedObjectNameException | InstanceAlreadyExistsException |
                MBeanRegistrationException | NotCompliantMBeanException e) {
            e.printStackTrace();
        }

        while(true) {

        }
    }
}

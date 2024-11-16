package arrayacollections;

import java.util.*;

public class Datevalue {

    static List<String> driverData = new ArrayList<>(List.of("UT5", "GT"));

    public static void main(String[] args) {
        // Simulate sensor data set
        List<String> sensorDataList = List.of("UT5", "com");
        System.out.println(sensorDataList.get(0)); // Print the first sensor data

        // Compare driverData with sensor mappings
        compareSensorData();

        // Analyze sensor headers
        Datevalue obj = new Datevalue();
        obj.sensorHeaders();
    }

    public static void compareSensorData() {
        // Mapping Temperature with ID values
        Map<String, Integer> sensorMappings = Map.of(
            "UT5", 1,
            "TL", 10,
            "TB", 2,
            "GT", 3,
            "RF", 4,
            "TP", 12,
            "UT210", 13,
            "TR", 44,
            "RST", 70,
            "NT", 79,
            "SWHN", 120,
            "SWHR", 124
        );

        // Compare driverData with sensorMappings
        for (Map.Entry<String, Integer> entry : sensorMappings.entrySet()) {
            String sensorKey = entry.getKey();

            if (driverData.contains(sensorKey)) {
                System.out.println(sensorKey + ": ******* Values are equal *******");
            } else {
                System.out.println(sensorKey + ": Values are not equal");
            }
        }
    }

    // Getting the Sensor Header
    public void sensorHeaders() {
        // Mapping of Sensor headers with Sensor values
        Map<String, String> sensorHeaders = Map.of(
            "14L", "49.11.2.1",
            "24", "49.11.2.2",
            "32R", "49.11.2.3",
            "06", "49.11.2.4",
            "14R", "49.11.2.5",
            "32L", "49.11.2.6",
            "14L.1", "49.11.2.11",
            "32R.1", "49.11.2.13",
            "24.1", "49.11.2.14"
        );

        // Compare the Attribute value with the Key
        for (Map.Entry<String, String> entry : sensorHeaders.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "     " + value);

            // Check if the key matches a specific value (example: "driver data set")
            if ("driver data set".equals(key)) {
                System.out.println(key + " matches 'driver data set'");
            } else {
                System.out.println(key + " does not match 'driver data set'");
            }
        }
    }
}
// simplified the code 

package arrayacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Datevalue {

	static List<String> driverdata = new ArrayList<String>();
	static Iterator<String> ithas;

	public static void main(String[] args) {
		// Getting the xml data

		// Getting the Atributes and values

		/*
		 * List<String> driverdas=new ArrayList<String>(); driverdas.add("");
		 * Iterator<String> itha=driverdas.iterator(); System.out.println(itha.next());
		 */

		// Getting the sensor Data set
		List<String> driverdataone = new ArrayList<String>();
		driverdataone.add("UT5");
		driverdataone.add("com");
		Iterator<String> ithassensordata = driverdataone.iterator();
		System.out.println(ithassensordata.next());

		// Also Separate the Temperature string with text and its Finalvalue
		
		sensorData();

	}

	// Getting the Sensor Header
	public void sensorHeaders() {
		// Mapping of Sensor headers with Sensor values
		Map<String, String> count = new HashMap<String, String>();
		count.put("14L", new String("49.11.2.1"));
		count.put("24", new String("49.11.2.2"));
		count.put("32R", new String("49.11.2.3"));
		count.put("06", new String("49.11.2.4"));
		count.put("14R", new String("49.11.2.5"));
		count.put("32L", new String("49.11.2.6"));
		count.put("14L.1", new String("49.11.2.11"));
		count.put("32R.1", new String("49.11.2.13"));
		count.put("24.1", new String("49.11.2.14"));

		// Compare the Attribute value with the Key Ex:UT5
		// use for each to bring attribute value
		for (Map.Entry<String, String> entries : count.entrySet()) {
			String Keys = entries.getKey();
			String numbers = entries.getValue();
			System.out.println(Keys + "     " + numbers);

			// compare the steps with Attribute
			// if(IThas.next().equals(entries.getValue()))
			{

			}
			System.out.println(Keys + "     " + numbers);
			if (entries.getKey().equals("driver data set")) {

			}
			// If true then compare value from xml with driver value data
			else {
				System.out.println(Keys + "     " + numbers);

			}
		}
	}

	public static void sensorData() {
		// System.out.println("the required value "+count.get("32R"));
		// Mapping Temperature with ID values
		Map<String, Integer> names = new HashMap<String, Integer>();
		names.put("UT5", 1);
		names.put("TL", 10);
		names.put("TB", 2);
		names.put("GT", 3);
		names.put("RF", 4);
		names.put("UT5", 8);
		names.put("TP", 12);
		names.put("UT210", 13);
		names.put("TR", 44);
		names.put("RST", 70);
		names.put("NT", 79);
		names.put("SWHN", 120);
		names.put("SWHR", 124);

		// compare the Temperature String with Attribute names
		for (Map.Entry<String, Integer> temp : names.entrySet()) {
			String tempKey = temp.getKey();
			Integer tempValue = temp.getValue();

			driverdata.add("UT5");
			driverdata.add("GT");
			ithas = driverdata.iterator();

			System.out.println(tempKey + " : key value : " );

			String sem = ithas.next();
			if (sem.equals(tempKey)) {
				System.out.println(" *******Values are  equal*******");
			} else {
				System.out.println(" Values are not equal");
			}
		}
	}
}

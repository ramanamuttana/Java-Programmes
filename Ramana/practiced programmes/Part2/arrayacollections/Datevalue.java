package arrayacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Datevalue {
	public static void main(String[] args) 
	{   
		//Getting the xml data 
		
		//Getting the Atributes and values
		
		//Getting the Sensor Header
		 List<String> driverdas=new ArrayList<String>();
		 driverdas.add("");
			Iterator<String> ITha=driverdas.iterator();
			ITha.next();
		
		//Getting the sensor Data set
		/*List<String> driverdata=new ArrayList<String>();
		driverdata.add("UT5");
		driverdata.add("com");
		Iterator<String> IThas=driverdata.iterator();
		System.out.println(IThas.next());*/
			
		//Also Separate the Temperature string with text and its Finalvalue
		
		//Mapping of Sensor headers with Sensor values
		Map<String,String> Count= new HashMap<String,String>();
			Count.put("14L",new String("49.11.2.1"));
			Count.put("24",new  String( "49.11.2.2"));
			Count.put("32R" ,new  String("49.11.2.3"));
			Count.put("06",new String("49.11.2.4"));
			Count.put("14R",new  String("49.11.2.5"));
			Count.put("32L",new String("49.11.2.6"));
			Count.put("14L.1",new  String("49.11.2.11"));
			Count.put("32R.1",new  String("49.11.2.13"));
			Count.put("24.1",new  String("49.11.2.14"));
			
				
		//System.out.println("the required value  "+Count.get("32R"));
		//Mapping Temperature with ID values
		Map<String,Integer> Names= new HashMap<String,Integer>();
			Names.put("UT5",new Integer(1));
			Names.put("TL",new Integer(1));
			Names.put("TB",new  Integer(2));
			Names.put("GT" ,new  Integer(3));
			Names.put("RF",new Integer(4));
			//Names.put("UT5",new  Integer(8));
			Names.put("TP",new Integer(12));
			Names.put("UT210",new Integer(13));
			Names.put("TR",new  Integer(44));
			Names.put("RST",new  Integer(70));
			Names.put("NT",new  Integer(79));
			Names.put("SWHN",new Integer(120));
			Names.put("SWHR",new  Integer(124));
			
		//compare the Temperature String with Attribute names
		for(Map.Entry<String, Integer>  Temp:Names.entrySet())
		{
		   String TempKey =Temp.getKey();
		   Integer TempValue=Temp.getValue();
		   
		   List<String> driverdata=new ArrayList<String>();
			driverdata.add("UT5");
			driverdata.add("com");
			Iterator<String> IThas=driverdata.iterator();
			System.out.println(IThas.next());
			String sem=IThas.next();
		if(sem.equals(Temp.getKey()))
		{
			System.out.println("Value equal");
		}else
		{
			System.out.println(" not Value equal");
		}
		}
						
		//Compare the Attribute value with the Key Ex:UT5
		//use for each to bring attribute value
			for(Map.Entry<String, String>  entries:Count.entrySet())
			{
			String Keys =entries.getKey();
			String numbers=entries.getValue();
			System.out.println(Keys+"     "+numbers);
				
			//compare the steps with Attribute
			//if(IThas.next().equals(entries.getValue()))
			  {
						
			  }	
				System.out.println(Keys+"     "+numbers);
				if(entries.getKey().equals("driver data set"))
				{
					
				}
				//If true then compare value from xml with driver value data
				else
			{
			System.out.println(Keys+"     "+numbers);
	
			}}
			}
			}

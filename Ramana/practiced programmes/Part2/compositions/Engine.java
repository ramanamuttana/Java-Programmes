package compositions;

public class Engine {
	
	private String EngineName;
	private String EnginePower;
	private String EngineType;
	
	public Engine(String nameofengine,String nameofpowerengine,String typeofengine)
	{
		EngineName=nameofengine;
		EnginePower=nameofpowerengine;
		EngineType=typeofengine;
	}
	public String toString()
	{
		return String.format("%s %s %s", EngineName,EnginePower,EngineType);
	}
}

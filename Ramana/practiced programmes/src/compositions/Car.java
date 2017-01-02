package compositions;

public class Car {
	
	private int nofoTyres;
	private String carName;
	private Engine engine;
	
	public  Car(int tyres,String nameofthecar,Engine enginevalue )
	{
		 this.nofoTyres=tyres;
		 this.carName=nameofthecar;
		 this.engine=enginevalue;
	}
	public String toString()
	{
		return String.format("%d %s %s",nofoTyres, carName, engine);
	}

	public static void main(String[] args)
	{
		//we are creating object for Engine class
		Engine eng=new Engine("audiiis3","medium","fast");
           Car c = new Car(4,"Audii",eng);
            System.out.println(c);
	}

}

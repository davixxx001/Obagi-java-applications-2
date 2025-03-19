public class DataType{
	public static void main(String[] args){
		//Integer type(byte,short,int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 32000;
		System.out.printf("I bought %d bags for my business",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The Total world Poulation is %d%n",populationInNigeria);
		
		Long worldPopulation = 8000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		//float-point type(float,double)
		float myBalance = 12345.858575f;
		System.out.printf("Your account balance is %f%n",myBalance);
		
		double cbnReserve = 5575857.7373673636363;
		System.out.printf("The CBN balance is %.5f%n",cbnReserve);
		
		//Boolean type (boolean)
		boolean isJAVAFun = true;
		System.out.printf("Is Java a Fun Language ? %b",isJAVAFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is davixgmm7@cgmail.com",alpha);
	}
}
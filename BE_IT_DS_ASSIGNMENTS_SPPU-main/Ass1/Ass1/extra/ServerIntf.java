import java.rmi.*;



public interface ServerIntf extends Remote { 

	double power(double base, double exponent) throws RemoteException;
	double fahrenheitToCelsius(double fahrenheit) throws RemoteException;
	double simpleInterest(double principal, double rate, double time) throws RemoteException;
	int countVowels(String input) throws RemoteException;
	long factorial(int num) throws RemoteException;
	/*boolean compareStrings(String str1, String str2) throws RemoteException;*/
	String echo(String message) throws RemoteException;
	double milesToKm(double miles) throws RemoteException;

}

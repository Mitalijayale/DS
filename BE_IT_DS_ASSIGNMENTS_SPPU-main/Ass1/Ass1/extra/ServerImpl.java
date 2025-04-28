import java.rmi.*;
import java.rmi.server.*;


public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
    public ServerImpl() throws RemoteException {
        super();
    }

    public double power(double base, double exponent) throws RemoteException {
        return Math.pow(base, exponent);
    }

    public double fahrenheitToCelsius(double fahrenheit) throws RemoteException {
        return (fahrenheit - 32) * 5/9;
    }

    public double simpleInterest(double principal, double rate, double time) throws RemoteException {
        return (principal * rate * time) / 100;
    }

    public int countVowels(String input) throws RemoteException {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public long factorial(int num) throws RemoteException {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    /*public boolean compareStrings(String str1, String str2) throws RemoteException {
        return str1.equals(str2);
    }*/

    public String echo(String message) throws RemoteException {
        return message;
    }

    public double milesToKm(double miles) throws RemoteException {
        return miles * 1.60934;
    }
}


// 2082-03-1

import java.rmi.RemoteException; 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject; 
public class Server extends UnicastRemoteObject implements Adder 
{ 
Server()throws RemoteException 
{ 
super(); 
} 
public int add(int x,int y) 
{ 

 
     return x+y; 
 } 
 public static void main(String args[]) throws RemoteException 
 { 
     Registry reg=LocateRegistry.createRegistry(5000);
     reg.rebind("Hi Server",new Server());
     System.out.println("Server is ready ..."); 
 } 
}
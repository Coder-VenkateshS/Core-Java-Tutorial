package multithreading;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import treeset.Employee;

public class ThreadClassExample extends Thread{
	public static void main(String[] args) {
		  
	       
	     ThreadClassExample t1=new ThreadClassExample();
	   
	       t1.start();
	    
	       
	}
	       public void run() {
	    	   int n,i;
		       String name;
		       int age;
		      
		       Scanner sc=new Scanner(System.in);
		       n=sc.nextInt();
	    	   HashSet<Employee> hashset = new HashSet<Employee>();
		       Employee[] emp=new Employee[n];
		       for(i=0;i<n;i++)
		       {
		    	   name=sc.next();
		    	   age=sc.nextInt();
		    	   emp[i]=new Employee();
		    	   emp[i].setAge(age);
		    	   emp[i].setName(name);
		    	   hashset.add(emp[i]);
		       }

				for(Employee e:hashset)
	    	 	   System.out.println(e.getName()+e.getAge());
				sc.close();
	    	}

}

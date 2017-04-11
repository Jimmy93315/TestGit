import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
       for(int i = 100; i < 1000; i++)
       {
    	   int baiwei = i/100;
    	   int shiwei = (i%100)/10;
    	   int gewei = (i%100)%10;
    	   if(i == baiwei*baiwei*baiwei+shiwei*shiwei*shiwei+gewei*gewei*gewei)
    	   {
    		   arr.add(i);
    	   }
       }
       int count = 0;
       if(arr.size() != 0)
    	   {
    		   for(int i = 0 ; i< arr.size(); i++)
    		   {
    			   count = count+arr.get(i);
    			   System.out.println("第"+(i+1)+"个水仙花数: "+arr.get(i).toString());
    		   }
    		   System.out.println("水仙花数总和为: "+count);
    	   }
	
	}

}

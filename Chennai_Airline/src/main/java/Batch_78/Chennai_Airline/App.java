package Batch_78.Chennai_Airline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
    	
    	 Cn_Flight obj = (Cn_Flight)context.getBean("welcome");
         
     
         System.out.println(obj.getMessage());
    	
    }
}

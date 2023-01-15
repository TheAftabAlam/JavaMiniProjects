

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Geektrust {
	static Integer TOTAL_COLLECTION=0;
	static Integer TOTAL_AMOUNT_OF_TOLL_COLLECTED=0;
	static Integer TOTAL_DISCOUNT_GIVEN=0;
	 static Map<String, String> vehicalWithBalance=new LinkedHashMap<>();
	 static Map<String, String> collectTollByVehical=new LinkedHashMap<>();
	public static Integer toll_calculator()
	{


		for(String vehicalNumber:collectTollByVehical.keySet())
		{
			for(String vehical:vehicalWithBalance.keySet())
			{
				if(vehicalNumber.equals(vehical))
				{
					if(collectTollByVehical.get(vehical).equals("MOTORBIKE"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-50;
					}
					if(collectTollByVehical.get(vehical).equals("SCOOTER"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-50;
					}
					if(collectTollByVehical.get(vehical).equals("RICKSHAW"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-100;
					}
					if(collectTollByVehical.get(vehical).equals("CAR"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-100;
					}
					if(collectTollByVehical.get(vehical).equals("VAN"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-100;
					}
					if(collectTollByVehical.get(vehical).equals("BUS"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-200;
					}
					if(collectTollByVehical.get(vehical).equals("TRUCK"))
					{
						TOTAL_COLLECTION=Integer.parseInt(vehicalWithBalance.get(vehicalNumber))-200;
					}
					
					
					
					
				}
			}
			
		}
		
		
		
		
		return TOTAL_COLLECTION;
		//System.out.println(TOTAL_COLLECTION);
	}
	
	
	
    public static void main(String[] args)  {
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream("freshers-drive-java-starter-kit-toll-collector\\sample_input\\input1.txt");
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
           
           
            while (sc.hasNextLine()) {
               String inputCommand = sc.nextLine();
               String inputArray[]=inputCommand.split(" ");
               
               if(inputArray[0].equals("FASTAG"))
               {
            	  vehicalWithBalance.put(inputArray[1], inputArray[2]);
			   }
               if(inputArray[0].equals("COLLECT_TOLL"))
               {
            	   collectTollByVehical.put(inputArray[2], inputArray[1]);
               }
               if(inputArray[0].equals("PRINT_COLLECTION"))
               {
            	   //Add your code here to process input commands.
                   //process the input command and get the output
            	   Integer output =  toll_calculator();
            	 System.out.println("TOTAL_COLLECTION "+output); 
               }
               
               //Once it is processed print the output using the command System.out.println()
               
             
            }
            //System.out.println(collectTollByVehical);
            sc.close(); // closes the scanner
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
	}
}


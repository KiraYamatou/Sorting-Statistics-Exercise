package as6;

import javax.swing.JOptionPane;

public class TestStatistics {
	  public static void main (String [] args)

	  {

	         

	                          String in, out;

	   

	                          //input item count

	                          in=JOptionPane.showInputDialog ("Enter item count");

	                          int itemCount=Integer.parseInt(in);

	   

	                          //create an array data of length itemCount

	                          double[] data= new double[itemCount];

	                         

	                          //input data and fill the array with data         

	                          for(int i=0; i<itemCount; i++)

	  {

	                                      in = JOptionPane.showInputDialog("Enter data value");

	                                      data[i]=Double.parseDouble(in);                   

	                          }

	   

	                          //create an object of class Statistics and pass it the array data

	                          Statistics stat=new Statistics(data);

	   

	                          //find min, max, mean. median by calling stat object's methods

	                          double min = stat.findMin();

	                          double max = stat.findMax();

	                          double mean = stat.findMean();
	                          
	                          double med = stat.findMedian();
	   

	   

	   

	                          //get original and sorted data be call stat object's appropriate methods

	   

	                          double[] origData = stat.getOrigData();
	                          double[] sData = stat.getSortedData();

	             

	   

	   

	                          //build output by accumulating output in variable out

	                          out = "";

	   

	                          out = out + "Original Data: \n";

	                          for (int i=0; i<origData.length; i++){

	                                       out = out + origData [i] + " ";

	                          }

	                          out = out + "\n";

	                           

	   

	                          out = out + "Sorted Data: \n";

	                           for(int i = 0; i < sData.length; i++) {
	                        	   out = out + sData[i] + " ";
	                           }
	                           out = out + "\n";

	                         

	                         

	                         

	   

	                          out = out + "Min: " + min + "\n";

	                          out = out + "Max: " + max + "\n";

	                          out = out + "Mean: " + mean + "\n";
	                          
	                          out = out + "Median: " + med + "\n";

	                         

	   

	  //display output
	                       

	                          JOptionPane.showMessageDialog ( null, out);

	              }
}

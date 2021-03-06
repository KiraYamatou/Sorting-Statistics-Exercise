package as6;

import java.util.Arrays;


public class Statistics {
	//instance variables

	private double [] data; 

	private double [] sdata;

	 

	//constructor Statistics

	public Statistics (double [ ] d )

	{

	            //create the array data, sdata

	            //data=d.clone();
				data = new double [d.length];
	            //sdata = d.clone();
				sdata = new double [d.length];

	            //sort the array sdata
				System.arraycopy(d, 0, data, 0, d.length);
				System.arraycopy(d, 0, sdata, 0, d.length);

	            Arrays.sort (sdata ); //To access Arrays, import java.util.Arrays: 

	}

	 

	//instance methods

	public double findMin ( )

	{

	            double min=sdata[0];

	            return min;

	}

	 

	public double findMax ( )

	{

	            double max=sdata[sdata.length-1];

	            return max;

	}

	 

	public double findMean ( )

	{

	            double sum, mean;

	            sum=0;

	            for (int i=0; i<sdata.length; i++)

	{

	                        sum=sum+sdata [i];

	}

	mean=sum/sdata.length;

	return mean;

	}

	 

	//put below the code of method findMedian given in a later section below

	public double findMedian ( )

	{
				int index, indexHi, indexLo;
	            double median=0;
	            
	            //write code for finding median
	            if((sdata.length %2)!=0) {
	            	index = sdata.length/2;
	            	median = sdata[index];
	            }
	            else {
	            	indexHi = sdata.length/2;
	            	indexLo = indexHi -1;
	            	median = (sdata[indexLo]+sdata[indexHi])/2;
	            }
	           

	            return median;

	} 

	 

	//method returns a copy of the array data containing the original data.

	public double [ ] getOrigData ( )

	{

	            //create a new array d

	            double [ ] d = data.clone();       

	            return d;

	}

	 

	//method returns a copy of the instance variable array sdata containing the sorted data.

	//write this method much like getOrigData above

	public double [ ] getSortedData ( )

	{

	            //create a new array d

	            double [ ] d = new double [sdata.length];
	            
	            System.arraycopy(sdata, 0, d, 0, sdata.length);

	            return d;

	}
}

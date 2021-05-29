
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import java.awt.image.Raster;

import javax.imageio.ImageIO; 


public class RunLengthCode {

	private static String ComputeCode(int[][] imgArr){
		String RLC = "";
		boolean flag= false;
		boolean samerow = false;
		for(int i=0;i<imgArr.length;i++)
		{
			for(int j=0;j<imgArr[0].length;j++)
			{
				
				if(imgArr[i][j]== 1 && !flag && !samerow)
				{
					RLC=RLC.concat("(" + i +" " + j+ " ");
					flag = true;
					samerow=true;
				}
				if(imgArr[i][j]== 0 && flag)
				{
					RLC=RLC.concat(j-1+"");
					flag=false;
				}
				if(imgArr[i][j]== 1 && samerow && !flag)
				{
					RLC=RLC.concat(" " + j+ " ");
					flag = true;
				}
			}
			if(flag)
			{
				RLC=RLC.concat(imgArr[0].length-1 + ")");
				flag=false;
			}
			else
			{
				if(!flag && samerow)
				{
				RLC=RLC.concat(")");
				}
			}
			samerow=false;
			
		}
		// write your logic here 
		return RLC;
	}
	
	public static void main(String [] args) {
		//write image path 
		String path = "binary_triangle.jpg";
		
		BufferedImage image = null;
		
		try {
			
			File input_image = new File(path);
			// Reading input image 
		    image = ImageIO.read(input_image);
		    System.out.println("Reading complete."); 
		} 
		
		catch (IOException e) {
		}
		
		// convert image to 2D array 
		int width = image.getWidth();
	    int height = image.getHeight();
	    int[][] imgArr = new int[height][width];
	    Raster raster = image.getData();
	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < width; j++) {
	            imgArr[i][j] = raster.getSample(j, i, 0);
	     
	    }
	   }

	    
		// print run length Code 
		try {
		      FileWriter myWriter = new FileWriter("Triangle_RLE.txt");
		      myWriter.write(ComputeCode(imgArr));
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		

	}//main ends here
	
}// class ends here 



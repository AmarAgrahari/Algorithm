package com.info;


import java.util.Scanner;



class Picture
{
   private char[][]a;
   private int i;
   private int rmax;
   private int cmax;
   private char background;
   

  
   public Picture(char a[][],int rmax, int cmax, char background)
   {
      this.rmax = rmax;
      this.cmax = cmax;
      this.background = background;
      this.a = a;
      for(int row = 0; row < rmax; row++)
      {
         for(int col = 0; col < cmax; col++)
         {
            this.a[row][col] = background;
         }
      } 
   }

   public Picture(char[][] a)
   {
     
      this.a = a;
      for(int row = 0; row < rmax; row++)
      {
         for(int col = 0; col < cmax; col++)
         {
            this.a[row][col] = background;
         }
      }
   }
   public void print(int h,int w)
   {
      for (int row = 0; row < h; row++)
      {
         for (int col = 0; col < w; col++)
         {
            System.out.print(a[row][col] + " ");
         }
         System.out.println();
      }
   }
//--------------------------------------------------------------------------
   public Picture rectangle(int x1, int y1, int x3, int y3, char color) 
   {
	  int x2 = (x1 + x3 + y3 - y1) / 2;
	  int y2 = (y1 + y3 + x1 - x3) / 2;
	  int x4 = (x1 + x3 + y1 - y3) / 2;
	   int y4 = (y1 + y3 + x3 - x1) / 2;
	   int x_middle=(x1+x3)/2;
	   int y_middle=(y1+y3)/2;
	   this.a[x_middle][y_middle]=color;
	   this.a[x2][y2]=color;
	   this.a[x4][y4]=color;
	   this.a[x1][y1]=color;
	   this.a[x3][y3]=color;
	   int length_a=(x1-x_middle)*(x1-x_middle);
	   int length_b=(y1-y_middle)*(y1-y_middle);
	   double diagonal=Math.sqrt(length_a+length_b);
	   double b=Math.sqrt(((diagonal)*(diagonal))-((diagonal/2)*(diagonal/2)));
       for(int i=0;i<16;i++)
       {
    	   for(int j=0;j<20;j++)
    	   {
    		   int square_down=(i-x_middle)*(i-x_middle);
    		   int square_hori=(j-y_middle)*(j-y_middle);
    		   double sum=square_down+square_hori;
    		   double m=Math.sqrt(sum);
    		   if(m<=b)
    		   {
    			   this.a[i][j]=color;
    		   }
    	   }
       }
	   return new Picture(a);
     }
      
   

   public Picture circle (double cc, double rc, double radius, char color)
   {
      /*char[][] circle = new char[a.length][a.length];*/

      for(int row = 0; row < a.length; row++)
      {
         for(int col = 0; col < a[i].length; col++)
         {
            double d = Math.sqrt((rc-row)*(rc-row)+(cc-col)*(cc-col));
            if(d <= radius)
            {
               this.a[row][col] = color;
            }
         }
      }
      return new Picture(a);
   }

} 

public class Hw08 
{
	
//--------------------------------------------------------------------------
   public static void main ( String[] args ) throws Exception
   {
	   char ch[][]=new char[100][100];
	   @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
       int w = in.nextInt();
       int h = in.nextInt();
       int circleX = in.nextInt();
       int circleY = in.nextInt();
       int r = in.nextInt();
       int x1 = in.nextInt();
       int y1 = in.nextInt();
       int x3 = in.nextInt();
       int y3 = in.nextInt();	
      Picture p = new Picture(ch,h,w,'.');
   
 p.rectangle(y1,x1,y3,x3,'#');
     
    p.circle(circleX,circleY,r,'#');
      p.print(h,w);
     
   }

}
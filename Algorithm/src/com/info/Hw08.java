package com.info;
// Written by Steve Nham
//
// description of this program
//
import java.awt.Graphics;
import java.io.*;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;
////////////////////////////////////////////////////////////////////////////
class Picture
{
   private char[][]a;
   private int i;
   private int rmax;
   private int cmax;
   private char background;
   private double rc;
   private double cc;
   private double radius;
   private char color;
//--------------------------------------------------------------------------
  
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
//--------------------------------------------------------------------------
   public Picture(char[][] a)
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
//--------------------------------------------------------------------------
   public Picture(double rc, double cc, double radius, char color)
   {
      this.rc = rc;
      this.cc = cc;
      this.radius = radius;
      this.color = color;
      for(int row = 0; row < rmax; row++)
      {
         for(int col = 0; col < cmax; col++)
         {
            this.a[row][col] = color;
         }
      }
   }
//--------------------------------------------------------------------------
   public void print()
   {
      for (int row = 0; row < a.length; row++)
      {
         for (int col = 0; col < a[i].length; col++)
         {
            System.out.print(a[row][col] + " ");
         }
         System.out.println();
      }
   }
//--------------------------------------------------------------------------
   public Picture rectangle(int rlo, int clo, int rhi, int chi, char color) 
   {
     /*char[][] result = new char[a.length][a.length];*/

      for(int row = 0; row < a.length; row++)
      {
         for(int col = 0; col < a.length; col++)
         {
            if(row >= rlo && row <= rhi)
            {
               this.a[row][col] = color;
            }
            if(col >= clo && row <= chi)
            {
               this.a[row][col] = color;
            }
         }
      }
      return new Picture(a);  
   }  
//--------------------------------------------------------------------------
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
//--------------------------------------------------------------------------
} // end class Picture
////////////////////////////////////////////////////////////////////////////
public class Hw08 
{
	
//--------------------------------------------------------------------------
   public static void main ( String[] args ) throws Exception
   {
	   char ch[][]=new char[16][20];
	
      Picture p = new Picture(ch,16,20,'.');
   
 /* p.rectangle(16,14,8,14,'#');*/
     
      p.circle(9,6,5,'#');
      p.print();
     
   }
//--------------------------------------------------------------------------
} // end class Hw08
////////////////////////////////////////////////////////////////////////////


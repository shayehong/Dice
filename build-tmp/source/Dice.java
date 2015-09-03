import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die first;
public void setup()
{
	noLoop();
	first = new Die(50,50);
}
public void draw()
{
	//your code here
	first.roll();
	first.show();
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int myX;
	int myY;
	int drandom;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;
		//variable initializations here
	}
	public void roll()
	{
	 drandom = (int)(Math.random()*7)+1;
		/*
		if(drandom == 1){
			num = 1;
		}
		else if(drandom == 2){
			num = 2;
		}
		else if(drandom == 3){
			num = 3;
		}
		else if(drandom == 4){
			num = 4;
		}
		else if(drandom == 5){
			num = 5;
		}
		else{
			num = 6;
		}
		*/

		//your code here
	}
	public void show()
	{
		//your code here
		fill(255);
		 rect(myX, myY,50,50);
		fill(0);
		 if( drandom == 1){
		 	text("one", myX+5,myY-5);
		 }
		 else if (drandom == 2){
		 	text("two", myX+5,myY-5);
		 }
		 else if (drandom == 3){
		 	text("three", myX+5,myY-5);
		 }
		 else if (drandom == 4){
		 	text("four", myX+5,myY-5);
		 }
		 else if (drandom == 5){
		 	text("five", myX+5,myY-5);
		 }
		 else{
		 	text("six", myX+5,myY-5 );
		 }

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

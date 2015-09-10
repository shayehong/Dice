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

//Die first;
//Die second;
public void setup()
{
	size(400,400);
	noLoop();
	//first = new Die(50,50);
	//second = new Die(110,50);
}
public void draw()
{
	//your code here
	for (int y = 10; y<385; y+= 55){
		for(int x = 10; x<385; x+=55){
			Die dice = new Die(x,y); 
			dice.roll();
			dice.show();
		}
	}
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
		//roll();
		//variable initializations here
	}
	public void roll()
	{
		//your code here
		drandom = (int)(Math.random()*6)+1;
	}
	public void show()
	{
		//your code here
		int adjust1 = myX+15;
		int adjust = myY+25;
		fill(255);
		rect(myX, myY,50,50,7);
		
		 if(drandom == 1){
		 	//text("one", adjust1, adjust);
		 	fill(0);
		 	ellipse(adjust1+10, adjust, 5, 5);
		 }
		 else if (drandom == 2){
		 	//text("two", adjust1,adjust);
		 	fill(0);
		 	ellipse(adjust1+3, adjust, 5, 5);
		 	ellipse(adjust1+17, adjust, 5, 5);
		 }
		 else if (drandom == 3){
		 	fill(0);
		 	//text("three", adjust1,adjust);
		 	ellipse(adjust1, adjust-7, 5, 5);
		 	ellipse(adjust1+10, adjust, 5, 5);
		 	ellipse(adjust1+17, adjust+7, 5, 5);
		 }
		 else if (drandom == 4){
		 	//text("four", adjust1,adjust);
		 	fill(0);
		 	ellipse(adjust1, adjust-7, 5, 5);
		 	ellipse(adjust1+17, adjust-7, 5, 5);
		 	ellipse(adjust1, adjust+7, 5, 5);
		 	ellipse(adjust1+17, adjust+7, 5, 5);
		 }
		 
		 else if (drandom == 5){
		 //text("five",adjust1,adjust);
		 	fill(0);
		 	ellipse(adjust1, adjust-7, 5, 5);
		 	ellipse(adjust1+17, adjust-7, 5, 5);
		 	ellipse(adjust1, adjust+7, 5, 5);
		 	ellipse(adjust1+17, adjust+7, 5, 5);
		 	ellipse(adjust1+10, adjust, 5, 5);
		 }
		 else{
		 	//text("six",adjust1,adjust);
		 	fill(0);
		 	ellipse(adjust1, adjust, 5, 5);
		 	ellipse(adjust1+17, adjust, 5, 5);
		 	ellipse(adjust1, adjust-7, 5, 5);
		 	ellipse(adjust1+17, adjust-7, 5, 5);
		 	ellipse(adjust1, adjust+7, 5, 5);
		 	ellipse(adjust1+17, adjust+7, 5, 5);
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

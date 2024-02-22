import processing.core.PApplet;
  /**
  * A program that draws a human face that can adapt to any window size
  * @author: A. Razack
  */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
  
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Draw head
    fill(255, 204, 153); // Set fill color to light orange
    ellipse((float) (width/2), (float) (height/2), (float) (width/2), (float) (height/2)); // Draw ellipse for head
  
    // Draw eyes
    fill(255); // Set fill color to white
    ellipse((float) (width/2.35294117647), (float) (height/2.35294117647), (float) (width/10), (float) (height/10)); // Draw left eye
    ellipse((float) (width/1.73913043478), (float) (height/2.35294117647), (float) (width/10), (float) (height/10)); // Draw right eye
  
    // Draw pupils
    fill(0); // Set fill color to black
    ellipse((float) (width/2.35294117647), (float) (height/2.35294117647), (float) (width/20), (float) (height/20)); // Draw left pupil
    ellipse((float) (width/1.73913043478), (float) (height/2.35294117647), (float) (width/20), (float) (height/20)); // Draw right pupil
  
    // Draw nose
    fill(255, 102, 102); // Set fill color to pink
    triangle((float) (width/2), (float) (height/2.10526315789), (float) (width/2.10526315789), (float) (height/1.81818181818), (float) (width/1.90476190476), (float) (height/1.81818181818)); // Draw nose
  
    // Draw mouth
    arc((float) (width/2), (float) (height/1.66666666667), (float) (width/4), (float) (height/5), 0, PI); // Draw mouth arc
  }
}
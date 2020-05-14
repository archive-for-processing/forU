package forU.Ttf;

import processing.core.PGraphics;

public class ShapeDrawer implements ShapeCreator {    
  
    PGraphics g;
    public ShapeDrawer(PGraphics g){
      this.g=g;
    }
    
    public void createShape() {    
    };
    
    public  void beginShape() { 
      // logprintln("shapebegin");
      g.beginShape() ;
      g.normal(0,0,1); // or weird things happen with lights()
    };
    public void vertex(float x, float y) {    
      g.vertex(x, y);
    };
    public void endShape(int mode) {
      g.endShape(mode);
    };
    public void quadraticVertex(float cx, float cy,  float x, float y) {
      g.quadraticVertex(cx, cy, x, y);
    };
    public void curveVertex(
      float x, float y) {
      g.curveVertex(x, y);
    };
    public void beginContour() {
      g.beginContour();
    };
    public void endContour() {
      g.endContour();
    };
  }

import processing.core.PApplet;

public class Game extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Game", args);
    }

    public Game() {

    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {

    }

    public void draw() {
        fill(214,24,75);
        ellipse(width/2,height/2,24,16);
    }

}

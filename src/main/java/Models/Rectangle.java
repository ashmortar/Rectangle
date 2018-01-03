package Models;

public class Rectangle {

    private int height;
    public int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSquare() {
        return height == width;
    }
}

package OopClass;

public class Shape {
    int width = 0;
    int height = 0;

    public Shape(int width_, int height_) {
        this.height = height_;
        this.width = width_;
    }

    public int calculatePerimeter(){
        return (this.width + this.height)*2;
    }
    
}

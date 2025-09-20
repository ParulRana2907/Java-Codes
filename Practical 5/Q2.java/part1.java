//q2...part 1
// Box.java
class Box {
    float width, height, depth;

    Box() {
        this.width = this.height = this.depth = 0;
    }

    Box(float w, float h, float d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    public float getWidth() { return width; }
    public void setWidth(float w) { this.width = w; }
    public float getHeight() { return height; }
    public void setHeight(float h) { this.height = h; }
    public float getDepth() { return depth; }
    public void setDepth(float d) { this.depth = d; }

    void volume() {
        System.out.println("Volume is " + width * height * depth);
    }
}

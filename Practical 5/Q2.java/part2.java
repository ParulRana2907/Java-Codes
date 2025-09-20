//que2....part 2
// BoxWeight.java
class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        this.weight = 0;
    }

    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        this.weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public float getWeight() { return weight; }
    public void setWeight(float m) { this.weight = m; }

    void displayWeight() {
        System.out.println("Weight is " + weight);
    }
}

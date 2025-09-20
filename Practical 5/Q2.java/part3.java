//que2....part 3
// BoxWeightDemo.java
public class BoxWeightDemo {
    public static void main(String args[]) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3f);
        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(box1);
        System.out.println("Parul Rana")

        System.out.println("Box 1:");
        box1.volume();
        box1.displayWeight();
        
        System.out.println("\nBox 2:");
        box2.setWeight(20);
        box2.displayWeight();
        box2.setWidth(5);
        box2.setHeight(5);
        box2.setDepth(5);
        box2.volume();

        System.out.println("\nBox 3 (Clone of Box 1):");
        box3.volume();
        box3.displayWeight();
    }
}

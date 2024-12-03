
public class GetSetoops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setcolor("blue");// color set krne ke liye property
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
        p1.setTip(10);
        System.out.println(p1.getTip());

    }
}

class Pen {
    String color;
    int Tip;

    String getcolor() {
        return this.color;// object ne jisko call kiya h uska colour
    }

    int getTip() {

        return this.Tip;
    }

    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void setTip(int newtip) { // isme this.tip ka use krke jo tip class m jo h usko drshata h
        this.Tip = newtip; // isme this.tip ka use krke jo tip class m jo h usko drshata h

    }
}
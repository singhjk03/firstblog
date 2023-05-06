public class Publication {
    String title;
    float price;

    Publication(String title, float price) {
        setData(title,price);
    }

    void display() {
        System.out.printf("Title is: %s\nThe price is %f.\n",this.title,this.price);
    }

    void setData(String title,float price){
        this.title = title;
        this.price = price;
    }
}

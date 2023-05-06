public class Book extends Publication {
    int pageCount;

    Book(String title, float price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    void setData(String title,float price, int pageCount){
        super.setData(title, price);
        this.pageCount = pageCount;
    }

    @Override
    void display() {
        super.display();
        System.out.println("pageCount: "+pageCount);
    }
}

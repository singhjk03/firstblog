public class videoLecture extends Publication {
    int duration;

    videoLecture(String title, float price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    void setData(String title,float price, int duration){
        super.setData(title, price);
        this.duration = duration;
    }

    @Override
    void display() {
        super.display();
        System.out.println("duration: "+duration);
    }
}

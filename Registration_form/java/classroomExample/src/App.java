public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Publication[] arr = new Publication[3];
        arr[0] = new Book("Harry Potter", 599, 250);
        arr[1] = new videoLecture("CodeWithHarry", 0, 120);

        arr[0].display();
        arr[0].setData("Harry Potter 2", 1000);
        arr[1].display();
    }
}

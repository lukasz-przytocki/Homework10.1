public class MainTest {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Toyota", 50, 8, false);
        cars[1] = new Truck("Man",100,12,false,100);
        cars[2] = new Car("Honda", 50, 8,true);
        cars[3] = new Truck("Star", 100,12, true, 100);

        for (int i = 0; i <cars.length ; i++) {
            System.out.printf("Distance %.1f km\n",cars[i].range());
        }
    }
}

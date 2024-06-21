public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        EletricCar eletricCar = new EletricCar();

        gasCar.fillup();
        gasCar.move();
        gasCar.openDoor();


        eletricCar.openDoor();
    }
}

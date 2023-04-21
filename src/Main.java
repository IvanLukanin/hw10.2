public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Car("vaz", 4),
                new Car("ford", 4),
                new Car("lamborgini", 4),
                new Track("mercedes", 8),
                new Track("mazda", 6),
                new Bicycle("forwardChild", 3),
                new Bicycle("sport", 2)
        };
        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}
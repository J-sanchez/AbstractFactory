public class PortableComputer extends AbstractFactory {
    @Override
    Computer getComputer(String computerType) {
        if (computerType.equals("Laptop")) {
            return new Laptop();
        } else if (computerType.equals("Phone")) {
            return new Phone();
        }

        return null;
    }
}
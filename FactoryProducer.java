//Check if this is a portable device
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable) {
        if (portable) {
            return new PortableComputer();
        }
        else {
            return new ComputerFactory();
        }
    }
}
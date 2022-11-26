public class App {
    public static void main(String[] args) {
        AbstractFactory computerFactory = FactoryProducer.getFactory(true);
        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();
        
        Computer computer2 = computerFactory.getComputer("Phone");

        computer2.compute();
    }
}
//6510405822 Sarawut Inpol

class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

    }

}
//6510405822 Sarawut Inpol

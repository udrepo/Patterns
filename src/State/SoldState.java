package State;

public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, we are giving gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice does not get you another gumball!");
    }

    @Override
    public void dispense() {
gumballMachine.releaseBall();
if(gumballMachine.getCount()>0) {
    gumballMachine.setState(gumballMachine.noQuarterState);
}else{
    System.out.println("oops no more gumballs");
    gumballMachine.setState(gumballMachine.getSoldOutState());
}
    }
}

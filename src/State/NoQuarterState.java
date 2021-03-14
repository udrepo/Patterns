package State;

import java.util.Random;

public class NoQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned");
        int winner  = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount()>1))
            gumballMachine.setState(gumballMachine.getWinnerState());
        else gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
    public String toString() {
        return "waiting for quarter";
    }
}

package State;

public class GumballMachine {
    State hasNoQuarter;
    State noQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasNoQuarter = new HasNoQuarter(this);
        soldState = new SoldOutState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0)
            state = noQuarterState;
        else state = soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("a gumball comes rolling out");
        if(count!=0)
            count-=1;
    }

    public State getHasNoQuarter() {
        return hasNoQuarter;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

    public int getCount() {
        return count;
    }
}

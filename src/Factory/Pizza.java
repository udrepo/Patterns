package Factory;

public abstract class Pizza {

    boolean prepare(){
        return true;
    }
    boolean bake(){
        return true;
    }
    boolean cut(){
        return true;
    }
    boolean box(){
        return true;
    }
}

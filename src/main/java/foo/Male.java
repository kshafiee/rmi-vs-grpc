package foo;

/**
 * Created by k00759368 on 2/12/2018.
 */

public class Male implements Human{
    private String name;
    private int age;

    @Override
    public void goPee(){
        System.out.println("Stand Up");
    }
}

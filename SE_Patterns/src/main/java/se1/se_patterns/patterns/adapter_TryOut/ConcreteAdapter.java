package se1.se_patterns.patterns.adapter_TryOut;

public class ConcreteAdapter implements Adapter {

    private final Adaptee adaptee = new Adaptee();

    @Override
    public void operation(Integer test){
        String str = (Character.toString(test));
        adaptee.adaptedoperation(str);
    }
}


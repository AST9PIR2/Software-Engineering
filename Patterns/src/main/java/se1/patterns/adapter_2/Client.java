package se1.patterns.adapter_2;

public class Client {

        public static void main(String[] args) {
            var adapter = new ConcreteAdapter();
            adapter.operation(68);
        }

}

package se1.se_patterns.patterns.adapter_TryOut;

public class Client {

        public static void main(String[] args) {
            var adapter = new ConcreteAdapter();
            adapter.operation(68);
        }

}

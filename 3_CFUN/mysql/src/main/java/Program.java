class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m1.start();
        Machine m2 = new Machine();
        m2.start();
        m1.start();
    }
}


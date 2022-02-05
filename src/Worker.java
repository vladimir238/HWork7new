abstract class Worker {
    private int id;
    private String name;

    Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract double getAveragePayment();

    @Override
    public String toString() {
        return id + " " + name;
    }

}

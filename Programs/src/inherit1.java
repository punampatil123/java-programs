public class inherit1 {
    void print() {
        System.out.println("i am in class inherit");
    }
}

class B extends inherit1 {
    void print() {
        System.out.println("i am class b");
    }

    public void main(String[] args) {
        inherit1 i = new inherit1();
        i.print();
    }
}


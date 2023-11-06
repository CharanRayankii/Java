class Test {

 

    void print() {

 

      System.out.println("test");

 

    }

 

}

 

 

 

class Main extends Test {

 

    void print() {

 

        super.print();

 

        System.out.println("main");

 

    }

 

 

 

    public static void main(String[] args) {

 

        Main obj = new Main();

 

        obj.print();

 

    }

 

}
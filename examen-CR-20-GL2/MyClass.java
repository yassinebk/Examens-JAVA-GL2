import javax.sound.sampled.SourceDataLine;

class MyClass {
    MyClass(int x) {
        System.out.println("MyClass : 1-arg const");
    }

    MyClass() {
        System.out.println("MyClass : no-arg const");
    }

    static {
        System.out.println("MyClass: 1st static from MyClass");
    }
    {
        System.out.println("MyClass: 1st initialisation from MyClass");
    }
    {
        System.out.println("MyClass: 2nd initialisation from MyClass");
    }
    static {
        System.out.println("MyClass: 2nd static from MyClass");
    }
}
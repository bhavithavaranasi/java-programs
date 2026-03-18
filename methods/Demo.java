class Demo {

    // Method without parameters but returns value
    int getNumber() {
        return 10;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        int result = obj.getNumber();
        System.out.println(result);
    }
}
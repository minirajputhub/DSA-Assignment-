class Solution {
    static class Parent {
        void printParent() {
            System.out.println("This is the parent class");
        }
    }

    static class Child extends Parent {
        void printChild() {
            System.out.println("This is the child class");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}

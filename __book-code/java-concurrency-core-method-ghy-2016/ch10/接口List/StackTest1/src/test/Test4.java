package test;

import java.util.Stack;

public class Test4 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");

        System.out.println(stack.pop() + " ɾ");
        System.out.println(stack.pop() + " ɾ");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println("ʣµģ" + stack.get(i));
        }

    }

}

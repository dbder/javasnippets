package snippets;

public class StackWalkerSnippet {

    public static void main(String[] args) {
        test(10);
    }

    static void test(int x) {
        if (x == 0) return;
        java.lang.StackWalker walker = java.lang.StackWalker
                .getInstance(java.lang.StackWalker.Option.RETAIN_CLASS_REFERENCE);

        walker.forEach(stackFrame -> System.out.print(stackFrame));

        System.out.println("---x" + x);
        test(x - 1);
    }
}

package Session_1;

public class FlowControlMain {
    public static void main(String[] args) {
        FlowControl flowControl = new FlowControl();

        //if example
        boolean resultLoop = flowControl.ifExample();
        System.out.println(resultLoop);

        //while-loop example
        int resultloopExample = flowControl.loopExample(Integer.parseInt(args[0]));
        System.out.println(resultloopExample);

        //switch example
        String switchChoice = args[1];
        switch(switchChoice) {
            case "1":
                System.out.println("1 is One");
                break;
            case "2":
                System.out.println("2 is Two");
                break;
            case "3":
                System.out.println("3 is Three");
        }
    }
}

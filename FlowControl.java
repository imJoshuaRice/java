public class FlowControl {

    public boolean ifExample() {
    //if example
    if(true){
        System.out.println("It's true; it's true!");
        }
    return true;
    }

    public int loopExample(int loopNum) {
    //while-loop example
    System.out.println("I'm counting from " + loopNum + " to 10!");
    while(loopNum != 10){
        System.out.println(loopNum);
        loopNum++;
        }
    return loopNum;
    }
}

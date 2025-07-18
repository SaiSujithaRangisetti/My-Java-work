package ExcEption.CustomExcEption;

public class Prog1 {
    public class SSException extends Exception {//Step 1
        String msg = "Hello";
        public SSException (String msg){
            this.msg=msg;
        }
    }
    public static void main(String[] args) {

    }
}

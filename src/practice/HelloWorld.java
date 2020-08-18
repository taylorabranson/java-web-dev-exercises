package practice;

public class HelloWorld {

    private String message = "Hello, World";

    public HelloWorld(String message) {
        this.message = message;
    }
    public void sayHello() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }
}

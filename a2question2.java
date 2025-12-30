class cellphone{


public void ringing(){
System.out.println("Ringing.....");
}
public void vibrating(){
System.out.println("vibrating.....");
}
public void callFriend(){
    System.out.println("calling jasstin...");
}
}

public class a2question2 {
    public static void main(String[] args) {
        cellphone iphone = new cellphone();
        iphone.callFriend();
        iphone.ringing();
    }
}

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String userName,password,password2;
        System.out.println("Your username:");
        userName=input.nextLine();
        System.out.println("Your password:");
        password=input.nextLine();
        if(!password.equals("java123")&& userName.equals("patika")){
            String controlMessage;
            System.out.println("Do you want to change your password?(if you want write 'yes')");
            controlMessage=input.nextLine();
            if(controlMessage.equals("yes")){
                System.out.println("Enter your new password");
                password2=input.nextLine();
                if(password2.equals(password)){
                    System.out.println("failed to create password same as old password");
                }else {
                    password=password2;
                    System.out.println("Your new password is:"+password);
                }
            }
        }
    }
}

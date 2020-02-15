package chp8;

import java.awt.*;
import java.util.Scanner;

/*
Valdate a proposed password with these rules:
- at least 8 charcters long
- contain an uppercase letter
- contain a special character
- does not contain the user name
- is not the same as the old password
 */

public class PasswordValidator {
    public static void main(String[] args) {
        String userName = "JCSmiley";
        String oldPassword = "badpeople";

        String pwd1 = "testing";
        String pwd2 = "JCSmiley1";
        String pwd4 = "M$mphisDev";
        String pwd5 = "badpeople";

        validatePassword(pwd1, userName, oldPassword);
        validatePassword(pwd2, userName, oldPassword);
        validatePassword(pwd4, userName, oldPassword);
        validatePassword(pwd5, userName, oldPassword);


    }

    public static void validatePassword(String pwd, String userName, String oldPwd){
        boolean isValidLength = validateLength(pwd);
        boolean isContainUpperCaseLetter = validateContainUpperLetter(pwd);
        boolean isContainSpecialCharacter = validateContainsSpecialCharacter(pwd);
        boolean isNotContainUserName = validateNotUserName(pwd, userName);
        boolean isNotOldPassword = validateIfOldPassword(pwd, oldPwd);

        if(isNotOldPassword && isNotContainUserName && isValidLength && isContainUpperCaseLetter && isContainSpecialCharacter){
            System.out.println(pwd + " is a valid password");
        }else{
            System.out.println(pwd + " is not a valid password");
        }
    }

    //Check if the password contains at least 8 characters long
    public static boolean validateLength(String password){
        if(password.length() < 8){
            System.out.println(password + " does not have enough letters!");
            return false;
        }else{
            return true;
        }
    }

    //Check if the password contains at least one uppercase letter
    public static boolean validateContainUpperLetter(String password){
        boolean validated = false;//preset to false as in no uppercase found

        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                validated = true;
            }
        }

        if(!validated){
            System.out.println(password + " does not contain a uppercase letter!");
        }

        return validated;
    }

    //contain a special character
    public static boolean validateContainsSpecialCharacter(String password){
        boolean validated = false;//preset to false as in there is no special characters
        for(int i=0; i<password.length();i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                validated = true;//only true if a non-letter or non-number is found
            }
        }

        if(!validated){
            System.out.println(password + " does not contain a special character!");
        }

        return validated;
    }

    //Check if the password contains the user name
    public static boolean validateNotUserName(String password, String userName){
        boolean validated = password.contains(userName);

        if(validated){
            System.out.println(password + " does contain the user name!");
        }

        return !validated;
    }

    //Check if the passwords is the same as the old passwords
    public static boolean validateIfOldPassword(String password, String oldPassword){
        if(password != oldPassword){
            return true;
        }else{
            System.out.println(password + " is the same as the old password!");
            return false;
        }
    }

}

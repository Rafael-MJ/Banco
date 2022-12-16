package altf4.banco;
public class UserInfo {

    private static String USER_ID = "";
    
    public static String cryptoPass(String pass){
        
        String passCrypto = "";
        char passChar;
        
        for(int i = 0; i < pass.length(); i++){

            passChar = (char)pass.charAt(i);
            passChar += ((i+3)*2)+1;

            passCrypto += passChar;
        }
        return passCrypto;
    }
    
    public static String uncryptoPass(String pass){
        
        String passUncrypto = "";
        char passChar;
        
        for(int i = 0; i < pass.length(); i++){

            passChar = (char)pass.charAt(i);
            passChar -= ((i+3)*2)+1;

            passUncrypto += passChar;
        }
        return passUncrypto;
    }
    
    public static void setUserID(String user){
        
        USER_ID = user;
    }
    
    public static String getUserID(){
        
        return USER_ID;
    }
    
    public static void leftAccount(){
        
        USER_ID = "";
    }
}
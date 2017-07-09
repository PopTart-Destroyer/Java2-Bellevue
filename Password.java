import javax.swing.*;

public class Password
  {

    final static int MIN_LENGTH = 6;
    final static int MAX_LENGTH = 10;

    public static void main(String[] args)
      {
        int oneDigit = 0;
        int oneLetter = 0;
        int whiteSpace = 0;
        String pass1 = "";
        String pass2 = "";
        
        //loop until all requirement are met
        while (true)
          {
            //get first password
            pass1 = JOptionPane.showInputDialog(null, "Please enter first a password");
            int pwdLength = pass1.length();
            //check input length
            if (pwdLength < MIN_LENGTH || pwdLength > MAX_LENGTH)
              {
                JOptionPane.showMessageDialog(null, "More than 6 and less than 10 characters are needed.","Requirements",JOptionPane.PLAIN_MESSAGE);
              } else
              {
                //checking for 1 letter and 1 digit
                for (int i = 0; i < pwdLength; i++)
                  {
                    char c = pass1.charAt(i);
                    if (Character.isDigit(c)) //check if one or more digits were used
                      {
                        oneDigit++;
                      }
                    if (Character.isLetter(c)) //check if one or more characters were used
                      {
                        oneLetter++;
                      }
                    if (Character.isWhitespace(c)){
                        whiteSpace++;
                    }
                    
                  }
                //checking count for one letter and one digit used
                if (oneDigit > 0 && oneLetter > 0 && whiteSpace == 0)
                  {
                    //JOptionPane.showMessageDialog(null, "Password meets minimum requirements.");
                    break; //break, password meets all minimum requirements
                  } 
                else
                  {
                    if (oneDigit == 0){
                        JOptionPane.showMessageDialog(null, "Password needs at minimum one number.","Requirements",JOptionPane.PLAIN_MESSAGE);
                    }
                    if (oneLetter == 0){
                        JOptionPane.showMessageDialog(null, "Password needs at minimum one letter.","Requirements",JOptionPane.PLAIN_MESSAGE);    
                    }
                    if (whiteSpace > 0){
                        JOptionPane.showMessageDialog(null, "Spaces in password are not allowed.","Requirements",JOptionPane.PLAIN_MESSAGE);    
                        whiteSpace = 0; //reset counter
                    }
                  }
              }
          }
        //password two check against password one
        pass2 = JOptionPane.showInputDialog("Re-enter your password");
        if (pass2.equals(pass1))
          {
            JOptionPane.showMessageDialog(null, "Passwords match, Congratulations, you may enter! ", "Password Match", JOptionPane.PLAIN_MESSAGE);
          } else
          {
            while (!pass2.equals(pass1)) //loop while pass2 not equal to pass1
              {
                pass2 = JOptionPane.showInputDialog("Password does not match, enter your password again");
                if (pass2.equals(pass1))
                  {
                    JOptionPane.showMessageDialog(null, "Passwords match, Congratulations, you may enter! ", "Password Match", JOptionPane.PLAIN_MESSAGE);
                    break;  //break loop;
                  }
              }
          }
        System.exit(0);
      }
  }
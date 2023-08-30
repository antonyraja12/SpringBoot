package Level1;

import java.util.Scanner;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class passwordGenerator {
	public static void main(String args[]) {
		System.out.println("Enter the password Length Entered lenght Should be 8 and above");
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
        String pass = generateSecurePassword(value);  

        System.out.println("The Passay generated password is:"+pass);  
        scanner.close();

	}

	private static String generateSecurePassword(int value) {
		
        CharacterRule lCharacterRule = new CharacterRule(EnglishCharacterData.LowerCase);  
        lCharacterRule.setNumberOfCharacters(2);
        CharacterRule uCharacterRule=new CharacterRule(EnglishCharacterData.UpperCase);
        uCharacterRule.setNumberOfCharacters(2);
        CharacterRule dd=new CharacterRule(EnglishCharacterData.Digit);
        dd.setNumberOfCharacters(2);
        CharacterRule sRule=new CharacterRule(EnglishCharacterData.Special);
        sRule.setNumberOfCharacters(2);
        PasswordGenerator passGEN=new PasswordGenerator();
        String password=passGEN.generatePassword(value,lCharacterRule,uCharacterRule,dd,sRule);
        

		return password;
	}

}

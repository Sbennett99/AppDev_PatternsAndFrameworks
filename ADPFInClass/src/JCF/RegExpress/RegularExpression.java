package JCF.RegExpress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
    public void characterMatches()
    {
        // [] matching of a character
        String regex = "[a-g]";
        //regex = "[m-z]";
        String str = "Magdi";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // Illustration of ^ (negation)
        regex = "[^d-z]";
        //regex = "[d-z]";
        str = "caa";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // Illustration of union
        regex = "[a-c[u-z]]";
        //regex = "[s-z[S-Z]]";
        str = "Minor";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // Illustration of intersection
        regex ="[^a-m&&[h-z]]";
        //regex = "[a-m&&[h-z]]";
        str = "Lazy";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // Backslash (\\) character
        regex = "[a-z[\\-]]";
        //regex = "[\\+]";
        str = "Two-minutes";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
      
    }
    
    public void predefinedCharacter()
    {
    	//  . any character
    	String regex = ".";
        String str = "Magdi";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \d, that is, [0-9]
        regex = "\\d\\d";
        //regex = "\\d\\d\\d";
        str = "45 cats";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \D, that is, [^0-9]
        regex = "\\D\\D\\D";
        //regex = "\\d\\d\\d";
        str = "Two";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \w for [a-zA-Z_0-9]
        regex = "\\w$\\w";
        //regex = "\\w\\w\\w";
        str = "5$M";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \W for [^a-zA-Z_0-9]
        regex = "\\W";
        //regex = "\\W\\W";
        str = "5$M";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
       	
    }
    
    
    public void boundaryMatch()
    {
    	// ^ beginning of the line
    	String regex = "^[B-C]ats";
    	//regex = "^[^B-C]ats";
        String str = "Cats or bats are animal";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // $ end of the line
        regex = "500$";
        //regex = "600$";
        str = "$ 500";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \b boundary word
        regex = "\\bJava\\b";
        str = "The Java";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \B a non boundary word
        regex = "\\BJava";
        str = "TheJava";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
        
        // \A a beginning of an input
        regex = "\\AJava";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("True");
        else
            System.out.println("False");
    }
}

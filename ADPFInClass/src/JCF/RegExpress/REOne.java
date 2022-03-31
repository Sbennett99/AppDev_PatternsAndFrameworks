package JCF.RegExpress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REOne {
	
    public void characterMatches()
    {
        // [] matching of a character
        String regex = "[a-g]";
        //regex = "[m-z]";
        String str = "Magdi";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
       
        if(m.find())
           System.out.println("[]: True");
        else
            System.out.println("[]: False");
        
        // Illustration of ^ (negation)
        regex = "[^d-z]";
        //regex = "[d-z]";
        str = "caa";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("^: True");
        else
            System.out.println("^: False");
        
        // Illustration of union
        regex = "[a-c[u-z]]";
        //regex = "[s-z[S-Z]]";
        str = "Minor";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("[ []]: True");
        else
            System.out.println("[ []]: False");
        
        // Illustration of intersection
        regex ="[^a-m&&[h-z]]";
        //regex = "[a-m&&[h-z]]";
        str = "abc";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("[&&[]]: True");
        else
            System.out.println("[&&[]]: False");
        
        // Backslash (\\) character
        regex = "[a-z[\\+]]";
        //regex = "[\\+]";
        str = "Two-minutes";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\: True");
        else
            System.out.println("\\: False");
      
    }
    
    public void predefinedCharacter()
    {
    	//  . any character
    	String regex = ".";
        String str = "Magdi";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println(".: True");
        else
            System.out.println(".: False");
        
        // \d, that is, [0-9]
        regex = "\\b\\d\\d";
        //regex = "\\d\\d\\d";
        str = "454 cats";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\d: True");
        else
            System.out.println("\\d: False");
        
        // \D, that is, [^0-9]
        regex = "\\D\\D\\D";
        //regex = "\\d\\d\\d";
        str = "Two";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\D: True");
        else
            System.out.println("\\D: False");
        
        // \w for [a-zA-Z_0-9]
        regex = "\\w$\\w";
        //regex = "\\w\\w\\w";
        str = "5$M";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\w: True");
        else
            System.out.println("\\w: False");
        
        // \W for [^a-zA-Z_0-9]
        regex = "\\W";
        //regex = "\\W\\W";
        str = "5$M";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\W: True");
        else
            System.out.println("\\W: False");
       	
    }
    
    
    public void boundaryMatch()
    {
    	// ^ beginning of each new line in multi-line mode
    	String regex = "^Who";
        String str = "There once was a girl\nWho programmed in Perl\n";
        Pattern p = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("^: True");
        else
            System.out.println("^: False");
        
        // $ end of the line regardless of the line terminators
        regex = "500$";
        //regex = "600$";
        str = "$ 500\n";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("$: True");
        else
            System.out.println("$: False");
        
        // \b boundary word
        regex = "\\bJava\\b";
        str = "The Java";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\b: True");
        else
            System.out.println("\\b: False");
        
        // \B a non boundary word
        regex = "\\BJava";
        str = "TheJava";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\B: True");
        else
            System.out.println("\\B: False");
        
        // \A a beginning of an input
        regex = "\\AJava";
        //Scanner sc = new Scanner(System.in);
        str = "There is a language\nJava is an oo language";
        p = Pattern.compile(regex, Pattern.MULTILINE);
        m = p.matcher(str);
        if(m.find())
           System.out.println("\\A: True");
        else
            System.out.println("\\A: False");
       
        // \Z regardless of the line terminators
        p = Pattern.compile("Overflow\\Z");
        m = p.matcher("Overflow\n");
        if(m.find())
            System.out.println("\\Z: True");
         else
             System.out.println("\\Z: False");
       
        //\z for absolute end of the input
        p = Pattern.compile("Overflow\\z");
        m = p.matcher("Overflow\n");
        if(m.find())
            System.out.println("\\z: True");
         else
             System.out.println("\\z: False"); 
    }
    
    public void quantifiers()
    {
    	// * - zero or more times
    	String regex = "\\d*";
        String str = "There is a boy";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("*: True");
        else
            System.out.println("*: False");
        
        // + - one or more times
        p = Pattern.compile("\\d+");
        m = p.matcher("There are 2 boys");
        if(m.find())
            System.out.println("+: True");
         else
             System.out.println("+: False");
        
        // + - one or more times
        p = Pattern.compile("\\d?");
        m = p.matcher("There are boys");
        if(m.find())
            System.out.println("?: True");
         else
             System.out.println("?: False");
        
        // {m} - exactly m times
        p = Pattern.compile("\\d{2}");
        m = p.matcher("There are 23 boys");
        if(m.find())
            System.out.println("{m}: True");
         else
             System.out.println("{m}: False");
        
        // {m, n} - in the range of m and n
        p = Pattern.compile("\\d{2,5}");
        m = p.matcher("There are 234 boys");
        if(m.find())
            System.out.println("{m, n}: True");
         else
             System.out.println("{m, n}: False");
    }
    
    public void group()
    {
    	// | alteration
    	String regex = "^A|An|The\\b";
        String str = "The sun rises in the east";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("|: True");
        else
            System.out.println("|: False");
        
        // Non capturing group
        regex = "(?:^A.*|^An.*|^The.*)(?:.*\\.\\z|.*\\;\\z)";
        str = "The sun rises in the east.";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
        	System.out.println("(?:): True");
        else
        	System.out.println("(?:): False");
        
        // capturing group (any two or more digit numbers with
        // the same begin and end digit)
        regex = "^(\\d)\\d*\\1";
        str = "33";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
        	System.out.println("(): True");
        else
        	System.out.println("(): False");
        
        // capturing group (all numbers from 1 to 100)
        regex = "^([1-9])\\d{0,2}";
        str = "100";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
        	System.out.println("(): True");
        else
        	System.out.println("(): False");
    	
    }
    
    public void look()
    {
    	// Look ahead (?=)
    	String regex = "import (?=static).+";
        String str = "import static org.junit;";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.find())
           System.out.println("?=: True");
        else
            System.out.println("?=: False");
        
        // Negative look ahead (?=)
    	regex = "import (?!static).+";
        str = "import org.junit;";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("?!: True");
        else
            System.out.println("?!: False");
        
        // Look behind (?<=)
        regex = "(?<=import) .+";
        str = "import org.junit;";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("?<=: True");
        else
            System.out.println("?<=: False");
        
     // Negative look behind (?<!)
        regex = "(?<!private) .+";
        str = "import org.junit;";
        p = Pattern.compile(regex);
        m = p.matcher(str);
        if(m.find())
           System.out.println("?<!: True");
        else
            System.out.println("?<!: False");
    }
    
    public static void main(String[] args)
    {
    	REOne re = new REOne();
		re.characterMatches();
		re.predefinedCharacter();
		re.boundaryMatch();
		re.quantifiers();
		re.group();
		re.look();
    }
}

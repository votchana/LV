package lesson3;

public class Strings {
    String expectedUN = "LIANAV";
    String expectedP = "12345";
    public static void main(String[] args){

        Strings logIn = new Strings();

        Strings examples = new Strings();

        System.out.println("Verification result: " + logIn.verifyIt("liANav", "") );

        System.out.println("Compare result: ");
        examples.compareIt("catalog", "cat");
        examples.backAround("froggyB");

        if (examples.fizzString("lab"))
            System.out.println("yes");
        else System.out.println("No");

        if (examples.bibString("bfrbjabbasfgbb"))
            System.out.println("It's a bib!");
        else
            System.out.println("Not a bib");


    }

    public boolean verifyIt (String un, String p){

        un = un.toUpperCase();
        p = p.toUpperCase();

        if (un.isBlank()||(p.isBlank()))
            System.out.println("It's blank");
        else if (un.isEmpty()|| (p.isEmpty()))
            System.out.println("It's empty");
        else if (un == null || p == null )
            System.out.println("It's null");

        if (un.equals(expectedUN)&&(p.equals(expectedP)))
            return true;
        else
            return false;
    }

    public void compareIt (String a, String b){
        if (a.contains(b) || (b.contains(a))) {
            System.out.println(a + " contains " + b + " or " + b + " contains " + a);
            System.out.println("Let's modify first string! " + a.replace("cat", "dog"));
            System.out.println("Let's see what's on second place in second string! " + b.charAt(2));
        }
//        else if (b.contains(a))
//            System.out.println(b + "contains" + a);
        else
            System.out.println("Nothing in common");
    }

    public void backAround (String a){
        a = a.charAt((a.length())-1)+a+a.charAt((a.length())-1);
        System.out.println(a);
    }

    public boolean fizzString (String a){
        System.out.println();
        if(a.charAt(0)=='f')
            System.out.print("Fizz");
        if(a.charAt(a.length()-1)=='b')
            System.out.println("Bizz");
        else if (a.charAt(0)!='f')return false;
        return true;
    }

    public boolean bibString (String a){
        int i;

        for (i=0;i<(a.length()-2);i++){
            if ((a.charAt(i)=='b')&&(a.charAt(i+2)=='b'))
                    return true;
        }
        return false;
    }
}

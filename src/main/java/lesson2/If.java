package lesson2;

public class If {
    public static void main(String[] args){
        If objectIf = new If();
        If myObject = new If();
        String myString = new String();

        objectIf.printing("Liana",90357);
        objectIf.examPass(89, true);

        objectIf.printing("Diana",35756);
        objectIf.examPass(59, true);

        objectIf.printing("Tiana",37956);
        objectIf.examPass(111, false);

        objectIf.printing("Biana",47756);
        objectIf.examPass(-43, true);

        objectIf.printing("Riana",47756);
        objectIf.examPass(76.9, true);

        objectIf.printing("Miana",47016);
        objectIf.examPass(50, false);


        myObject.examPass(100, true);
        myString = "Loioaonoa";
        System.out.println(myString.compareTo("Liana"));
    }

    public void printing (String name, double ID ){

        if (name.equals("Biana")){
            ID = ID*100;
        }
        System.out.println("Name =" + name);
        System.out.println("ID =" + (int)ID);

    }

    public void examPass(double grade, boolean bonus) {

        if (bonus && grade<=80 && 2==2){
            grade = grade + 20;
        }

        if (grade>100 || grade<0 ||(grade-(int)grade)!=0){
            System.out.println("Error");
        }
        else if(grade>=60)
                System.out.println("You've passed!");
             else
                System.out.println("Sorry, you've failed");
        }

}


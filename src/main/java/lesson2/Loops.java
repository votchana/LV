package lesson2;

public class Loops {
    public static void main(String[] args){

        Loops myLoop = new Loops();
        int res = myLoop.counting();
        myLoop.printChess(27); //rak mispar mithalek be 3 llo shearit
        System.out.println("Total Result A: " + res );
        System.out.println();
        System.out.println("Total Result B: " + myLoop.counting(res));
        String list = res+"ert"+1+""+2+3+4+""+5+""+res+""+"string";
        System.out.println(list+""+res);



    }

    public int counting(){
        int i = 10;
        while(i<20) {
            i++;
            System.out.println("Add 1: " + i);
        }
        return i;
    }

    public int counting (int res){
        for(; res<1000000000; res=res*10)
            System.out.println("Multiply by 10: " + res);
        return res;
    }
    public void printChess (int column){
        int i;
        int j;


            for(i=1;i<column;i++){
                if(i<(column/3*2)&&!(i<=(column/3))){
                    for(j=1;j<=(column/3);j++)
                        System.out.print("O");
                    for(;j<(column/3*2);j++)
                        System.out.print("-");
                    for(;j<column;j++)
                        System.out.print("O");
                    System.out.println();
                }
                else {
                    for(j=1;j<=(column/3);j++)
                        System.out.print("-");
                    for(;j<(column/3*2);j++)
                        System.out.print("O");
                    for(;j<column;j++)
                        System.out.print("-");
                    System.out.println();
                }

            }
            System.out.println();
    }
}



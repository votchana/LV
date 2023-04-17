package lesson5;

// import java.lang.reflect.Array;

import java.util.Random;

public class Arrays {

    String[] buttons = {"ok","cancel","start","reset","edit"};

    public void examps () {

        System.out.println(buttons[2]+ " lenght: " + buttons.length);
    }

    public void examp2(String a){
        buttons[2] = a;
//        int i;
//        for (i=0;i<buttons.length;i++)
//        System.out.println(buttons[i]);
        for (String button: buttons) {
            System.out.println(button);
            System.out.println("^_o_^");
        }
    }

    public void setSize(int x){
        int i;
        int[] arrNumbers = new int[x];

        for (i=0;i<arrNumbers.length;i++) {
            arrNumbers[i] = i + 1;
            System.out.println(arrNumbers[i]);
        }
    }

    public void maxTriple (){
        int i;
        int len = 9;
        int[] nums = new int[len];

        for(i=0; i<len; i++){
            Random rn = new Random();
            nums[i] = rn.nextInt(10) + 1;
            System.out.println(nums[i]);
        }

        System.out.println("Triple max:" + nums[0]+","+ nums[len/2]+"," +nums[len-1]);

        if((nums[0]>nums[len/2])&&((nums[0]>nums[len-1])))
            System.out.println(nums[0]);

        else{
            if ((nums[len - 1] > nums[len / 2]))
                System.out.println(nums[len - 1]);
            else
                System.out.println(nums[len/2]);

        }
    }


}

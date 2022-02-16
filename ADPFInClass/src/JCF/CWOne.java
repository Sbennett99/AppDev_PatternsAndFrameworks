package JCF;

import java.util.ArrayList;

public class CWOne {
    public static int fibSequence(int num){
        if(num <= 0){
            System.out.print("Invalid Input");
            return -1;
        }else if(num == 1 ){
            System.out.println("0");
            return 0;

        }else if(num ==2){
            System.out.println("0 1");
            return 1;

        }
        else{
            System.out.print("0 1 ");
            ArrayList<Integer> starter = new ArrayList<>();
            starter.add(0);
            starter.add(1);
            return fibSequence(num-3,starter) ;
        }
    }
    public static int fibSequence(int num, ArrayList<Integer> prev){

        int newNum = prev.get(0) + prev.get(1);
        System.out.print(newNum + " ");
        if(num == 0){
            System.out.println();
            return newNum;
        }
        else{
            prev.remove(0);
            prev.add(newNum);
            return  fibSequence(num-1,prev);
        }
    }
    public static void main(String[] args){
        System.out.println("Number returned: "+ fibSequence(5));

        System.out.println("Number returned: "+ TeacherFib(5));


    }
    public static int TeacherFib(int n){
        if(n<=0){
            System.out.println("Invalid input");
            return -1;
        }
        else if(n==1){

            return 0;
        }
        else if(n==2){

            return 1;
        }
        else{

            return TeacherFib(n-1) + TeacherFib(n-2);
        }
    }


}

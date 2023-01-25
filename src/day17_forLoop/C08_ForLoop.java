package day17_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {

        String input="madam";
       palindromKontrolEt(input);

        }

    private static void palindromKontrolEt(String input) {




        String terstenInput="";



        for (int i = input.length()-1; i >=0; i--) {
            terstenInput=input.substring(i,i+1);
            System.out.print(terstenInput);
        }


        if(input.equalsIgnoreCase(terstenInput)){
            System.out.println(" : palindrome");
        }else{
            System.out.println(" : palindrome degil");
        }
    }


}


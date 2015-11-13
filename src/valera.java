/**
 * Created by Игорь on 13.11.2015.
 */
public class valera {

    public static void bubble_srt(String array[]) {
        int n = array.length;
        int k;

        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                String j=array[i];
                String hg = array[i+1];
                if(j.length()>hg.length())
                {
                    swapStrings(i,i+1,array);
                }

            }

            }
        printNumbers(array);

    }

    public static void inverse_buble_sort(String array[]) {
        int n = array.length;
        int k;

        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                String j=array[i];
                String hg = array[i+1];
                if(j.length()>hg.length())
                {

                }
                else{

                    swapStrings(i+1,i,array);
                }

            }

        }
        printNumbers(array);

    }

    private static void swapStrings(int i, int j, String[] array) {

        String temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(String[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
    private static void Search_lenghth(String []arr){
        String f=arr[0];
        String d=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            String g=arr[i];
            if(f.length()<g.length()) {
                f = g;
            }
            if(d.length()>g.length())
            {
                d=g;
            }
        }
        System.out.println("Самая большая строка - "+f+" Длинна строки - "+f.length()+"\n");

        System.out.println("Самая маленькая строка - "+d+" Длинна строки - "+d.length()+"\n");

    }
    public static void Search_Middle(String[]arr){

        int arr2[]=new int[arr.length];
        int hjk =0;
        for(int u=0;u<arr.length;u++)
        {

                String fh = arr[u];
                // arr2[u]= fh.length();
                hjk += fh.length();
        }
        hjk = hjk/arr.length;
        System.out.println(hjk);
        int hjkf =0;
        for(int u=0;u<arr.length;u++) {
            String fhd = arr[u];
            hjkf = fhd.length();
            if (fhd.length() >= hjk)
            {
                System.out.println("Значения масива больше средины - "+fhd);
            }
            if (fhd.length() <= hjk)
            {
                System.out.println("Значения масива меньше средины - "+fhd);
            }
        }

    }

    public static void main(String[] args) {
        String [] arr = {"dfgsdgsddfg","hfghdfhd","d","fgdhg","tyjhfgfdg","oiuytre"};
        Search_lenghth(arr);
        bubble_srt(arr);
        inverse_buble_sort(arr);
        Search_Middle(arr);
        //выкачать гид репозиторий git clone + ssh группы
    }
}

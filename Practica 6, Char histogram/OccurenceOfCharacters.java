package com.company;

public class OccurenceOfCharacters {


    public int ex(String str){






        int[] count = new int[255];

        int length = str.length();

        for (int i = 0; i < length; i++) {
            count[str.charAt(i)]++;
        }

        char[] ch = new char[str.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1) {
                System.out.print(str.charAt(i)+": ");
                for(int a=0; a<count[str.charAt(i)]; a++){
                    System.out.print("*");

                }
                System.out.println(" ");
                //System.out.println("Number of Occurrence of " + str.charAt(i) + " letter is:" + count[str.charAt(i)]);
            }
        }
        return count[str.charAt(1)];
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        
        final String h = "chsb2ujcnu7- 12jdjnc9";
        final String res = String(h);
        System.out.println(res);


        String s = "  As a   government employee, he set up a    similar    hepatitis B vaccination programme, including in the garrison town of Abbottabad, where it turned out Bin Laden was living right under the noses of the military.   ";
        System.out.println(s);

        int counter = 0;
        char[] sentence = s.trim().toCharArray();
        for (char c : sentence) {
            System.out.print(c);
        }
        int length = sentence.length;
        for (int j = 0; j < length - 1; j++) {
            if (sentence[j] == ' ' && sentence[j + 1] == ' ') {
                for (int i = j; i < length - 1; i++) {
                    sentence[i] = sentence[i + 1];
                }
                length--;
            }
        }

        sentence = Arrays.copyOf(sentence, length);

        System.out.println();
        for (char c : sentence) {
            System.out.print(c);
        }

        for (char c : sentence) {
            if (c == ' ')
                counter++;
        }

        System.out.println(++counter);

        s = "_1q1";
        sentence = s.toCharArray();
        if (Character.isLetter(sentence[0]) || sentence[0] == '_') {
            for (int j = 1; j < sentence.length; j++) {
                if (sentence[j] == '_' || Character.isLetter(sentence[j]) || Character.isDigit(sentence[j]))
                    System.out.println("Correct");
                else
                    System.out.println("Incorrect");
            }
        }
        else
            System.out.println("Incorrect");
    }

    //количество строк в строке
    public static void Schet(){
        int i = 1,m = 0,countWord=1;
        String s = "adygsdy sjhfudh jehf ehfuh  ehfuhfuuhrufh uhfueh euhfue euhf euhf urehfutru";
        for(i=1;i<s;i++){
            if(s[i-1]==" " && s[i] != " "){
                countWord++;
            }
        }
        System.out.println(countWord);
    }

}

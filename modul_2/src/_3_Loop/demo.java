package _3_Loop;

public class demo {
    public static void main(String[] args) {
        String[] strings = { "Hai", "quoc","nam"};
    for (int i = 0; i<strings.length; i++){
        System.out.println("for-index"+strings[i]);
    }
    for (String a: strings){
        System.out.println("for-each"+a);
    }
    int i=0;
    while (i< strings.length){
        System.out.println("while"+strings[i]);
        i++;
    }
    int j=0;
    do {
        System.out.println("do-while"+ strings[j]);
        j++;
    }while (j< strings.length);
    }
}

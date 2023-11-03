public class forbreak{ // this  program will display letters from A to z
    public static void main(String[]args){
        char a='A';
        for(int i=0;i<26;i++){ 
                if(i==78)
        {
            break;// it will break if reachs to 26
        }
            System.out.println(a);
            a++;
        }
    }
} 
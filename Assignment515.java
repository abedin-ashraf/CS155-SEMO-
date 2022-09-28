//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//Assignment 5.15
//09-28-2022


public class Assignment515 {
    public static void main(String[] args) {
        int count=0;
        for(int i=33; i<=126; i++){
            System.out.print((char)i +" ");
            count++;
            if(count%10==0)
                System.out.println();
            }
    }
}

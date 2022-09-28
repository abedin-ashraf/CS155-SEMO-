//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//Assignment 5.27
//09-28-2022


public class Assignment527 {
    public static void main(String[] args) {
        int count=0;
        for(int i=101; i<=2100; i++){
            if((i%4==0 && i%100!=0)||i%400==0){
                System.out.print(i+" ");
                count++;
                if(count%10==0)
                    System.out.println();
            }

        }
        System.out.println("\n\nTotal number of leap year between 101-2100 is "+count);
    }
}

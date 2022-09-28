//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//Assignment 5.13
//09-28-2022


public class Assignment513 {
    public static void main(String[] args) {
        int n = 2;
        while((n*n*n)<12000){
            n++;
        }
        System.out.println("The largest n such that n^3 < 12000 is: "+(n-1));
    }
}

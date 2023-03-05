/***
 (Conversions between feet and meters) Write a class that contains the following 
two methods:
Convert from feet to meters
    public static double footToMeter(double foot)
Convert from meters to feet 
    public static double meterToFoot(double meter)
The formula for the conversion is:
    meter = 0.305 * foot
    foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:
    Feet Meters | Meters Feet
    1.0 0.305 | 20.0 65.574
    2.0 0.610 | 25.0 81.967
    3.0 0.915 | 30.0 98.361
    4.0 1.220 | 35.0 114.754
    5.0 1.525 | 40.0 131.148
    6.0 1.830 | 45.0 147.541
    7.0 2.135 | 50.0 163.934
    8.0 2.440 | 55.0 180.328
    9.0 2.745 | 60.0 196.721
    10.0 3.050 | 65.0 213.115

*/


//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//10/05/2022
//Assignment 6.09


public class Assignment609 {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("""

                Feet     Meter     |     Meter     Feet
                ----------------------------------------------""");
        double feet, meter;
        for (feet = 1.0, meter = 20.0; feet <= 10.0; feet++, meter += 5) {
            System.out.printf("%4.1f     ", feet);
            System.out.printf("%6.3f", footToMeter(feet));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", meter);
            System.out.printf("%7.3f\n", meterToFoot(meter));
        }
    }
}


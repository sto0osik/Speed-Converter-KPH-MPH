public class SpeedConverter {


    public static long toMilesPerHour (double kilometersPerHour){

        long milesPerHour = 0;

        if (kilometersPerHour < 0){
            System.out.println("You cannot make a this calculation. You have to change inserted value");
        } else {
            milesPerHour = (long) (kilometersPerHour * 0.6213712);
        }

        System.out.println("Miles Per Hour for " + kilometersPerHour + ": " + milesPerHour);
        return milesPerHour;
    }


    public static long toKilometersPerHour (double milesPerHour){

        long kilometersPerHour = 0;

        if (milesPerHour < 0){
            System.out.println("You cannot make a this calculation. You have to change inserted value");
        } else {
            kilometersPerHour = (long) (milesPerHour * 1.6093440);
        }

        System.out.println("Kilometers Per Hour for " + milesPerHour +": " + kilometersPerHour);
        return kilometersPerHour;

    }


}

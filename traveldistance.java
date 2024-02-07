class HelloWorld {
    public static void main(String[] args) {
        double velocity=7;
        double speed=9;
        double acceleration=31;
        double time=6;
        double distance=(velocity*time)+ 0.5*acceleration* Math.pow(time,2.0);
        System.out.println("The travel distance is :"+distance);
    }
}
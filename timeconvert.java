class HelloWorld {
    public static void main(String[] args) {
        int seconds=400000000;
        int days=seconds/(24*3600);
        int weeks=days/7;
        int years=days/365;
        System.out.println(seconds+" is equal to "+days+"=days, "+weeks+"=weeks, "+years+"=years ");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        double length=7;
        double height=9;
        double width=31;
        double pricePerSquareMeter=1;
        double totalarea=height*height*length*width;
        double totalprice=pricePerSquareMeter*totalarea;
        System.out.println("The total price is :"+totalprice);
    }
}
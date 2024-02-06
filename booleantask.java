class HelloWorld {
    public static void main(String[] args) {
     
        char ch='A';
        if (Character.isLetter(ch))
        System.out.println("The character is a Letter:"+true);
        
        else if (Character.isDigit(ch))
         System.out.println("The character is a digit:"+false);
        
    }
}
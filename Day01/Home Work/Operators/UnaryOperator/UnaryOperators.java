class UnaryOperators {
    public static void main(String[] args) {
        System.out.println("Unary Plus (+)");
        int a = 5;
        System.out.println("Unary Plus: +" + a+"\n");
        
        System.out.println("Unary Plus (-)");
        int b = -a;
        System.out.println("Unary Minus: " + b+"\n");
		
		System.out.println("Pre-increment (++)");
        int preIncrement = ++a;
        System.out.println("Pre-increment: " + preIncrement+"\n"); 
        
		System.out.println("Post-increment (++)");
        int postIncrement = a++;
        System.out.println("Post-increment: " + postIncrement);
        System.out.println("Value of a after Post-increment: " + a+"\n"); 
		
		System.out.println("Pre-decrement (--)");
        int preDecrement = --a;
        System.out.println("Pre-decrement: " + preDecrement+"\n"); 

		System.out.println("Post-decrement (--)");
        int postDecrement = a--;
        System.out.println("Post-decrement: " + postDecrement); 
        System.out.println("Value of a after Post-decrement: " + a+"\n"); 

       System.out.println("Not Operator (!)");
        boolean BoolValue = true;
        System.out.println("Logical NOT (!): " + !BoolValue);
    }
}
class LogicalOperators{
    public static void main(String[] args){
		
        boolean x = true;
        boolean y = false;

        System.out.println("AND (&&)");
        System.out.println("AND (true && false): " + (x && y)+"\n");

		System.out.println("OR (||)");
        System.out.println("OR (true || false): " + (x || y)+"\n");

		System.out.println("NOT (!)");
        System.out.println("NOT (!true): " + (!x)+"\n");
    }
}


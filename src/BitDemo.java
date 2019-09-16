import java.util.stream.Stream;

class BitDemo {
	
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
        
        doSomething("test","test____2 " , "test########### 3");
        doSomething();
        doSomething("78645","749382");
        String [] input = {"sunil","ramesh"};
        doSomething(input);
    }
    
    
    public static void doSomething(String...strings) {
    	System.out.println("method called ");
    	
    	int i = 0;
    	int j = strings.length-1;
    	while(j >= 0) {
    		System.out.println("Input parameter " + strings[i]);
    		i++;
    		j--;
    	}
    	
    }
}
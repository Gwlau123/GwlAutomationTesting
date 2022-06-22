package javaLoopsAndStatements;

public class forLoop {
	
	public static void main(String[] arg) {
		
		int num;

		System.out.println("Loop1");
		
		for(num=0 ; num<5 ; num++) {
			System.out.println(num+" < 5 inside LOOP1");
		}
		
		System.out.println("\nLoop2");
		
		for(num=5 ; num>0 ; num--) {   
			System.out.println(num+" > 0 inside LOOP2");
		}

		System.out.println("\nLoop3");
		
		num=0;
		
		for( ; num<5 ; ) {   
			System.out.println(num+" < 5 inside LOOP3");
			num++;
		}

		System.out.println("\nLoop4");
		
		for(int i=0 ; i<=5 ; i++) {
			for(int j=0 ; j<=5 ; j++) {
				if(j<i)
					System.out.print("["+i+","+j+"]\t");
				else if(j==i)
					System.out.print("["+i+","+j+"]\n");
			}
		}

		System.out.println("\nLoop5");
		
		for(int i=0 , j=0 ; ( i<5 && j<5 ) ; i++ , j++ , System.out.println("Block code end\n")) {
			if(j==i)
				System.out.println("["+i+","+j+"]");
		}
		
	}
}

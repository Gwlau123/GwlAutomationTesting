package javaLoopsAndStatements;

public class forLoop {
	
	public static void main(String[] arg) {
		
		int num;

		System.out.println("Loop1");
		
		for(num=0 ; num<4 ; num++) {
			System.out.println(num+" < 4 inside LOOP1");
		}
		
		System.out.println("\nLoop2");
		
		for(num=4 ; num>0 ; num--) {   
			System.out.println(num+" > 0 inside LOOP2");
		}

		System.out.println("\nLoop3");
		
		num=0;
		
		for( ; num<5 ; ) {   
			System.out.println(num+" < 4 inside LOOP3");
			num++;
		}
		
		int i,j;
		
		System.out.println("\nLoop4");
		
		for(System.out.println("Loop started") , i=0 , j=0 ; ( i<3 || j<3 ) ; i++ , j++ , System.out.println("Block code end")) {
			System.out.println("Block code running");
		}

		System.out.println("\nLoop5");
		
		for(i=0 ; i<=4 ; i++) {
			for(j=0 ; j<=4 ; j++) {
				if(j<i)
					System.out.print("["+i+","+j+"]\t");
				else if(j==i) {
					System.out.print("["+i+","+j+"]\n");
				}
			}
		}

	}
}

package problemSolving.A_SilverBloom.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EfficientJanitor {
	public static void main(String[] args) {
		List<Float> arr = Arrays.asList(1.01f, 1.01f, 1.01f, 1.4f, 2.4f);
		System.out.println(efficientJanitor(arr));
		
		
		List<Integer>  arrival1 =  Arrays.asList(1,3,3,5,7);
		List<Integer>  duration1 = Arrays.asList(2,2,1,2,1);
        System.out.println(num_maxEvents(arrival1, duration1));
        List<Integer> arrival2 =  Arrays.asList(1,3,3,5,7, 6, 9);
        List<Integer> duration2 = Arrays.asList(2,2,1,2,1, 10, 2);
        System.out.println(num_maxEvents(arrival2, duration2));
        List<Integer> arrival = Arrays.asList(1,3,35,7);
        List<Integer> duration = Arrays.asList(2,2,1,2,1);
        System.out.println(num_maxEvents(arrival, duration));
		
	}
	
	
	public static int num_maxEvents (List<Integer> arrival, List<Integer> duration) {
     
		int drop = 0;
        int NumOfEvents = arrival.size();
        int [][] intervals = new int[NumOfEvents][2];

        for (int i = 0; i < NumOfEvents; i++) {
            intervals[i] = new int[] {arrival.get(i), arrival.get(i) + duration.get(i)};
        }

        Arrays.sort(intervals, (a, b) ->(a[1] - b[1]));
        // the finish time of first event;
        int curTime = intervals[0][1];

        for (int i = 1; i < NumOfEvents; i++) {
            int [] toSchedual = intervals[i];
            if (toSchedual[0] < curTime)
                drop++;
            else {
                curTime = toSchedual[1];
            }
        }
        return NumOfEvents - drop;
	}
	
	
	private static int efficientJanitor(List<Float> arr) {
		int n = arr.size();
		float limit = 3.0f;
		Collections.sort(arr);

		boolean[] check = new boolean[n];
		
		int count = 0;
		
		for (int i = n-1; i >=0; i--) {
			
			if (check[i]) continue;
			check[i]=true;
			count++;
			
			float remain = limit - arr.get(i);
			
			for (int j = i-1; j >=0; j--) {
				if (!check[j] && arr.get(j) <= remain) {
					remain = remain - arr.get(j);
					check[j] = true;
					
				}
			}
		}
		return count;
	}
	
}

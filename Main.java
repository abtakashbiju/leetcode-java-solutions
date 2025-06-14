import java.util.*;
public class Main {
  public static void main(String[] args){
    
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] result = targetFinder(nums, target);
    System.out.println(Arrays.toString(result));
  }
    
  public static int[] targetFinder(int[] arr, int aim){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int diff = aim-arr[i];

      if(map.containsKey(diff)){
        return new int[] {map.get(diff), i};
      }

      map.put(arr[i], i);
    }
    return new int[]{};
  }

    
  
}

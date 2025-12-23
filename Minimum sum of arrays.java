public int findSum(int[] arr1, int[] arr2, int len){
        int min = arr1[0];
        int max = arr1[0];

        int minP = 0;
        int maxP = 0;

        for(int i = 0; i < len; i++){
            if(arr1[i] < min){
                minP = i;
            }
            else if(arr1[i] > max){
                maxP = i;
            }
        }

        if(arr2[minP] < arr2[maxP]){
            int temp = arr2[minP];
            arr2[minP] = arr2[maxP];
            arr2[maxP] = temp;
        }


        //check for array 2
        min = arr2[0];
        max = arr2[0];

        minP = 0;
        maxP = 0;

        for(int i = 0; i < len; i++){
            if(arr2[i] < min){
                minP = i;
            }
            else if(arr2[i] > max){
                maxP = i;
            }
        }

        if(arr1[minP] < arr1[maxP]){
            int temp = arr1[minP];
            arr1[minP] = arr1[maxP];
            arr1[maxP] = temp;
        }


        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }
}

int[] findTwoElement(int arr[], int n) {
        // code here
        int[] count = new int[n + 1];
        
        for(int i: arr){
            count[i]++;
        }
        int mis = -1;
        int rep = -1;
        for(int i = 1; i <= n; i++){
            if(count[i] == 2){
                rep = i;
            }
            else if(count[i] == 0){
                mis = i;
            }
        }
        return new int[] {rep, mis};
    }

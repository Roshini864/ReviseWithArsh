int[] findTwoElement(int arr[], int n) {
        // bruteforce
        int[] ans = new int[2];
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                ans[0] = i;
            }
            if(count == 0){
                ans[1] = i;
            }
        }
        return ans;

        //beter solution
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

        
        //optimal app1
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        int[] ans = {(int)x, (int)y};
        return ans;

        //opt app2
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr^a[i];
            xr = xr^(i + 1);
        }
        int number = (xr & ~(xr - 1));
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }
            else {
                zero = zero ^ a[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            }
            else {
                zero = zero ^ i;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }
        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }

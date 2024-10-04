package DSA.ProDSA;

public class LengthOfContiguousArrayAllIntegersEqual{
    public static void main(String[] args) {
        int arr[] = {1,-2,1,1,3,2,1,-2};
        int k = 3;

        int answer = 0;
        int low = 0;
        int high = arr.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(check(arr, mid)){
                answer = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(int arr[], int k){
        int i = 0;
        int countDiff = 0;

        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                countDiff++;
            }  

            while(countDiff>k){
                if(arr[i]!=arr[j]){
                    countDiff--;
                }

                i++;
            }   

            if(j-i+1<=k){
                return true;
            }
        }

        return false;
    }
}


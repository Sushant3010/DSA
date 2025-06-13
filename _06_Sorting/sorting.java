 class sorting {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[i]>arr[i+1]){
                     int temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;  
                }
            }

        }
        
        //insertion sort
        for(int i=1; i<arr.length; i++ ){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;


            }
        }
        }
    
    
    }


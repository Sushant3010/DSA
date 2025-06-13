

public class TowerOfHanoi {
    public static void TowerofHanoi(char source, char helper, char destination, int n){
        if(n==1){
            System.out.println("transfer disk 1 from source " + source + " to destination " + destination);
            return;
        }
        TowerofHanoi(source, destination, helper, n-1);
        System.out.println("transfer disk" + n + " from source " + source + " to destination " + destination); 
        TowerofHanoi(helper,source,destination, n-1);
    }
    public static void main(String[] args) {
        int n = 3; // Number of disks
        TowerofHanoi('A', 'B', 'C', n);
    }
}

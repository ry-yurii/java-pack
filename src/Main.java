import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineManager.MachineManager;

public class Main {
//    public static void recursiveFunction(int n){
//        if (n != 0) {
//            System.out.println("dive " + n);
//            recursiveFunction(n - 1);
//            System.out.println("get up " + n);
//        }
//    }
    //    public static int recursiveMultiplication(int value, int multiplier) { //next step
//        //not allowed to use *, for, while, or do-while loops
//        // recursiveMultiplication(10,6);
//        if (multiplier != 0){
//            recursiveMultiplication(
//            value, multiplier - 1);
//
//        }
//    }

    public static void main(String[] args) {
//        *   Instantiate the `MachineManager` and add various machines to it.

//        *   Load and save a recipe using the `RecipeManagement` interface.

//        *   Start all machines via the `MachineManager`.
MachineManager.getInstance().printMachineCount();
//        *   Output the total number of created machines using the static variable.

    }
}

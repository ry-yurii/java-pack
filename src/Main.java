import com.rychiger.PackagingMachinePlatform.PackagingMachine.Enums.MachineEnumType;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineFactory;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineManager.MachineManager;

public class Main {

    public static void main(String[] args) throws Exception {
//        *   Instantiate the `MachineManager` and add various machines to it.
        MachineManager.getInstance().addMachine(MachineFactory.getMachine(MachineEnumType.fillerMachine, "filler 1", 45));
        MachineManager.getInstance().addMachine(MachineFactory.getMachine(MachineEnumType.cartoningMachine, "cartoning 1", 32));
        MachineManager.getInstance().addMachine(MachineFactory.getMachine(MachineEnumType.cartoningMachine, "cartoning 1", 54));
        MachineManager.getInstance().addMachine(MachineFactory.getMachine(MachineEnumType.sealingMachine, "sealing 1", 25));

        System.out.println("Getting machine names:");
        System.out.println("We have this machines in our list with names: " + MachineManager.getInstance().getMachineNames());
        System.out.println("\n");

        System.out.println("Printing machine counts before removing:");
        MachineManager.getInstance().printMachineCount();

        System.out.println("Loading all recipes:");
        MachineManager.getInstance().loadAllRecipes();
        System.out.println("\n");

        System.out.println("Saving all recipes:");
        MachineManager.getInstance().saveAllRecipes();
        System.out.println("\n");

        System.out.println("Starting all machines:");
        MachineManager.getInstance().startAllMachines();
        System.out.println("\n");

        System.out.println("Stopping all machines:");
        MachineManager.getInstance().stopAllMachines();
        System.out.println("\n");

        System.out.println("Getting all machine names before removing:");
        System.out.println("We have this machines in our list: " + MachineManager.getInstance().getMachineNames());
        String machinenametoremove = "cartoning 1";
        System.out.println("Removing machine by name: " + machinenametoremove);
        MachineManager.getInstance().removeMachineByName(machinenametoremove);
        System.out.println("\n");

        System.out.println("Getting all machine names after removing:");
        System.out.println(MachineManager.getInstance().getMachineNames());
        System.out.println("\n");

        System.out.println("Printing machine counts after removing:");
        MachineManager.getInstance().printMachineCount();
    }
}
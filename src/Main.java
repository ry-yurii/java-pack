import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.CartoningMachineFactory;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.FillerMachineFactory;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.CartoningMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.PackMachineFactory;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.PackagingMachineFactory;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        FillerMachineFactory fillerMachineFactory = new FillerMachineFactory(); //filler factory created
//        PackageMachine fillerMachine = fillerMachineFactory.create(); //object created
//
//        CartoningMachineFactory cartoningMachineFactory = new CartoningMachineFactory(); //cartoning factory created
//        PackageMachine cartoningMachine = cartoningMachineFactory.create(); //object created

        ArrayList<PackageMachine> machineList= new ArrayList<>();

        PackMachineFactory factory = new PackMachineFactory();

        machineList.add(factory.getCartooningMachine());
        machineList.add(factory.getFillerMachine());
        machineList.add(factory.getCartooningMachine());
        machineList.add(new CartoningMachine());


        machineList.forEach(machine -> machine.startMachine());
    }
}

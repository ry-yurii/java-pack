package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineManager;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;
import java.util.ArrayList;

// Implement a Singleton for MachineManager, which is responsible for managing all packaging machines.
public class MachineManager {
    // The MachineManager should contain a list of packaging machines and provide methods for adding and removing machines.
    public ArrayList<PackagingMachine> packageMachineList = new ArrayList<PackagingMachine>();
    private static MachineManager instance = null;
    private MachineManager() {}

    public static MachineManager getInstance() {
        if (instance == null) {
            instance = new MachineManager();
        }
        return instance;
    }

    //The MachineManager should contain a list of packaging machines and provide methods for adding and removing machines.
    public void addMachine(PackagingMachine packagingMachine) {
        packagingMachine.totalMachineCount++;
        packageMachineList.add(packagingMachine);
    }
    //The MachineManager should contain a list of packaging machines and provide methods for adding and removing machines.
    public void removeMachine() {
        PackagingMachine packagingMachine = packageMachineList.remove(-1);
        packagingMachine.totalMachineCount -= 1;
    }
    // The MachineManager should have a method startAllMachines() that starts each machine in the list.
    public void startAllMachines() {
        for (PackagingMachine machine : packageMachineList) {
            machine.startMachine();
        }
    }
}
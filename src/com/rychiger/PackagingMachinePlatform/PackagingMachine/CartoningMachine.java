package com.rychiger.PackagingMachinePlatform.PackagingMachine;
import com.rychiger.PackagingMachinePlatform.MachineManager.MachineManager;

// Create two concrete classes that inherit from PackagingMachine:
public class CartoningMachine extends PackagingMachine {
    public int count;
    public int materialThicknessInMm;

    // Each of these classes must implement the abstract method startMachine() and include specific logic for starting the machine.
    public MachineEnumStatus startMachine(){
        System.out.println("Cartoning machine is running now");
        return super.startMachine();
    }
}

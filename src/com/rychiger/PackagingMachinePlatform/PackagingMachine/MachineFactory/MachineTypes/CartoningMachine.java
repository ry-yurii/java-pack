package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineEnumStatus;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

// Create two concrete classes that inherit from PackagingMachine:
public class CartoningMachine implements PackageMachine {
    private int count;
    private int materialThicknessInMm;

    @Override
    public void startMachine() {
        count = 5;
        System.out.println("Cartoning machine is running now and has " + count + " count");
    }
    // Each of these classes must implement the abstract method startMachine() and include specific logic for starting the machine.
//    @Override
//    public MachineEnumStatus startMachine(){
//        System.out.println("Cartoning machine is running now");
//        return super.startMachine();
//    }
}

package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineEnumStatus;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackagingMachine;

public class FillerMachine implements PackageMachine {
//    public int weightInGrams;
//    public int count;


    @Override
    public void startMachine() {
        System.out.println("Filler machine is running now");
    }
//    @Override
//    public MachineEnumStatus startMachine(){
//        System.out.println("Filler machine is running now");
//        return super.startMachine();
//    }
//
//    @Override
//    public MachineEnumStatus stopMachine(){
//        System.out.println("Filler machine is stopping now");
//        return super.stopMachine();
//    }
}

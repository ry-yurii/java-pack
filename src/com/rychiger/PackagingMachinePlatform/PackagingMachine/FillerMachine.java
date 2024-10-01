package com.rychiger.PackagingMachinePlatform.PackagingMachine;

public class FillerMachine extends PackagingMachine {
    public int weightInGrams;
    public int count;

    public MachineEnumStatus startMachine(){
        System.out.println("Filler machine is running now");
        return super.startMachine();
    }
}

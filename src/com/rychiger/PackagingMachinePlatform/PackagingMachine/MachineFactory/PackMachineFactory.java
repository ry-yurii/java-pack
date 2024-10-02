package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.CartoningMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;

public class PackMachineFactory {
    public PackageMachine getFillerMachine() {
        FillerMachine machine = new FillerMachine();
        machine.startMachine();
        return machine;
    }

    public PackageMachine getCartooningMachine() {
        CartoningMachine machine = new CartoningMachine();
        machine.startMachine();
        return machine;
    }

    public PackageMachine getMachine(String type){
        switch (type){
            case "fillerMachine": return new FillerMachine();
            case "cartoonigMachine": return new CartoningMachine();
        }
        return null;
    }
}
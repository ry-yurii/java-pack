package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;

public class FillerMachineFactory extends PackagingMachineFactory {
    @Override
    protected PackageMachine createPackageMachine() {
        return new FillerMachine();
    }
}
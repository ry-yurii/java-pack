package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.CartoningMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory.MachineTypes.FillerMachine;
import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;

public class CartoningMachineFactory extends PackagingMachineFactory {
    @Override
    protected PackageMachine createPackageMachine() {
        return new CartoningMachine();
    }
}
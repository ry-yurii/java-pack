package com.rychiger.PackagingMachinePlatform.PackagingMachine.MachineFactory;

import com.rychiger.PackagingMachinePlatform.PackagingMachine.PackageMachine;

public abstract class PackagingMachineFactory {
    public PackageMachine create() {
        PackageMachine machine = createPackageMachine();
        machine.startMachine();
        return machine;
    }
    protected abstract PackageMachine createPackageMachine();
}
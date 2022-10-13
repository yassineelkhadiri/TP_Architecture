package com.directi.training.ocp.exercise;

public interface Resource {
    

    public abstract void markSlotFree(int resourceId);


    public abstract void markSlotBusy(int resourceId);


    public abstract int findFreeSlot();


}

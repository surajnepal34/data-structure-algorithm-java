package com.dsa.array;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainDuplicate {

    public boolean containDuplicate(int[] nums){
        if(nums.length == 0)
            return false;

        HashSet<Integer> numSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            if(numSet.contains(nums[i]))
                return true;
            else
                numSet.add(nums[i]);
        }

        return false;
    }
}

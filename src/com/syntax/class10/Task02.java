package com.syntax.class10;

public class Task02 {
public static void main(String[] args) {
	int[]nums= {1,2,4,5};
	int average=nums[0]+nums[1]+nums[2]+nums[3];
	System.out.println(average);
	int total=0;
	
	for(int num:nums) {
     total+=num;
System.out.println(total);
	}

}
}

package com.syntax.class10;

public class Task04 {
public static void main(String[] args) {
	int[] nums= {200,30,-1,900,56,787};
    int largest=nums[0];
	for(int i=0;i<nums.length;i++) {
		if(largest<nums[i]) {
			largest=nums[i];
		}
		
		}
		System.out.println(largest);	

}
}

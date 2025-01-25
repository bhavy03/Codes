package com.bhavya.Questions;

import java.util.ArrayList;
import java.util.List;

import static com.bhavya.Questions.Question1.swap;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 2, 3, 4, 1, 2};
    }

        //    public static int missingallnumber(int[] nums)
        public List<Integer> missingallnumber ( int[] nums){
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i];
                if (nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1);
                }
            }
            return ans;
        }

        static void swap ( int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }





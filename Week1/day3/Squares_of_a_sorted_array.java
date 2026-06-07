class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,f=0,s=nums.length-1,pos=s;
        int sor[]=new int[nums.length];
       while(s>=f){
        if(Math.pow(nums[f],2)>Math.pow(nums[s],2)){
            sor[pos]=nums[f]*nums[f];
            f++;
            pos--;
        }
        else
        {
            sor[pos]=nums[s]*nums[s];
            s--;
            pos--;
        }
       }
          return sor;  
            
        }
        
    }

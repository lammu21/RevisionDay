class Solution {
        public int[] searchRange(int[] nums, int target)
        {
            int n= nums.length;
            int start=0, end=n-1;

            int first =-1,last=-1;

            // int [] arr={-1,-1};

            first = findFirst(start,end,nums,target);
        // if We Find First i.e., target present in that array,
        //  then we Search For Last occurence of that Number..
            if(first == -1)
            {
            
                return new int[] {-1,-1};
            }
            
            last =findLast(start,end,nums,target);

            return new int []{first,last};
            
        }
        public static int findFirst(int start, int end , int[] nums, int target)
        {

            int first = -1;
            while(start<=end)
            {
                int mid = (start+end)/2;

                if(nums[mid] == target)
                {
                    first = mid;
                    end = mid-1;
                }
                else if (nums[mid] > target)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            return first;
        }
        public static int findLast(int start, int end , int[] nums, int target)
        {

            int last = -1;
            while(start<=end)
            {
                int mid = (start+end)/2;

                if(nums[mid] == target)
                {
                    last = mid;
                    start = mid+1;
                }
                else if (nums[mid] > target)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            return last;
        }
}
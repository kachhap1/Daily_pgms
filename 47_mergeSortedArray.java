class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
//         //brute force
//         for (int j = 0, i = m; j < n; j++) {
//             nums1[i] = nums2[j];
//             i++;
//         }
//         Arrays.sort(nums1);
//     }
// }
 //two_pointer
        int newArr[] = new int[m+n];
            int left=0; //nums1
            int right=0; //nums2
            int i=0;
            while(left<m && right<n)
            {if(nums1[left]<nums2[right])
            {
                newArr[i]=nums1[left];
                left++;
            }
            else{
                newArr[i]= nums2[right];
                right++;
            }
                i++;
            }
            //copy remianing eelements  of nums1 if any
            while(left<m){
                newArr[i]=nums1[left];
                i++; left++;
            }
            //copy remianig elements of nums2 if any
            while(right<n){
                newArr[i]=nums2[right];
                i++; right++;
            }
        
        //copying to original array nums1
        for(int k = 0;k<newArr.length;k++)
        {
            nums1[k] = newArr[k];
        }
}
}

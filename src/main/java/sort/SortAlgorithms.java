package sort;

public class SortAlgorithms
{
    public static int[] bubbleSort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] > nums[j])
                {
                    int temp = nums[j];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static int[] insertionSort(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            int tmp = nums[i];

            int j = i - 1;

            while( j >= 0 && nums[j] > tmp)
            {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = tmp;
        }

        return nums;
    }
}

package searchalgorithms;

public class SearchAlgorithms
{
    public static int linearSearch(int arr[], int target)
    {
        int index = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
                index = i;
        }


        return index;
    }

    public static int binarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (arr[middle] == target)
                return middle;
            else if (arr[middle] > target)
                end = middle - 1;
            else
                start = middle + 1;
        }


        return -1;
    }
}

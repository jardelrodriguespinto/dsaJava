package hashes;

public class Hashes
{
    // hash function for Strings

    public int hashCode(String str)
    {
        final int g = 31;

        int hashCode = 0;

        for (int i = 0; i < str.length(); i++)
        {
            hashCode = g * hashCode + str.charAt(i);
        }

        return hashCode;
    }
}

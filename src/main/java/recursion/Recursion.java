package recursion;

public class Recursion
{
    public static int regressiva(int num)
    {
        if (num == 0)
            return 0;

        System.out.println(num);

        return regressiva(num - 1);
    }

    public static int imprimePalavaraNVezes(String palavra, int qtd)
    {
        if (qtd == 0)
            return 0;

        System.out.println(palavra);

        return imprimePalavaraNVezes(palavra, qtd - 1);
    }

    public static int somaTodosNumerosAteN(int num)
    {
        if (num == 0)
            return 0;

        return num + somaTodosNumerosAteN(num - 1);
    }

    public static int somarTodosNumerosArray(int[] arr, int sum)
    {
        if (sum > arr.length - 1)
            return 0;

        return  arr[sum] + somarTodosNumerosArray(arr, ++sum);
    }

    public static boolean contains(String word, Character target, int sum)
    {
        if (sum > word.length() - 1)
            return false;
        else if (word.charAt(sum) == target)
            return true;

        return (word.charAt(sum) == target) && contains(word, target, ++sum);
    }

    public static int count(String word, int num, int sum)
    {
        if (sum >= word.length())
            return 0;

        return  num + count(word, num, ++sum);
    }

    public static int biggest(int[] arr, int num)
    {
        if (num == arr.length)
            return Integer.MIN_VALUE;

        return Math.max(arr[num], biggest(arr, num + 1));
    }

    public static int imprimirSomaIntevaloEntreAeB(int a, int b)
    {
        if (a > b)
            return 0;

        return  a + imprimirSomaIntevaloEntreAeB(a + 1 , b);
    }
}

public class MaxNumber
{
static int max(int a, int b)
{
return a > b ? a : b;
}
static double max(double a, double b)
{
return a > b ? a : b;
}
static double max(double a, double b, double c)
{
double max1 = max(a, b);
return max(max1, c);
}
public static void main(String[] args)
{
int intMax = max(2, 6);
double doubleMax = max(2.4, 6.4); double doubleMax1 = max(2.4, 8.6, 6.4); System.out.println(intMax); System.out.println(doubleMax); System.out.println(doubleMax1);
}
}

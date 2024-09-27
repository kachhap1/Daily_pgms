import java.util.*;
public class FractionalKnapsack {

    public static int kanpsack(int value[],int weight[],int W)
    {
        double ratio[][]=new double[weight.length][2];
        for(int i =0;i<weight.length;i++)
        {
            //0th col --> index ; 1st col --> ratio
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        //ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal=0;
        for(int i =ratio.length-1;i>=0;i--)
        {
            int indx =(int) ratio[i][0];
            if(capacity >= weight[indx])
            {
                finalVal = finalVal+value[indx];
                capacity = capacity-weight[indx];
            }
            else{
                finalVal += (ratio[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int value[] ={60,100,120};
        int weight[] = {10,20,30};
        int W=50;

        System.out.println(kanpsack(value,weight,W));
    }
}

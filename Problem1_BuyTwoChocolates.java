public class Problem1_BuyTwoChocolates {
    public static void main(String[] args) {

    }
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int smallest1 = prices[0];
        int secondSmallest = prices[1];
        int sum = smallest1 + secondSmallest;
        int ans = money - sum;
        if(sum > money){
            return money;
        }
        return ans;
    }
}

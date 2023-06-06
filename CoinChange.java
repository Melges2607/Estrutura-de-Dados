
public class CoinChange {
		public static void main(String [] Args) {
			int amount =5;
			int[] coins = {1,2,5};
			
			System.out.println(change(amount,coins));
		}
	    public  static int change(int amount, int[] coins) {
	        int[] dp = new int[amount + 1];
	        dp[0] = 1; // Base case: there is one way to make change for 0 amount (using no coins)

	        for (int coin : coins) {
	            for (int i = coin; i <= amount; i++) {
	                dp[i] += dp[i - coin];
	            }
	        }

	        return dp[amount];
	}
	}


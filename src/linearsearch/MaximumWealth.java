package linearsearch;

/*
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
 * i-th customer has in the j-th bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts.
 */

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 3, 6}, {7, 0, 9}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;

        for (int person = 0; person < accounts.length; person++) {

            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > result) {
                result = sum;
            }
        }

        return result;
    }
}

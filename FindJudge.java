// Time Complexity: O(V + E)
// Space Complexity: O(V)

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegrees = new int[n + 1];
        for (int[] edge : trust) {
            indegrees[edge[0]]--;
            indegrees[edge[1]]++;
        }

        for (int i = 1; i <= n; i++)
            if (indegrees[i] == n - 1)
                return i;

        return -1;
    }
}
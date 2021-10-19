package Leetcode.October;

import java.util.Arrays;

//https://leetcode-cn.com/problems/design-add-and-search-words-data-structure/
public class day19_211 {
}

class WordDictionary {
    static int N = 250000;
    static int[][] tr = new int[N][26];
    static boolean[] cnt = new boolean[N];
    static int idx;

    public WordDictionary() {
        for (int i = 0; i < idx; i++) {
            Arrays.fill(tr[i], 0);
        }
        Arrays.fill(cnt, false);
        idx = 0;
    }

    public void addWord(String word) {
        int p = 0;
        for (int i = 0; i < word.length(); i++) {
            int u = word.charAt(i) - 'a';
            if (tr[p][u] == 0) tr[p][u] = ++idx;
            p = tr[p][u];
        }
        cnt[p] = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, 0);
    }

    private boolean dfs(String word, int trIdx, int sIdx) {
        int n = word.length();
        if (sIdx == n) return cnt[trIdx];
        char c = word.charAt(sIdx);
        if (c == '.') {
            for (int j = 0; j < 26; j++) {
                if (tr[trIdx][j] != 0 && dfs(word, tr[trIdx][j], sIdx + 1)) return true;
            }
            return false;
        } else {
            int u = c - 'a';
            if (tr[trIdx][u] == 0) return false;
            return dfs(word, tr[trIdx][u], sIdx + 1);
        }
    }

}

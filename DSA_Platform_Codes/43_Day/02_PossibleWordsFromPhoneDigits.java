class Solution {
    static ArrayList<String> possibleWords(int a[], int N) {
        ArrayList<String> result = new ArrayList<>();
        if (N == 0) {
            return result;
        }

        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        generateWords(a, N, 0, "", result, letters);

        Collections.sort(result);

        return result;
    }

    static void generateWords(int[] a, int N, int current, String currentWord, ArrayList<String> result, String[] letters) {
        if (current == N) {
            result.add(currentWord);
            return;
        }

        String currentLetters = letters[a[current]];

        for (char letter : currentLetters.toCharArray()) {
            generateWords(a, N, current + 1, currentWord + letter, result, letters);
        }
    }
}

class Solution {
    public String reverseWords(String s) {
        // Step 1: remove extra spaces
        s = s.trim();
        
        // Step 2: split words
        String[] words = s.split("\\s+");
        
        // Step 3: reverse words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        return String.join(" ", words);
    }
}
// //class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.trim().split("\\s+");
//         StringBuilder result = new StringBuilder();

//         for (int i = words.length - 1; i >= 0; i--) {
//             result.append(words[i]);
//             if (i > 0)
//                 result.append(" ");
//         }

//         return result.toString();
//     }
// }
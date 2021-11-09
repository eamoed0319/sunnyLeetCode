package sunnyLeetCode.demo;

public class LongestPalindromicSubstring05 {
    public String longestPalindromicSubstring(String s) {

        int longestPalindromicSubstringLength = 1;
        String longestPalindromicSubstring = s.substring(0,1);
        if (s.length() == 1) {
            return s;
        } else if (s.length() == 2 && !isPalindromic(s)){
            return s.substring(0,1);
        }

        for (int i = 0; i < s.length(); i++){
            for (int j = 2; j <= s.length() - i; j++){
                if (j <= longestPalindromicSubstringLength){
                    continue;
                }
                String substring = s.substring(i, i + j);
                if (isPalindromic(substring)){
                    longestPalindromicSubstringLength = substring.length();
                    longestPalindromicSubstring = substring;
                }
            }
        }
        return longestPalindromicSubstring;
    }

    public boolean isPalindromic(String currentString){
        if (currentString.length() == 0){
            return false;
        }
        int strLength = currentString.length();
        for (int i = 0; i <= (strLength/2); i++){
            if (!(currentString.substring(i, i+1) == currentString.substring(strLength-i-1, strLength-i))){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring05 question = new LongestPalindromicSubstring05();
        System.out.println(question.longestPalindromicSubstring("jcwwnkwiajicysmdueefqjnrokunucidhgkswbgjkkrujkxkxeanrpjvpliomxztalhmvcldnqmkslkprhgtwlnsnygbzdvtdbsdzsdjggzgmhogknpfhtgjmclrkgfqdbiagwrqqcnagosnqrnpapxfrtrhzlyhszdtgkqggmewqmwugrbufiwfvtjhczqgcwpcyjioeacggiwyinpkyxrpxhglrtojgjmmswxnvirfsrbhmpqgjyyagjqfwkqkjkumywvgfutmiwihwnnhbfxcijaoiyxbdnrckexqfhsmmxflaneccyaoqoxfbaylcvvpfafsikebzcdufvhluldguwsmrtjaljpcjestranfrvgvytozxpcvnwquhnsxlmzkehwopgxvifajmrlwqiqylgxibnypxwpkggxevyfoxywfsfpjbzfxxysgxgwxrzkwdqlkrpajlltzqfqshdokibakkhydizsgwbygqulljqmtxkwepitsukwjlrrmsjptwabtlqytprkkuxtqdmptctkfabxsohrfrqvrbjfbppfkpthosveoppiywkkuoasefviegormlqkqlbhnhblkmglxcbszblfipsyumcrjrkrnzplkveznbtdbtlcptgswhiqsjugqrvujkzuwvoxbjremyxqqzxkgerhgtidsefyemtmstsznvgohexdgetqbhrxaomzsamapxhjibfvtbquhowyrwyxthpwvmfyyqsyibemnfbwkddtyoijzwfxhossylygxmnznpegtgvlrsreepkrcdgbujkghrgtsxwlvxrgrqxnvgqkppbkrxjupjfjcsfzepdemaulfetn"));
        System.out.println("abcda:a:" + question.longestPalindromicSubstring("abcda"));
        System.out.println("ccc:ccc:" + question.longestPalindromicSubstring("ccc"));
        System.out.println("bb:bb:" + question.longestPalindromicSubstring("bb"));
        System.out.println("aacabdkacaa:aca:" + question.longestPalindromicSubstring("aacabdkacaa"));
        System.out.println("ac:a:" + question.longestPalindromicSubstring("ac"));
        System.out.println("a:a:" + question.longestPalindromicSubstring("a"));
        System.out.println("babad:bab:" + question.longestPalindromicSubstring("babad"));
        System.out.println("cbbd:bb:" + question.longestPalindromicSubstring("cbbd"));
    }
}


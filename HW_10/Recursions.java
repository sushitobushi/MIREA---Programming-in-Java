public class Recursions {
    public String Palindrom(final String s) {
        if (1 == s.length()) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (2 == s.length()) {
                    return "YES";
                }
                return this.Palindrom(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }

    public int WithoutTwoZero(final int a, final int b) {
        if (a > b + 1) {
            return 0;
        }
        if (0 == a || 0 == b) {
            return 1;
        }
        return this.WithoutTwoZero(a, b - 1) + this.WithoutTwoZero(a - 1, b - 1);
    }

    public int Reverse(final int n, final int i){
        return (0 == n) ? i : this.Reverse( n/10, i*10 + n%10 );
    }
}

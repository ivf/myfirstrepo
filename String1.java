public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        String out1 = out.substring(0, 2);
        String out2 = out.substring(2, 4);
        return out1 + word + out2;
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2, str.length());
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() <= 2) return str;
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b) {
        String shortStr;
        String longStr;

        if (a.length() > b.length()){
            longStr = a;
            shortStr = b;
        }
        else{
            longStr = b;
            shortStr = a;
        }

        return shortStr + longStr + shortStr;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        if (front)  return str.substring(0, 1);
        else        return str.substring(str.length()-1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length()-1);
    }

    public String middleTwo(String str) {
        int halfLength = str.length() / 2;
        return str.substring(halfLength-1, halfLength+1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        if (str.length() <= n) return str+str;
        return str.substring(0, n) + str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        int pos = str.length() - index;
        if (pos < 2 || index < 0)
            return str.substring(0, 2);
        return str.substring(index, index+2);
    }

    public String middleThree(String str) {
        int mid = str.length()/2 - 1;
        return str.substring(mid, mid+3);
    }

    public boolean hasBad(String str) {
        int strLength = str.length();
        if (strLength < 3) {
            return false;
        } else if (strLength == 3) {
            return str.equals("bad");
        } else if (strLength >3) {
            return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        int strLength = str.length();
        if (strLength >= 2) {
            return "" + str.charAt(0) + str.charAt(1);
        } else if (strLength == 1) {
            return str + '@';
        } else {
            return "@@";
        }
    }

    public String lastChars(String a, String b) {
        char aChar = (a.length() == 0) ? '@' : a.charAt(0);
        char bChar = (b.length() == 0) ? '@' : b.charAt(b.length()-1);
        return "" + aChar + bChar;
    }

    public String conCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if (aLength == 0 || bLength == 0) {
            return a + b;
        } else if (a.charAt(aLength-1) == b.charAt(0)) {
            return a.substring(0, aLength - 1) + b;
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return str;
        } else {
            return str.substring(0, strLength-2) + str.charAt(strLength-1) + str.charAt(strLength-2);
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() >= 2 && str.endsWith(str.substring(0, 2))) {
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength == bLength) {
            return a + b;
        } else if (aLength > bLength) {
            return a.substring(aLength-bLength) + b;
        } else {
            return a + b.substring(bLength-aLength);
        }
    }

    public String extraFront(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            String strSub = str.substring(0, 2);
            return strSub + strSub + strSub;
        }
    }

    public String without2(String str) {
        int strLength = str.length();
        if (strLength == 2) {
            return "";
        } else if (strLength > 2 && str.endsWith(str.substring(0, 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() >= 2) {
            if (sb.charAt(1) != 'b') {
                sb.deleteCharAt(1);
            }
            if (sb.charAt(0) != 'a') {
                sb.deleteCharAt(0);
            }
        }
        return sb.toString();
    }

    public String startWord(String str, String word) {
        if (str.length() > 0 && str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public String withoutX2(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 1 && sb.charAt(1) == 'x') {
            sb.deleteCharAt(1);
        }
        if (sb.length() > 0 && sb.charAt(0) == 'x') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

}

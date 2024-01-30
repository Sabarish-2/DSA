
import java.util.*;

class solution {

    // A program which prints numbers with a space in permutaion from 1 to 10000.
    // It should print like 1 2 3 ... 51 52 53 ... 10000
    public static void main(String[] args) {
        // Write your code here
        for (int i = 1; i <= 100; i++)
        {
            System.out.print("1 " + i + " ");
        }
    }

    
}    

//     public static String addBinary(String a, String b) {
//         int len1 = a.length(), len2 = b.length(), len = (len1 > len2)? len1 : len2;
//         char[] ans = new char[len], as = a.toCharArray(), bs = b.toCharArray();
//         boolean flag = false;
//         while ((len1 > 0) && len2 > 0)
//         {
//             len1--;
//             len2--;
//             len--;
//             if (as[len1] == '1' && (bs[len2] == '1') )
//             {
//                 if (flag)
//                 {
//                     ans[len] = '1';
//                 }
//                 else
//                 {
//                     ans[len] = '0';
//                     flag = true;
//                 }
//             }
//             else if (as[len1] == '1' || (bs[len2] == '1'))
//             {

//                 if (flag)
//                 {
//                     ans[len] = '0';

//                 }
//                 else
//                 {
//                     ans[len] = '1';
//                 }
//             }
//             else
//             {
//                 if (flag)
//                 {
//                     flag = false;
//                     ans[len] = '1';
//                 }
//                 else
//                 {
//                     ans[len] = '0';
//                 }
//             }
//         }
//         while(len1 > 0)
//         {
//             len1--;
//             len--;
//             if (flag && as[len1] == '1')
//                 ans[len] = '0';
//             else if (flag)
//             {
//                 ans[len] = '1';
//                 flag = false;
//             }
//             else
//                 ans[len] = '0';
//         }

//         while(len2 > 0)

//         {

//             len2--;

//             len--;

//             if (flag && bs[len2] == '1')

//                 ans[len] = '0';

//             else if (flag)

//             {

//                 ans[len] = '1';

//                 flag = false;

//             }

//             else

//                 ans[len] = '0';

//         }
//         String s = "";
//         if (flag)
//         {
//             s += "1";
//         }
//         for (char ch: ans)
//         {
//             s += ch;
//         }
//         // System.out.println(ans.toString());
//         // System.out.println(s);
//         return (s);
// }
//     public static void main(String[] args) {
        
//         String a = "100", b = "11011";
//         System.out.println(addBinary(a, b));
//         // System.out.println();
//     }
// }
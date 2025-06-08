//gfg Add Binary Strings
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);  // current bit
            carry = sum / 2;         // next carry
        }

        return result.reverse().toString();
    }
}

// User function Template for Java
// class Solution {
//     public String addBinary(String s1, String s2) {
//         // code here
//         StringBuilder s=new StringBuilder();
//         s1=s1.trim();
//         s2=s2.trim();
//         int l1=s1.length()-1;
//         int l2=s2.length()-1;
//         int carry=0;
//         while(l1>=0 && l2>=0){
//             char c1=s1.charAt(l1);
//             char c2=s2.charAt(l2);
//             if(carry==0){
//               if((c1=='1' && c2=='0')||(c1=='0' && c2=='1')){
//                   s.append('1');
//               }
//               else if((c1=='0' && c2=='0')){
//                   s.append('0');
//               }
//               else{
//                   s.append('0');
//                   carry=1;
//               }
//             }
//             else{
//               if((c1=='1' && c2=='0')||(c1=='0' && c2=='1')){
//                   s.append('0');
//                   carry=1;
//               }  
//               else if((c1=='0' && c2=='0')){
//                   s.append('1');
//                   carry=0;
//               }
//               else{
//                   s.append('1');
//                   carry=1;
//               }
//             }
//             l1--;
//             l2--;
//         }
        
//         while(l2>=0){
//             char c1=s2.charAt(l2);
//             if(carry==1){
//                 if(c1=='1'){
//                     s.append('0');
//                     carry=1;
//                 }
//                 else{
//                     s.append('1');
//                     carry=0;
//                 }
//             }
//             else s.append(c1);
//             l2--;
//         }
//         while(l1>=0){
//             char c1=s1.charAt(l1);
//             if(carry==1){
//                 if(c1=='1'){
//                     s.append('0');
//                     carry=1;
//                 }
//                 else{
//                     s.append('1');
//                     carry=0;
//                 }
//             }
//             else s.append(c1);
//             l1--;
//         }
//         if(carry==1) s.append('1');
        
//         while(s.length()>1 && s.charAt(s.length()-1)=='0') s.deleteCharAt(s.length()-1);
//         return s.reverse().toString();
//     }
// }

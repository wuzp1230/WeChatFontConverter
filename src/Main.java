public class Main {

    public static void main(String[] args) {
        String origin = "Freedom is one of the greatest happiness of god to mankind.";
        StringBuffer sb = new StringBuffer();
        String[] template = {"\uD835\uDCD0" , "\uD835\uDCD1" , "\uD835\uDCD2" , "\uD835\uDCD3" , "\uD835\uDCD4" , "\uD835\uDCD5" , "\uD835\uDCD6" , "\uD835\uDCD7" , "\uD835\uDCD8" , "\uD835\uDCD9" , "\uD835\uDCDA" , "\uD835\uDCDB" , "\uD835\uDCDC" , "\uD835\uDCDD" , "\uD835\uDCDE" , "\uD835\uDCDF" , "\uD835\uDCE0" , "\uD835\uDCE1" , "\uD835\uDCE2" , "\uD835\uDCE3" , "\uD835\uDCE4" , "\uD835\uDCE5" , "\uD835\uDCE6" , "\uD835\uDCE7" , "\uD835\uDCE8" , "\uD835\uDCE9" , "\uD835\uDCEA" , "\uD835\uDCEB" , "\uD835\uDCEC" , "\uD835\uDCED" , "\uD835\uDCEE" , "\uD835\uDCEF" , "\uD835\uDCF0" , "\uD835\uDCF1" , "\uD835\uDCF2" , "\uD835\uDCF3" , "\uD835\uDCF4" , "\uD835\uDCF5" , "\uD835\uDCF6" , "\uD835\uDCF7" , "\uD835\uDCF8" , "\uD835\uDCF9" , "\uD835\uDCFA" , "\uD835\uDCFB" , "\uD835\uDCFC" , "\uD835\uDCFD" , "\uD835\uDCFE" , "\uD835\uDCFF" , "\uD835\uDD00" , "\uD835\uDD01" , "\uD835\uDD02" , "\uD835\uDD03"};
        int originLength = origin.length();
        int templateLength = template.length;
        //ASCII码转换偏移
        int ASCIIOffset = 65;
        //打印字符集
        /*for (int i = 0;i < templateLength;i++){
            System.out.print(template[i]);
        }*/
        //打印原型
        System.out.println(origin);
        //转换原型
        for (int i = 0;i < originLength; i++){
            int currentletter = (int)origin.charAt(i) - ASCIIOffset;
            if(currentletter >= 32 && currentletter < 58){
                currentletter -= 6;
            }
            //System.out.print(currentletter + " ");
            if(currentletter < templateLength && currentletter >= 0)
                sb.append(template[currentletter]);
            else sb.append(origin.charAt(i));
        }
        //输出转换后的字体
        System.out.println(sb);
    }
}

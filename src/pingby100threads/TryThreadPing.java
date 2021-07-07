/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingby100threads;



/**
 *
 * @author dungnt
 */
public class TryThreadPing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int n=1;
        int m=1048576;
        
        System.out.println("--------2-----------");
        System.out.println(System.currentTimeMillis());
        String tiento="[xxxx:xxxx:2";
        String hauto="0:xxxx:xxxx:xxxx:xxxx]";
        
        MT[] t1 = new  MT[m];
        StringBuilder sb;
        for (int i = 0; i < m; i++) {
            sb = new StringBuilder(Integer.toHexString(i));//Integer.toHexString(m);//"[2405:4802:25" + i + ":f80:6ce9:671e:c41d:eb43]";
            if(sb.length()==1)
                sb.insert(0, "0000");
            else if(sb.length()==2)
                sb.insert(0, "000");
            else if(sb.length()==3)
                sb.insert(0, "00");
            else if(sb.length()==4)
                sb.insert(0, "0");
            
            sb.insert(2, ":");
            sb.insert(0, tiento);
            sb.append(hauto);
           
            t1[i] = new MT(sb.toString());
            t1[i].start();
            
        }
        
        //------------------------------------------------------------------------------
        
        System.out.println("--------1-----------");
        System.out.println(System.currentTimeMillis());
        tiento="[xxxx:xxxx:1";
        hauto="0:xxxx:xxxx:xxxx:xxxx]";
        
        
        MT[] t2 = new  MT[m];

        for (int i = 0; i < m; i++) {
            sb = new StringBuilder(Integer.toHexString(i));//Integer.toHexString(m);//"[2405:4802:25" + i + ":f80:6ce9:671e:c41d:eb43]";
            if(sb.length()==1)
                sb.insert(0, "0000");
            else if(sb.length()==2)
                sb.insert(0, "000");
            else if(sb.length()==3)
                sb.insert(0, "00");
            else if(sb.length()==4)
                sb.insert(0, "0");
            
            sb.insert(2, ":");
            sb.insert(0, tiento);
            sb.append(hauto);
            
            t2[i] = new MT(sb.toString());
            t2[i].start();
        }
        
        //------------------------------------------------------------------------------
        System.out.println("--------0-----------");
        System.out.println(System.currentTimeMillis());
        tiento="[xxxx:xxxx:0";
        hauto="0:xxxx:xxxx:xxxx:xxxx]";
        
        MT[] t3 = new  MT[m];

        for (int i = 0; i < m; i++) {
            sb = new StringBuilder(Integer.toHexString(i));//Integer.toHexString(m);//"[2405:4802:25" + i + ":f80:6ce9:671e:c41d:eb43]";
            if(sb.length()==1)
                sb.insert(0, "0000");
            else if(sb.length()==2)
                sb.insert(0, "000");
            else if(sb.length()==3)
                sb.insert(0, "00");
            else if(sb.length()==4)
                sb.insert(0, "0");
            
            sb.insert(2, ":");
            sb.insert(0, tiento);
            sb.append(hauto);
            
            t3[i] = new MT(sb.toString());
            t3[i].start();
        }
        
        //------------------------------------------------------------------------------
        System.out.println("--------3-----------");
        System.out.println(System.currentTimeMillis());
        tiento="[xxxx:xxxx:3";
        hauto="0:xxxx:xxxx:xxxx:xxxx]";
        
        MT[] t4 = new  MT[m];

        for (int i = 0; i < m; i++) {
            sb = new StringBuilder(Integer.toHexString(i));//Integer.toHexString(m);//"[2405:4802:25" + i + ":f80:6ce9:671e:c41d:eb43]";
            if(sb.length()==1)
                sb.insert(0, "0000");
            else if(sb.length()==2)
                sb.insert(0, "000");
            else if(sb.length()==3)
                sb.insert(0, "00");
            else if(sb.length()==4)
                sb.insert(0, "0");
            
            sb.insert(2, ":");
            sb.insert(0, tiento);
            sb.append(hauto);
            
            t4[i] = new MT(sb.toString());
            t4[i].start();
        }
    }
    
    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }
    public static String addChar2(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }
}
